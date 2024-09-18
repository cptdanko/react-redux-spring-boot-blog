import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useLocation, useParams } from "react-router-dom";

export const ViewPost = (props) => {

    const [content, setContent] = useState("");
    const dispatch = useDispatch();

    const { id } = useParams();
    const location = useLocation();

    const myParam = new URLSearchParams(location.search).get('canEdit');
    const canEdit = JSON.parse(myParam);
    // const {canEdit } = props;
    useEffect(() => {
        if(content == null || content.length < 1) {
            setContent(currentPost.content);
        }
    });
    const blogposts = useSelector(state => state.posts);
    const currentPost = blogposts.filter(p => p.id === Math.abs(id))[0];

    const editBlogPost = (e) => {
        e.preventDefault();
        setContent(e.target.value);
    }

    const updatePost = (e) => {
        e.preventDefault();
        dispatch({ type: 'UPDATE_POST', payload: { id: id, content: content } });
    }

    return (
        <div className="Post-detail">
            <div className="Blog-post-title">
                <span className="Name">{currentPost.title}</span>
                <span className="Author">by {currentPost.authorName} on {currentPost.pubDate}</span>
            </div>
            <div className="Full-content">
                {canEdit ?
                    <div>
                        <div>
                            <button onClick={updatePost}>Save</button>
                        </div>
                        <div>
                            <textarea className="Textarea" value={content} 
                            rows={10} 
                            onChange={editBlogPost}>
                            </textarea>
                        </div>
                    </div>
                    : <div className="Textarea">
                        {currentPost.content}
                    </div>
                }

            </div>
        </div>
    )
} 