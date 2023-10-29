package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {4, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {7, 9, 0, 5, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

}