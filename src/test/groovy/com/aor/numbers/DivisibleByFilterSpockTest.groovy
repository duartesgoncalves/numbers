package com.aor.numbers

import spock.lang.Specification

class DivisibleByFilterSpockTest extends Specification{
    def "accept divide by 2"() {
        given:
            def filter = new DivisibleByFilter(2)
        when:
            def div = Arrays.asList(0, 2, 4, 6, 8, 10, 100, 250, 1000)
            def not = Arrays.asList(1, 3, 5, 9, 101, 1001)
        then:
            div.every(it -> filter.accept(it))
            not.every(it -> !filter.accept(it))
    }

    def 'accept divide by 3'() {
        given:
            def filter = new DivisibleByFilter(3)
        when:
            def div = Arrays.asList(0, 3, 6, 9, 33, 333, 999)
            def not = Arrays.asList(1, 2, 4, 5, 100, 1000, 10000)
        then:
            div.every {it -> filter.accept(it) }
            not.every {it -> !filter.accept(it) }
    }
}
