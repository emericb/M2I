package org.example;

public class Plante {

    private String name;
    private int height;
    private String color;

    public Plante(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plante{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
