package activityStarterCode.sortingArrays;

import org.junit.Test;

import static activityStarterCode.sortingArrays.ArraySort.sort;
import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(
                new String[] {},
                sort(new String[] {})
        );
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(
                null,
                sort(null)
        );
    }

    @Test
    public void testTwoElements() {
        assertArrayEquals(
                new String[] {"order", "out"},
                sort(new String[] {"out", "order"})
        );
    }

    @Test
    public void testThreeElements() {
        assertArrayEquals(
                new String[] {"aa", "bb", "cc"},
                sort(new String[] {"cc", "aa", "bb"})
        );
    }

}
