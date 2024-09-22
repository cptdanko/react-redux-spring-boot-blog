package com.mydaytodo.blog_backend.service;

import com.mydaytodo.blog_backend.model.BlogPost;
import com.mydaytodo.blog_backend.repository.BlogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }
    public Mono<BlogPost> createNewPost(BlogPost blogPost) {
        return blogRepository.save(blogPost);
    }

    public Mono<BlogPost> getBlogPostBy(String id) {
        return blogRepository.findById(id);
    }

    public Flux<BlogPost> findAll(){
        return blogRepository.findAll();
    }
    public Flux<BlogPost> getPostsByUser(String username) {
        return blogRepository.findByUsername(username);
    }

    public Mono<Void> deletePost(String id) {
        return blogRepository.deleteById(id);
    }
    public Mono<BlogPost> updatePost(String id, BlogPost body) {
        return blogRepository.findById(id)
                .flatMap(currentPost -> {
                    currentPost.setTitle(body.getTitle());
                    currentPost.setContent(body.getContent());
                   return blogRepository.save(currentPost);
                });
    }
}

