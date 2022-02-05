package com.example.demo.Service;

import com.example.demo.Repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

}
