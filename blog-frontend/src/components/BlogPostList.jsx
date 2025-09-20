import { useDispatch, useSelector } from "react-redux";
import '../App.css';
import { Link } from "react-router-dom";
import { useEffect } from "react";
import { loadPosts } from "../store";

export const BlogPosts = () => {
    const blogposts = useSelector(state => state.posts);
    const dispatch = useDispatch();

    // load posts once
    useEffect(() => {
        (async () => {
            const resp = await fetch("/api/blog/post");
            const posts = await resp.json();
            dispatch({ type: "SET_POSTS", payload: posts });
        })();
    }, [dispatch]);

    // delete handler does the fetch first, then dispatches
    const handleDelete = async (id) => {
        const res = await fetch(`/api/blog/post/${id}`, { method: "DELETE" });
        if (res.ok) {
            dispatch({ type: "DELETE_POST", payload: id });
        }
    };
    return (
        <div id="postList" className='Post-list'>
            {blogposts.map(post => {
                return (
                    <div className="Blog-post" key={post.id}>
                        <div className="Blog-post-title">
                            <span className="Name">{post.title}</span>
                            <span className="Author">by {post.username} on {post.pubDate}</span>
                        </div>
                        <p className="Content">{post.content}</p>
                        <div>
                            <button>
                                <Link to={`/blogs/${post.id}?canEdit=false`}>
                                    View Post
                                </Link>
                            </button>
                            <button>
                                <Link to={`/blogs/${post.id}?canEdit=true`}>
                                    Edit Post
                                </Link>
                            </button>
                           <button onClick={() => handleDelete(post.id)}>Delete</button>
                        </div>
                    </div>
                )
            })
            }
        </div>
    )
}