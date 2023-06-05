package com.codeup.codeupspringblog.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody

    public String postsIndex() {

        return "<p>" + "posts index page" + "</p>";


    }


    @GetMapping("/posts/{id}")
    @ResponseBody


    public String individualPost(@PathVariable long id) {

        return "<p>" + "view an individual post" + " " + Long.toString(id) + "</p>";


    }


    @GetMapping("/posts/create")
    @ResponseBody


    public String formPost() {

        return "<p>" + "view the form for creating a post" + "</p>";


    }


    @PostMapping("/posts/create")
    @ResponseBody


    public String newPost() {

        return "<p>" + "create a new post" + "</p>";


    }


}
