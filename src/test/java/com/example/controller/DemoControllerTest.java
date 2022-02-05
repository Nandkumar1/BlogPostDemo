package com.example.controller;

import com.example.demo.Controller.DemoController;
import com.example.demo.Entity.BlogPost;
import com.example.demo.Repository.DemoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DemoControllerTest extends AbstractTest{

    @InjectMocks
    private DemoController demoController;

    @Mock
    private DemoRepository demoRepository;

    @Test
    public void getBlogTest_should_return_string () {
        Long id = 1L;
        List<BlogPost> blogPosts = new ArrayList<>();
        blogPosts = demoRepository.findBlogPostById(id);
        assertNotNull(blogPosts);
    }
}
