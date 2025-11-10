package com.example.demo.Article.model;

import java.sql.Date;

public class Article {
    private Long id; 

    private String auteur;
    private Date datePublication;
    private String contenu;
    private Integer nbLikes;
    private Integer nbDislikes;

    public Article() {
    }

    public Article(Long id, String auteur, Date datePublication, String contenu, Integer nbLikes, Integer nbDislikes) {
        this.id = id;
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.contenu = contenu;
        this.nbLikes = nbLikes;
        this.nbDislikes = nbDislikes;
    }
}
