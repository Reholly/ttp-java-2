package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsCreateController {

    private final PostService postsService;

    public PostsCreateController(@Autowired PostService postsService) {
        this.postsService = postsService;
    }
    @RequestMapping(path = "/new", method = RequestMethod.POST  )
    public String doCreate(@ModelAttribute("text") String text) {

        postsService.create(text);
        return "redirect:/";
    }
    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String newPost(Model model) {
        return "create";
    }
}
