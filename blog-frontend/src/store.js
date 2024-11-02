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
    switch(action.type) {
        case "ADD_POST":
            return {...state, posts: [...state.posts, action.payload]};
        case 'DELETE_POST':
            deletePost(action.payload).then(res => {
                if(res.ok) {
                    loadPosts();
                    const modifiedList = state.posts.filter(post => post.id !== action.payload);
                    return {...state,posts: [...modifiedList]};
                }
            });
        case 'UPDATE_POST':
            // payload to have new content and id
            // updated date will be modified here
            console.log("About to update posts");
            const {content, id} = action.payload;
            state.posts.forEach(p => {
                if(p.id === Math.abs(id)) {
                    p.content = content;
                }
            })
            return {...state, posts: [...state.posts]};
        default:
            return state;
            
    }

}
const store = createStore(postsReducer);
export default store;