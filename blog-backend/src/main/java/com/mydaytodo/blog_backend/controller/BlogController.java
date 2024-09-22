package com.mydaytodo.blog_backend.controller;

import com.mydaytodo.blog_backend.model.BlogPost;
import com.mydaytodo.blog_backend.service.BlogService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<BlogPost> addNewPost(@RequestBody @Valid BlogPost post) {
        return blogService.createNewPost(post);
    }
    @GetMapping("/addMockPosts")
    public Mono<BlogPost> createDummyPost() {
        BlogPost post = BlogPost.builder()
                .ID("BLG_123")
                .title("New Blog")
                .content("Lots of new content to keep coming and coming soon")
                .authorId("bhuman@mydaytodo.com")
                .build();
        return blogService.createNewPost(post);
    }
    @GetMapping("/post/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<BlogPost> getBlogPost(@PathVariable("id") String id) {
        return blogService.getBlogPostBy(id); // to be completed later
    }

    @GetMapping("/post/")
    @ResponseStatus(HttpStatus.OK)
    public Flux<BlogPost> getAllPosts() {
        return blogService.findAll(); // to be completed later
    }
    @PatchMapping("/post/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<BlogPost> updatePost(@PathVariable("id") String id, @RequestBody @Valid BlogPost post) {
        return blogService.updatePost(id, post);
    }
    @DeleteMapping("/post/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<BlogPost> deletePost(@PathVariable("id") String id) {
        return blogService.getBlogPostBy(id);
    }

    @GetMapping("/post/{username}")
    @ResponseStatus(HttpStatus.OK)
    public Flux<BlogPost> getPostsByUsername(@PathVariable("username") String username) {
        return blogService.getPostsByUser(username);
    }
}
