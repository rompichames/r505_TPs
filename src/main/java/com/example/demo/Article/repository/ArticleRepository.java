package com.example.demo.Article.controller;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Article.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}

