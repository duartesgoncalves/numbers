package com.aor.numbers

import spock.lang.Specification

class PositiveFilterSpockTest extends Specification {
    def 'Testing: accept'() {
        given:
            def pos = Arrays.asList(1, 2, 3, 10, 100)
            def neg = Arrays.asList(0, -1, -2, -3, -10, -100)
        when:
            def filter = new PositiveFilter()
        then:
            pos.every {it ->  filter.accept(it) }
            neg.every {it -> !filter.accept(it) }
    }
}
