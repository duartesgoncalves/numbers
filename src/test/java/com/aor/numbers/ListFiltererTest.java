package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    private List<Integer> list;

    @BeforeEach
    public void helper() {
        list = Arrays.asList(-2, -1, 0, 1, 2);
    }

    @Test
    public void positive() {
        List<Integer> expected = Arrays.asList(1, 2);

        PositiveFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(filter);

        List<Integer> filtered = filterer.filter(list);

        Assertions.assertEquals(expected, filtered);
    }

    @Test
    public void divisible() {
        List<Integer> expected = Arrays.asList(-2, 0, 2);

        DivisibleByFilter filter = new DivisibleByFilter(2);
        ListFilterer filterer = new ListFilterer(filter);

        List<Integer> filtered = filterer.filter(list);

        Assertions.assertEquals(expected, filtered);
    }
}
