package com.example.demo.Controller;


import com.example.demo.Entity.BlogPost;
import com.example.demo.Repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @PostMapping("/saveBlog")
    public  String saveBlog(@RequestBody BlogPost blogPost){
        demoRepository.save(blogPost);
        return "Blog Saved.";
    }

    @GetMapping(path = "/getBlog")
    public List <BlogPost> getAll(){
        return demoRepository.findAll();
    }

    @GetMapping(path = "/getBlog/{id}")
    public List < BlogPost> getBlogById (@PathVariable Long id){
        return (List<BlogPost>) demoRepository.findBlogPostById(id);
    }

    @DeleteMapping(path = "/deleteBlog/{id}")
    public String deleteBlog(@PathVariable Long id){
        demoRepository.deleteById(id);
        return "Blog has been deleted.";
    }
}
