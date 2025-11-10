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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Integer getNbLikes() {
        return nbLikes;
    }

    public void setNbLikes(Integer nbLikes) {
        this.nbLikes = nbLikes;
    }

    public Integer getNbDislikes() {
        return nbDislikes;
    }

    public void setNbDislikes(Integer nbDislikes) {
        this.nbDislikes = nbDislikes;
    }
}
