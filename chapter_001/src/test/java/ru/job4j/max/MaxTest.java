package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by M4MIND on 06.08.2017.
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max max = new Max();
        int result = max.max(7, 5);
        assertThat(result, is(7));
    }
}
