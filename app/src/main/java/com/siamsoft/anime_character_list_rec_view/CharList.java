package com.siamsoft.anime_character_list_rec_view;

public class CharList {


    private String c_name;
    private String anime_name;
    private double rating;
    private int image;


    public CharList(String c_name, String anime_name, double rating, int image) {
        this.c_name = c_name;
        this.anime_name = anime_name;
        this.rating = rating;
        this.image = image;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getAnime_name() {
        return anime_name;
    }

    public void setAnime_name(String anime_name) {
        this.anime_name = anime_name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }






}
