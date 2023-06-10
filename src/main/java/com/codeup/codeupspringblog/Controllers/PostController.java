package com.codeup.codeupspringblog.Controllers;


import com.codeup.codeupspringblog.Models.Post;
import com.codeup.codeupspringblog.Repository.PostRepository;
import com.codeup.codeupspringblog.Repository.UserRepository;
import org.springframework.mail.SimpleMailMessage;
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


        model.addAttribute("posts", postsDao.findAll());


        return "posts/index";


    }


    @GetMapping("/posts/{id}")


    public String individualPost(@PathVariable long id, Model model) {


        model.addAttribute("post", postsDao.findById(id).get());


        return "posts/show";


    }


    @GetMapping("/posts/create")


    public String formPost(Model model) {

        model.addAttribute("post", new Post());


        return "/posts/create";


    }


    @PostMapping("/posts/create")


    public String newPost(@ModelAttribute Post post) {
        post.setUser(userDao.findById(1L).get());
        postsDao.save(post);
        return "redirect:/index";


    }


    @GetMapping("/posts/{id}/edit")

    public String editPost(Model model, @PathVariable long id) {

        model.addAttribute("post", postsDao.findById(id).get());

        // The return keyword in this case returns the filepath of the HTML file

        return "posts/edit";


    }


    @PostMapping("/posts/{id}/edit")

    public String submitEditPost(@ModelAttribute Post post){

        post.setUser(userDao.findById(1L).get());
        postsDao.save(post);

        // The keyword redirect means that it will render a page based on a @Getmapping

        // If the return value is in a form of a String then it will render the template based on the file path

        return "redirect:/index";









    }




}
