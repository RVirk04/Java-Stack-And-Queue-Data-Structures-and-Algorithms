package Tests;

import Queue.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/// <summary>
/// Maze.Test - A class for testing the Point class.
///
/// @author: Randeep Singh Virk
/// @version 1.0
/// @since 2022-03-05
/// </summary>
public class PointTests {
    private Point pointTest;

    @BeforeEach
    void setup() {
        pointTest = new Point(1, 3);
    }

    /**
     * ensure the constructor sets the row value
     */
    @Test
    void construtorSetsRow() {
        assertEquals(1, pointTest.getRow());
    }

    /**
     * ensure the constructor sets the column value
     */
    @Test
    void constructorSetsColumn() {
        assertEquals(3, pointTest.getColumn());
    }

    /**
     * ensure a string representation of the class is returned
     */
    @Test
    void toStringReturnsFormattedValues() {
        assertEquals("[1, 3]", pointTest.toString());
    }

}