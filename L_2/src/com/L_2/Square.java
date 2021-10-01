package com.L_2;

import lombok.Getter;
import lombok.Setter;

public class Square {
    @Getter
    @Setter
    protected double side;

    public Square(double side){
        this.side = side > 0 ? side : 10 ;
    }
    public Square (){
        this.side = 10;
    }
    public double getDiagonal() {
        return Math.sqrt(2) * this.side;
    }

    public double getArea() {
        return Math.pow(this.side,2);
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Square:" + "\n - Side: " + this.side +
                "\n - Diagonal: " + String.format("%.1f", this.getDiagonal()) +
                "\n - Perimeter: " + String.format("%.1f", this.getPerimeter()) +
                "\n - Area: " + String.format("%.1f", this.getArea());
    }
}
