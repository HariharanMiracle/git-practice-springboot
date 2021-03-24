package com.darkdevil.practicespringboot.example1.controller;

import com.darkdevil.practicespringboot.example1.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


//    https://www.baeldung.com/spring-5-webclient
@RestController
@RequestMapping(value="dark/api/v1")
public class Example1Controller {

    @Autowired
    private WebClient.Builder builder;

    @GetMapping(value="integrate/posts/{postId}")
    public Posts getPostById(@PathVariable int postId){
        Posts posts = builder.build()
                .get()
                .uri("https://jsonplaceholder.typicode.com/posts/"+postId)
                .retrieve()
                .bodyToMono(Posts.class)
                .block();
        return posts;
    }

    @GetMapping(value="integrate/posts")
    public List<Posts> getPostList(){
        List<Posts> postsList = (List<Posts>) builder.build()
                .get()
                .uri("https://jsonplaceholder.typicode.com/posts")
                .retrieve()
                .bodyToMono(List.class)
                .block();
        return postsList;
    }

    @PostMapping(value="integrate/posts")
    public Posts createPost(@RequestBody Posts posts){
        Posts retPosts = builder.build()
                .post()
                .uri("https://jsonplaceholder.typicode.com/posts")
                .bodyValue(posts)
                .retrieve()
                .bodyToMono(Posts.class)
                .block();

        return retPosts;
    }

    @PutMapping(value="integrate/posts")
    public Posts updatePost(@RequestBody Posts posts){
        Posts retPosts = builder.build()
                .put()
                .uri("https://jsonplaceholder.typicode.com/posts/"+posts.getId())
                .bodyValue(posts)
                .retrieve()
                .bodyToMono(Posts.class)
                .block();

        return retPosts;
    }

}
