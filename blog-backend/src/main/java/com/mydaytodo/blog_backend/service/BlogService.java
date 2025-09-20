package com.mydaytodo.blog_backend.service;

import com.mydaytodo.blog_backend.model.BlogPost;
import com.mydaytodo.blog_backend.repository.BlogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }
    public BlogPost createNewPost(BlogPost blogPost) {
        blogPost.setDatePublished(new Date());
        return blogRepository.save(blogPost);
    }

    public BlogPost getBlogPostBy(String id) {
        return blogRepository.findById(id).orElseThrow();
    }

    public List<BlogPost> findAll(){
        return blogRepository.findAll();
    }
    public List<BlogPost> getPostsByUser(String username) {
        return blogRepository.findPostsByUser(username);
    }

    public void deletePost(String id) {
        blogRepository.deleteById(id);
    }

    public BlogPost updatePost(String id, BlogPost body) {
        BlogPost post = blogRepository.findById(id).orElseThrow();
        if(body.getContent() != null) {
            post.setContent(body.getContent());
        }
        if(body.getTitle() != null) {
            post.setTitle(body.getTitle());
        }
        return blogRepository.save(post);
    }
}

