package com.darkdevil.practicespringboot.example1.controller;

import com.darkdevil.practicespringboot.example1.model.Posts;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;


//    https://www.baeldung.com/spring-5-webclient
@RestController
@RequestMapping(value="dark/api/v1")
public class Example1Controller {

    @Autowired
    Environment env;

    @Autowired
    private WebClient webClient;

    @GetMapping(value="integrate/posts/{postId}")
    public Posts getPostById(@PathVariable int postId){
        try{
//            Posts posts = webClient
//                    .get()
//                    .uri("https://jsonplaceholder.typicode.com/posts/"+postId)
//                    .retrieve()
//                    .bodyToMono(Posts.class)
//                    .block();
// https://jsonplaceholder.typicode.com/posts/{postId}

            String str = webClient
                    .get()
                    .uri("https://jsonplaceholder.typicode.com/posts/{postId}", postId)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            Gson g = new Gson();
            Posts posts = g.fromJson(str, Posts.class);

            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(posts);

            System.out.println(json);

            return posts;
        }
        catch (Exception e){
            System.out.println("Error:" + e);
            Posts posts = new Posts();
            posts.setBody(e.getLocalizedMessage());
            return posts;
        }

    }

    @GetMapping(value="integrate/posts")
    public List<Posts> getPostList(){
        List<Posts> postsList = (List<Posts>) webClient
                .get()
                .uri("https://jsonplaceholder.typicode.com/posts")
                .retrieve()
                .bodyToMono(List.class)
                .block();
        return postsList;
    }

    @PostMapping(value="integrate/posts")
    public Posts createPost(@RequestBody Posts posts){

        try{
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(posts);

            System.out.println("JSON: ");
            System.out.println(json);

            Posts retPosts = webClient
                    .post()
                    .uri("https://jsonplaceholder.typicode.com/posts")
                    .bodyValue(posts)
                    .retrieve()
                    .bodyToMono(Posts.class)
                    .block();

            return retPosts;
        }
        catch (Exception e){
            System.out.println("Error: " + e);
            e.printStackTrace();
            return null;
        }

    }

    @PutMapping(value="integrate/posts")
    public Posts updatePost(@RequestBody Posts posts){
        Posts retPosts = webClient
                .put()
                .uri("https://jsonplaceholder.typicode.com/posts/"+posts.getId())
                .body(Mono.just(posts), Posts.class)
                .retrieve()
                .bodyToMono(Posts.class)
                .block();

        return retPosts;
    }

    @GetMapping("ex1")
    public String ex1(){

        return env.getProperty("send-message");
    }
}
