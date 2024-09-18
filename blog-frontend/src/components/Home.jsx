import { Link } from "react-router-dom"

export const Home = () => {

    const createNewPost = () => {
        alert("Coming soon....")
    }
    return (
        <div>
            <h1> Home to the best blog engine</h1>
            <div>
                <button onClick={createNewPost}>Create new post</button>
                <button><Link to="/blogs">View existing posts </Link></button>
            </div>
        </div>

    )
}