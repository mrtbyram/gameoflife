package com.bayram.gameoflife;

public class Point {

    private int x;
    private int y;

    private Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Point xy(int x, int y) {
        return new Point(x, y);
    }
}
