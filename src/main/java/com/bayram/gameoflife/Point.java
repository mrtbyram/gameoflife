package com.bayram.gameoflife;

import java.util.ArrayList;
import java.util.List;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Point> getAdjacentPoints() {
        List<Point> adjacents = new ArrayList<Point>();

        adjacents.add(this);
        adjacents.add(this);
        adjacents.add(this);
        adjacents.add(this);
        adjacents.add(this);
        adjacents.add(this);
        adjacents.add(this);
        adjacents.add(this);

        return adjacents;
    }
}
