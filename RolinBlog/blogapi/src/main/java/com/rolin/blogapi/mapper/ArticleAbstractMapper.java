package com.rolin.blogapi.mapper;

import com.rolin.blogapi.entity.ArticleAbstract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleAbstractMapper {
    @Select("select * from article_abstract")
    List<ArticleAbstract> getAllArticles();


}
