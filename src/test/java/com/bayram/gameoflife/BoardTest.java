package com.bayram.gameoflife;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void board_should_be_initialized_with_size(){
        Board board = new Board(10);

        Assert.assertTrue(board != null);
    }

}
