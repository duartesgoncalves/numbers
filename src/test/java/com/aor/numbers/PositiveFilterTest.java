package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {
    private Integer number = 1;

    @Test
    public void accept() {
        PositiveFilter filter = new PositiveFilter();
        boolean answer = filter.accept(number);

        Assertions.assertEquals(true, answer);
    }
}
