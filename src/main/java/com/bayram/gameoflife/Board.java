package com.bayram.gameoflife;

import java.util.List;

public class Board {

    private int size;
    private int[][] cellStatus;

    public Board(int size) {
        this.size = size;
        cellStatus = new int[size][size];
    }

    public Board(int size, List<Point> livingPoints) {
        this.size = size;
        cellStatus = new int[size][size];
        initializeCellStatus(livingPoints);
    }

    private void initializeCellStatus(List<Point> livingPoints){
        livingPoints.forEach(point -> cellStatus[point.getX()][point.getY()] = 1);
    }

    public int getSize() {
        return size;
    }

    public int displayCell(Point point) {
        if(!isInBoard(point)){
            throw new IndexOutOfBoundsException();
        }
        return cellStatus[point.getX()][point.getY()];
    }

    private boolean isInBoard(Point point) {
        return point.getX() <= size && point.getY() <= size;
    }
}
