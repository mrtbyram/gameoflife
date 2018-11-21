package com.bayram.gameoflife;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PointTest {

    @Test
    public void should_give_adjacent_points(){
        Point point = new Point(3, 3);

        List<Point> adjacentPoints = point.getAdjacentPoints();

        Assert.assertEquals(8, adjacentPoints.size());
    }

}
