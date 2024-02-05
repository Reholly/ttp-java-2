package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Service
public class PostService {

    private ArrayList<Post> posts;
    private int idAutoIncrementer;
    public PostService() {
        idAutoIncrementer = 0;
        posts = new ArrayList<>();
        posts.add(new Post(idAutoIncrementer,"Трудящийся медведь", new Date(2023, Calendar.JANUARY, 25)));
        posts.add(new Post(++idAutoIncrementer,"Трудящийся человек",  new Date(2021, Calendar.OCTOBER, 1)));
        posts.add(new Post(++idAutoIncrementer,"Трудящийся зайчик",  new Date(2009, Calendar.NOVEMBER, 5)));

    }
    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(++idAutoIncrementer, text, new Date()));
    }
}
