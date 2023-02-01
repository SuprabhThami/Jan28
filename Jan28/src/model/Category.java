package model;

public class Category extends MainCategory {
    public void getCode(){}

    public void getInfo(){

    }
    String Genre;

    public Category(String type, String genre) {
        super(type);
        Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}