package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> list = new ArrayList<>();
        list.add(new Post("text 1"));
        list.add(new Post("text 2"));
        list.add(new Post("text 3"));
        return list;
    }
}