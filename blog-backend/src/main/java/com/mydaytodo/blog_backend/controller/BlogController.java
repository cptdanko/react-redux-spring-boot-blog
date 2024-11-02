package com.mydaytodo.blog_backend.controller;

import com.mydaytodo.blog_backend.model.BlogPost;
import com.mydaytodo.blog_backend.service.BlogService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost addNewPost(@RequestBody @Valid BlogPost post) {
        return blogService.createNewPost(post);
    }

    @GetMapping("/addMockPosts")
    public BlogPost createDummyPost() {
        BlogPost post = BlogPost.builder()
                .title("New Blog")
                .content("Lots of new content to keep coming and coming soon")
                .username("bhuman@mydaytodo.com")
                .build();
        return blogService.createNewPost(post);
    }
    @GetMapping("/post/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BlogPost getBlogPost(@PathVariable("id") String id) {
        return blogService.getBlogPostBy(id); // to be completed later
    }

    @GetMapping("/post")
    @ResponseStatus(HttpStatus.OK)
    public List<BlogPost> getAllPosts() {
        return blogService.findAll(); // to be completed later
    }

    @PatchMapping("/post/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public BlogPost updatePost(@PathVariable("id") String id, @RequestBody @Valid BlogPost post) {
        return blogService.updatePost(id, post);
    }
    @DeleteMapping("/post/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable("id") String id) {
        blogService.deletePost(id);
    }

    @GetMapping("/post/by/{username}")
    @ResponseStatus(HttpStatus.OK)
    public List<BlogPost> getPostsByUsername(@PathVariable("username") String username) {
        return blogService.getPostsByUser(username);
    }
}
