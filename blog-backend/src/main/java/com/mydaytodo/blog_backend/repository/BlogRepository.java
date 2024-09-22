package com.mydaytodo.blog_backend.repository;

import com.mydaytodo.blog_backend.model.BlogPost;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface BlogRepository extends ReactiveCrudRepository<BlogPost, String> {

    @Query("Select * from blogpost where username = :username")
    public Flux<BlogPost> findByUsername(String username);
}
