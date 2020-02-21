package com.greeve.greeve.models;
//Ini Data
public class Article {

    private int title;
    private int photo;

    public Article(int title, int photo) {
        this.title = title;
        this.photo = photo;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
