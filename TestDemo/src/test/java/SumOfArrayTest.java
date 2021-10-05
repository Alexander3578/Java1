import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfArrayTest {

    @Test
    public void sum() {
        int expected = 5;

        SumOfArray Sum = new SumOfArray();

        int actual = Sum.Sum(3,new int[]{1,1,3});

        assertEquals(expected, actual);
    }
}