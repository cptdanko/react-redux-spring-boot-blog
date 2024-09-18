import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => (
    <div className='Login'>
        <Link to="/">Home</Link>
        &nbsp;&nbsp;&nbsp;
        <Link to="/blogs">Posts</Link>
    </div>
);

export default Navbar;