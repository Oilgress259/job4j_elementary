package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when22to33then1Dot4() {
        double expected = 1.4;
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void when33to44then1Dot4() {
        double expected = 1.4;
        int x1 = 3;
        int y1 = 3;
        int x2 = 4;
        int y2 = 4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void when44to88then5Dot6() {
        double expected = 5.6;
        int x1 = 4;
        int y1 = 4;
        int x2 = 8;
        int y2 = 8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}