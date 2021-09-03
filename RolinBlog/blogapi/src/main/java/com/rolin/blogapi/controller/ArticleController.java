package com.rolin.blogapi.controller;

import com.rolin.blogapi.entity.ArticleAbstract;
import com.rolin.blogapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")
    public List<ArticleAbstract> getAllArticles(){
        return articleService.getAllArticles();
    }

}
