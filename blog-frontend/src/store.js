import { createStore}   from 'redux';
import { TEST_POSTS } from './TestData';

let initialState = {
    posts: []
}
export async function loadPosts() {
    const fetchRequest = await fetch("/api/blog/post", {
        method: "GET"
    });
    const posts = await fetchRequest.json();
    initialState.posts = posts;
}
export async function deletePost(id) {
    return fetch(`/api/blog/post/${id}`, {
        method: "DELETE"
    });
}

export const postsReducer = (state = initialState, action) => {
  switch (action.type) {
    case "SET_POSTS":
      return { ...state, posts: action.payload };
    case "ADD_POST":
      return { ...state, posts: [...state.posts, action.payload] };
    case "DELETE_POST":
      // just synchronously remove from state
      return { ...state, posts: state.posts.filter(p => p.id !== action.payload) };
    case "UPDATE_POST":
      return {
        ...state,
        posts: state.posts.map(p =>
          p.id === action.payload.id ? { ...p, content: action.payload.content } : p
        )
      };
    default:
      return state;
  }
};

const store = createStore(postsReducer);
export default store;