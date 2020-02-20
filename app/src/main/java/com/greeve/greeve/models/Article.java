package com.greeve.greeve.models;
//Ini Data
public class Article {

    private String title;
    private int photo;

    public Article(String title, int photo) {
        this.title = title;
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
