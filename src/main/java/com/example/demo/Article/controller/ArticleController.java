package com.example.demo.Article.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/articles")
public class ArticleController {

    @Autowired
    private ArticleController articleController;

    @PostMapping(path="/add")
    public @ResponseBody String addNewArticle(@RequestParam String auteur, @RequestParam String contenu) {
        Article a = new Article();
        a.setAuteur(auteur);
        a.setContenu(contenu);
        a.setDatePublication(new java.sql.Date(System.currentTimeMillis()));
        a.setNbLikes(0);
        a.setNbDislikes(0);
        articleController.save(a);
        return "Article ajouté !";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Article> getAllArticles() {
        return articleController.findAll();
    }
}

