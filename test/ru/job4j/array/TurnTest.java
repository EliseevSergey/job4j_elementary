package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenOdd() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expect = {7, 6, 5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
        }

    @Test
        public void whenEven() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {6, 5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}