package April.problem_0200_NumberOfIslands;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author hustffx
 * @Date 2020/4/20 11:55
 */
class NumberOfIslandsTest {
    private NumberOfIslands solution;
    private char[][] grid;
    private int expected;

    @BeforeEach
    void setUp() {
        solution = new NumberOfIslands();
        grid = new char[][]{
                {'0', '1', '0', '0', '1', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '1', '0', '1', '1', '0', '0', '0'},
                {'0', '1', '0', '0', '0', '1', '1', '1', '1', '0', '0', '0', '0', '0', '1', '1', '1', '1', '0', '1'},
                {'1', '1', '0', '0', '0', '1', '1', '0', '0', '0', '1', '1', '1', '0', '0', '1', '0', '1', '1', '0'},
                {'0', '1', '0', '1', '1', '0', '1', '0', '0', '0', '1', '0', '0', '1', '0', '0', '0', '0', '0', '1'},
                {'1', '0', '0', '1', '0', '1', '0', '0', '0', '1', '1', '0', '1', '0', '0', '1', '0', '0', '0', '0'},
                {'1', '0', '0', '0', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '1', '0', '0', '0', '0', '1'},
                {'1', '0', '0', '0', '1', '0', '1', '1', '1', '0', '1', '0', '1', '1', '1', '1', '0', '0', '0', '1'},
                {'1', '0', '0', '1', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '1'},
                {'0', '0', '0', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '0', '0', '0', '1', '0'},
                {'1', '0', '1', '0', '1', '0', '0', '1', '1', '1', '0', '1', '1', '0', '0', '1', '1', '0', '0', '0'},
                {'0', '1', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '0', '0', '0', '1', '0'},
                {'1', '0', '0', '0', '1', '1', '1', '0', '1', '0', '0', '0', '1', '0', '1', '0', '1', '0', '0', '1'},
                {'0', '0', '0', '0', '1', '0', '1', '1', '0', '1', '0', '1', '0', '1', '1', '1', '1', '0', '0', '0'},
                {'0', '1', '1', '0', '0', '0', '0', '1', '0', '0', '1', '1', '1', '0', '0', '1', '1', '0', '1', '0'},
                {'1', '0', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0', '1', '0', '0', '1', '0', '0', '0', '1'},
                {'1', '0', '0', '0', '1', '0', '1', '0', '0', '1', '0', '1', '0', '0', '1', '0', '0', '1', '1', '1'},
                {'0', '0', '1', '0', '0', '0', '0', '1', '0', '0', '1', '1', '0', '1', '1', '1', '0', '0', '0', '0'},
                {'0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '1', '0', '1', '0', '1', '0', '0', '0', '1', '1'},
                {'1', '0', '0', '0', '1', '0', '1', '1', '1', '0', '0', '1', '0', '1', '0', '1', '1', '0', '0', '0'}
        };
        expected = 55;
    }

    @Test
    void numIslands1() {
        int result = solution.numIslands1(grid);
        assertEquals(expected, result);
    }

    @Test
    void numIslands2() {
        int result = solution.numIslands2(grid);
        assertEquals(expected, result);
    }

    @Test
    void numIslands3() {
        int result = solution.numIslands3(grid);
        assertEquals(expected, result);
    }
}