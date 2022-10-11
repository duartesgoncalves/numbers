package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
    private Integer number = 21;

    @Test
    public void accept() {
        DivisibleByFilter filter = new DivisibleByFilter(3);
        boolean answer = filter.accept(number);

        Assertions.assertEquals(true, answer);
    }
}
