package com.bayram.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void should_give_cell_is_dead_or_alive(){
        Board board = new Board();

        boolean isAlive = board.isCellAlive(3, 3);

        assertFalse(isAlive);
    }

    @Test
    public void should_activate_cell(){
        Board board = new Board();

        board.activate(2, 2);
        board.activate(4, 4);

        assertTrue(board.isCellAlive(2, 2));
        assertTrue(board.isCellAlive(4, 4));
        assertFalse(board.isCellAlive(3, 3));
    }

    @Test
    public void should_deactivate_cell(){
        Board board = new Board();

        board.activate(3, 3);
        board.deactivate(3, 3);

        assertFalse(board.isCellAlive(3, 3));
    }

    @Test
    public void should_give_living_adjacent_count(){
        Board board = new Board();

        board.activate(3, 3);
        int livingAdjacentCount = board.getLivingAdjacentCount(2, 3);

        assertEquals(1, livingAdjacentCount);

        board.activate(2, 2);
        assertEquals(2, board.getLivingAdjacentCount(2, 3));

        assertEquals(0, board.getLivingAdjacentCount(5, 5));
    }
}
