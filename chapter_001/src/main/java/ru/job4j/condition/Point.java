package ru.job4j.condition;

/**
 * Created by M4MIND on 06.08.2017.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distanceTo(Point that) {
        double distancePre;
        distancePre = Math.pow((that.y - this.y), 2) + Math.pow((that.x - this.x), 2);
        return Math.sqrt(distancePre);
    }
}
