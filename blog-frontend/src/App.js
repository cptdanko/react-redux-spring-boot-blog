import logo from './logo.svg';
import './App.css';
import { Login } from './LoginScreen';
import { BlogPosts } from './components/BlogPostList';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import { ViewPost } from './components/ViewPost';
import Navbar from './Navbar';
import { Home } from './components/Home';
import { loadPosts } from './store';

function App() {
  loadPosts();
  
  return (
    <div className="App" style={{ backgroundColor: 'beige' }}>
      <div className='Dashboard'>
        <Login />
        <div>
          <Router>
            <Navbar />
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/blogs" element={<BlogPosts />} />
              <Route path="/blogs/:id" element={<ViewPost />} />
            </Routes>
          </Router>
        </div>
      </div>
    </div>
  );
}

export default App;
