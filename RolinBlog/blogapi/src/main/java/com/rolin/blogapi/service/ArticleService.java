package com.rolin.blogapi.service;

import com.rolin.blogapi.entity.ArticleAbstract;
import com.rolin.blogapi.mapper.ArticleAbstractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleAbstractMapper articleAbstractMapper;

    public List<ArticleAbstract> getAllArticles() {
        return articleAbstractMapper.getAllArticles();
    }


}
