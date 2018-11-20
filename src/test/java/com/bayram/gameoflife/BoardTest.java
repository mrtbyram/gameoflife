package com.bayram.gameoflife;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void should_be_initialized_with_size(){
        Board board = new Board(10);

        assertEquals(10, board.getSize());
    }

    @Test
    public void should_display_a_cell_status_in_specified_point(){
        Board board = new Board(2);

        int cell_2_2 = board.displayCell(Point.xy(2, 2));
        int cell_1_2 = board.displayCell(Point.xy(1, 2));

        assertEquals(0, cell_2_2);
        assertEquals(0, cell_1_2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void should_throw_out_of_bound_when_display_out_size(){
        Board board = new Board(2, Collections.<Point>emptyList());

        board.displayCell(Point.xy(1, 3));
    }

    @Test
    public void should_initialize_with_living_cells_information(){
        List<Point> livingPoints = new ArrayList<>();
        livingPoints.add(Point.xy(1, 3));

        Board board = new Board(4, livingPoints);

        assertEquals(1, board.displayCell(Point.xy(1, 3)));
        assertEquals(0, board.displayCell(Point.xy(2, 2)));
    }

}
