export const NewPost = () => {
    const [content, setContent] = useState("");
    
    return (
        <div className="Full-content">
            <div>
                <textarea className="Textarea" value={content}
                    rows={10}
                    onChange={editBlogPost}>
                </textarea>
            </div>
        </div>
    )
}