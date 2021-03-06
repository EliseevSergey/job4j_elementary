package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', '@'},
        };
        assertTrue((MatrixCheck.monoHorizontal(input, 1)));
        }

    @Test
    public void monoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', '@'},
                {' ', 'X', ' '},
        };
        assertTrue((MatrixCheck.monoVertical(input, 1)));
    }

    @Test
    public void whenWowDiagoanl() {
        char[][] input = {
                {'W', 'X', 't'},
                {' ', 'O', '@'},
                {' ', 'g', 'W'},
        };
        char[] expect = {'W', 'O', 'W'};
        assertThat(MatrixCheck.extractDiagonal(input), is(expect));
    }

    @Test
    public void whenWin1() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        assertTrue(MatrixCheck.isWin(input));
    }

    @Test
    public void whenFail1() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        assertFalse(MatrixCheck.isWin(input));
    }

    @Test
    public void whenWin2() {
        char[][] input = {
                {' ', ' ', 'X', ' ', 'X'},
                {' ', ' ', 'X', ' ', 'X'},
                {' ', 'X', ' ', ' ', 'X'},
                {' ', ' ', 'X', ' ', 'X'},
                {'X', ' ', 'X', 'X', 'X'},
        };
        assertTrue(MatrixCheck.isWin(input));
    }

    @Test
    public void whenWin3() {
        char[][] input = {
                {' ', ' ', 'X', ' ', 'X'},
                {' ', ' ', 'X', ' ', '$'},
                {' ', 'X', ' ', ' ', 'X'},
                {' ', ' ', 'X', ' ', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        assertTrue(MatrixCheck.isWin(input));
    }
}
