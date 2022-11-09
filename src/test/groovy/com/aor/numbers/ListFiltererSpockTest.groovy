package com.aor.numbers

import spock.lang.Specification

class ListFiltererSpockTest extends Specification {
    def 'testing: filter'() {
        given:
            def filter = Mock(GenericListFilter.class)
            filter.accept(1) >> true
            filter.accept(2) >> false
            filter.accept(3) >> true
            filter.accept(4) >> false
        when:
            def filterer = new ListFilterer(filter);
        then:
            filterer.filter(Arrays.asList(1, 2, 3, 4)) == Arrays.asList(1, 3)
    }
}
