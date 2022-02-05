package com.example.demo.Repository;

import com.example.demo.Entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository extends JpaRepository<BlogPost,Long> {
  List<BlogPost> findBlogPostById (Long id);
}
