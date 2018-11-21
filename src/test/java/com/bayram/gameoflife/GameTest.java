package com.bayram.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void should_give_cell_is_dead_or_alive(){
        Game game = new Game();

        boolean isAlive = game.isCellAlive(3, 3);

        assertFalse(isAlive);
    }

    @Test
    public void should_activate_cell(){
        Game game = new Game();

        game.activate(2, 2);
        game.activate(4, 4);

        assertTrue(game.isCellAlive(2, 2));
        assertTrue(game.isCellAlive(4, 4));
        assertFalse(game.isCellAlive(3, 3));
    }

    @Test
    public void should_deactivate_cell(){
        Game game = new Game();

        game.activate(3, 3);
        game.deactivate(3, 3);

        assertFalse(game.isCellAlive(3, 3));
    }

    @Test
    public void should_give_living_adjacent_count(){
        Game game = new Game();

        game.activate(3, 3);
        int livingAdjacentCount = game.getLivingAdjacentCount(2, 3);

        assertEquals(1, livingAdjacentCount);

        game.activate(2, 2);
        assertEquals(2, game.getLivingAdjacentCount(2, 3));
    }
}
