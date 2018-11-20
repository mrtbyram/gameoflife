package com.bayram.gameoflife;

import java.util.Collections;
import java.util.List;

public class Board {

    private int size;
    private int[][] cellsStatus;

    public Board(int size, List<Point> livingPoints) {
        this.size = size;
        cellsStatus = new int[size][size];
        initializeCellStatus(livingPoints);
    }

    private void initializeCellStatus(List<Point> livingPoints){
        livingPoints.forEach(point -> cellsStatus[point.getX()][point.getY()] = 1);
    }

    public int getSize() {
        return size;
    }

    public int displayCellStatus(Point point) {
        if(!isInBoard(point)){
            throw new IndexOutOfBoundsException();
        }
        return cellsStatus[point.getX()][point.getY()];
    }

    private boolean isInBoard(Point point) {
        return point.getX() <= size && point.getY() <= size;
    }

    public static BoardCreator withSize(int size) {
        return new BoardCreator(size);
    }

    public static class BoardCreator{

        private final int size;
        private List<Point> livingPoints;

        public BoardCreator(int size) {
            this.size = size;
        }

        public Board create() {
            if(livingPoints == null){
                livingPoints = Collections.emptyList();
            }
            return new Board(size, livingPoints);
        }

        public BoardCreator withLivingPoints(List<Point> livingPoints) {
            this.livingPoints = livingPoints;
            return this;
        }
    }
}
