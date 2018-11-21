package com.bayram.gameoflife;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void should_give_cell_is_dead_or_alive(){
        Game game = new Game();

        boolean isAlive = game.isCellAlive(3, 3);

        Assert.assertFalse(isAlive);
    }

    @Test
    public void should_activate_cell(){
        Game game = new Game();

        game.activate(2, 2);

        Assert.assertTrue(game.isCellAlive(2, 2));
    }
}
