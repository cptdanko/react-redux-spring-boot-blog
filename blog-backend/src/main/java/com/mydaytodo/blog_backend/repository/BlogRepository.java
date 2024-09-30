package com.mydaytodo.blog_backend.repository;

import com.mydaytodo.blog_backend.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<BlogPost, String> {
    @Query(value = "select * from blogpost where username = :username", nativeQuery = true)
    List<BlogPost> findPostsByUser(@Param("username") String username);
}
