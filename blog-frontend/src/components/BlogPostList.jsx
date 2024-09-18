import { useDispatch, useSelector } from "react-redux";
import '../App.css';
import { ViewPost } from "./ViewPost";
import { Link } from "react-router-dom";

export const BlogPosts = () => {
    
    const blogposts = useSelector(state => state.posts);
    const dispatch = useDispatch();

    const deletePost = (id) => {
        dispatch({type: "DELETE_POST", payload: id});
    }
    return (
        <div id="postList" className='Post-list'>
            {blogposts.map(post => {
                return (
                    <div className="Blog-post" key={post.id}>
                        <div className="Blog-post-title">
                            <span className="Name">{post.title}</span>
                            <span className="Author">by {post.authorName} on {post.pubDate}</span>
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
                            <button onClick={() => deletePost(post.id)}>Delete</button>
                        </div>
                    </div>
                )
            })
            }
        </div>
    )
}