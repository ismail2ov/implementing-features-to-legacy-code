package com.github.ismail2ov.sproutclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuarterlyReportTableHeaderProducerShould {

    @Test
    void make_header() {
        QuarterlyReportTableHeaderProducer producer = new QuarterlyReportTableHeaderProducer();
        String expected = "<tr><td>Department</td><td>Manager</td><td>Profit</td><td>Expenses</td></tr>";

        String actual = producer.makeHeader();

        assertThat(actual).isEqualTo(expected);
    }
}