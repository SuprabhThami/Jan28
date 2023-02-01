package model;

public class MainCategory {
    public void getID() {
        System.out.println("Library code: 1001");
    }

    String type;

    public void getInfo() {
        System.out.println("Book");
    }
    public MainCategory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}