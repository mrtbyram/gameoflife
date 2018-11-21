package com.bayram.gameoflife;

public class Game {

    private int cells[][] = new int[100][100];

    public boolean isCellAlive(int x, int y) {
        return cells[x][y] == 1;
    }

    public void activate(int x, int y) {
        cells[x][y] = 1;
    }
}
