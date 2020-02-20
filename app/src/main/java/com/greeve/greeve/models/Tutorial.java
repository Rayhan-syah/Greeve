package com.greeve.greeve.models;

public class Tutorial {

    private String title;
    private int video;

    public Tutorial(String title, int video) {
        this.title = title;
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

}
