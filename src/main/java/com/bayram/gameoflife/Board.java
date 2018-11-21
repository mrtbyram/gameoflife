package com.bayram.gameoflife;

public class Board {
    private int cells[][] = new int[100][100];

    public boolean isCellAlive(int x, int y) {
        return cells[x][y] == 1;
    }

    public void activate(int x, int y) {
        cells[x][y] = 1;
    }

    public void deactivate(int x, int y) {
        cells[x][y] = 0;
    }

    public int getLivingAdjacentCount(int x, int y) {
        int livingAdjacentCount = 0;

        livingAdjacentCount += cells[x-1][y-1];
        livingAdjacentCount += cells[x-1][y];
        livingAdjacentCount += cells[x-1][y+1];
        livingAdjacentCount += cells[x][y-1];
        livingAdjacentCount += cells[x][y+1];
        livingAdjacentCount += cells[x+1][y-1];
        livingAdjacentCount += cells[x+1][y];
        livingAdjacentCount += cells[x+1][y+1];

        return livingAdjacentCount;
    }
}
