package com.L_2;

import lombok.Getter;
import lombok.Setter;

public class Prism extends Square {
    @Getter
    @Setter
    private double height;


    public Prism(double side, double height) {

        this.height = height > 0 ? height : 10;
    }

    public Prism(double height) {
        this.height = height > 0 ? height : 10;
    }

    public Prism() {
        this.height = 10;
    }


    @Override
    public double getDiagonal() {
        return Math.sqrt(2 * Math.pow(this.side,2) + Math.pow(this.height,2));
    }
    public  double getArea() {
        return 2 * Math.pow(this.side,2) + 4 * this.side * this.height;
    }
    public double getVolume() {
        return Math.pow(this.side,2) * this.height;
    }


    @Override
    public String toString() {
        return "Prism: " +
                "\n- height: " + this.height +
                "\n- diagonal: " + String.format("%.1f",this.getDiagonal()) +
                "\n- area: " + String.format("%.1f", this.getArea()) +
                "\n - volume: " + String.format("%.1f",this.getVolume());

    }
}
