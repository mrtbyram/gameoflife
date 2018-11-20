package com.bayram.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void board_should_be_initialized_with_size(){
        Board board = new Board(10);

        assertNotNull(board);
        assertEquals(10, board.getSize());
    }

    @Test
    public void board_should_display_a_cell_status_in_specified_point(){
        Board board = new Board(2);

        int cell_2_2 = board.displayCell(Point.xy(2, 2));
        int cell_1_2 = board.displayCell(Point.xy(1, 2));

        assertEquals(0, cell_2_2);
        assertEquals(0, cell_1_2);
    }

}
