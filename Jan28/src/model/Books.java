package model;

public class Books extends Category {
    String name;
    int price;
    int isbn;

    @Override
    public void getInfo(){
        System.out.println("Type: "+super.type);
        System.out.println("Genre: "+super.Genre);
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("ISBN: "+this.isbn);
        System.out.println("--------------------------------------------");
    }

    public Books(String type, String genre, String name, int price, int isbn) {
        super(type, genre);
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}