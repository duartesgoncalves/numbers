package com.aor.numbers

import spock.lang.Specification

class ListAggregatorSpockTest extends Specification {
    private def list

    def setup() {
        list = Arrays.asList(1, 2, 4, 2, 5)
    }

    def "testing: sum"() {
        given:
            def aggregator = new ListAggregator()
        when:
            def result = aggregator.sum(list)
        then:
            result == 14
    }

    def "testing: max"() {
        given:
            def aggregator = new ListAggregator()
        when:
            def result = aggregator.max(list)
        then:
            result == 5
    }

    def "testing: min"() {
        given:
            def aggregator = new ListAggregator()
        when:
            def result = aggregator.min(list)
        then:
            result == 1
    }

    def "testing: distinct"() {
        given:
            def aggregator = new ListAggregator()
            def deduplicator = new ListDeduplicator(new ListSorter())
        when:
            def result = aggregator.distinct(list, deduplicator)
        then:
            result == 4
    }

    def "testing: max bug 7263"() {
        given:
            def aggregator = new ListAggregator()
        when:
            def max = aggregator.max(Arrays.asList(-1, -4, -5))
        then:
            max == -1
    }

    def "testing: distinct bug 8726"() {
        given:
            def aggregator = new ListAggregator()
            def deduplicator = Mock(GenericListDeduplicator)
            deduplicator.deduplicate(_) >> { Arrays.asList(1, 2, 4) }
        when:
            def result = aggregator.distinct(Arrays.asList(1, 2, 4, 2), deduplicator)
        then:
            result == 3
    }
}
