package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post("Трудящийся медведь", new Date(2023, Calendar.JANUARY, 25)));
        posts.add(new Post("Трудящийся человек",  new Date(2021, Calendar.OCTOBER, 1)));
        posts.add(new Post("Трудящийся зайчик",  new Date(2009, Calendar.NOVEMBER, 5)));

        return posts;
    }
}
