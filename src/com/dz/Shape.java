package com.dz;

public class Shape {
    String color;
    boolean filled;
    String type;

    public Shape() {
    }

    public Shape(String color, boolean filled, String type) {
        this.color = color;
        this.filled = filled;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", type='" + type + '\'' +
                '}';
    }
}
