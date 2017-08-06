package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by M4MIND on 06.08.2017.
 */
public class PointTest {
    @Test
    public void whenSetPointThenResultDistanceBetweenPoint() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double result = a.distanceTo(b);
        assertThat(result, is(4D));
    }
}
