package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {
    @Test
    public void positive() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertTrue(filter.accept(1));
    }

    @Test
    public void negative() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertFalse(filter.accept(-1));
    }

    @Test
    public void zero() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertFalse(filter.accept(0));
    }
}
