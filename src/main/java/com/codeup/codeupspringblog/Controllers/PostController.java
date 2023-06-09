package com.codeup.codeupspringblog.Controllers;


import com.codeup.codeupspringblog.Models.Post;
import com.codeup.codeupspringblog.Repository.PostRepository;
import com.codeup.codeupspringblog.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class PostController {

    private final PostRepository postsDao;
    private final UserRepository userDao;


    public PostController(PostRepository postsDao, UserRepository userDao) {

        this.postsDao = postsDao;
        this.userDao = userDao;


    }


    @GetMapping("/index")

    public String postsIndex(Model model) {

//        return "<p>" + "posts index page" + "</p>";

//        ArrayList<Post> posts = new ArrayList<>();
//
//        Post post1 = new Post("Car", "New-Car");
//        Post post2 = new Post("Bicycle", "New-Bicycle");
//
//        posts.add(post1);
//        posts.add(post2);
        model.addAttribute("posts", postsDao.findAll());


        return "posts/index";


    }


    @GetMapping("/posts/{id}")


    public String individualPost(@PathVariable long id, Model model) {


        model.addAttribute("post", postsDao.findById(id).get());


        return "posts/show";





    }


    @GetMapping("/posts/create")


    public String formPost() {


//        return "<p>" + "view the form for creating a post" + "</p>";

        return "/posts/create";


    }


    @PostMapping("/posts/create")
//    @ResponseBody


    public String newPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body, Model model) {

        Post post = new Post(title, body);
        postsDao.save(post);
        return "redirect:/index";


//        return "<p>" + "create a new post" + "</p>";


    }


}
