package com.mydaytodo.blog_backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogPost {
    private String ID;
    private String title;
    private String content;
    private Date datePublished;
    private String authorId;
}
