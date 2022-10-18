package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
    private Integer number = 4;

    @Test
    public void non_divisible() {
        DivisibleByFilter filter = new DivisibleByFilter(3);
        Assertions.assertFalse(filter.accept(number));
    }

    @Test
    public void divisible() {
        DivisibleByFilter filter = new DivisibleByFilter(2);
        Assertions.assertTrue(filter.accept(number));
    }

    @Test
    public void division_by_zero() {
        DivisibleByFilter filter = new DivisibleByFilter(0);
        Assertions.assertFalse(filter.accept(number));
    }
}
