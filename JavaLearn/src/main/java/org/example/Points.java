package org.example;

public class Points {
    public double ax, ay, bx, by;

    public Points (double ax, double ay, double bx, double by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }

    public double distance () {
        return Math.sqrt((this.by - this.ay) * (this.by - this.ay) + (this.bx - this.ax) * (this.bx - this.bx));
    }


}
