package com.lukmanhawi.moviecatalogue.data;

public class MovieEntity {
    private String movieId;
    private String title;
    private String description;
    private String date;
    private int imagePath;

    public MovieEntity(String movieId, String title, String description, String date, int imagePath) {
        this.movieId = movieId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.imagePath = imagePath;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

}
