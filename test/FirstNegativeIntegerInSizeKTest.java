import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FirstNegativeIntegerInSizeKTest {

    @Test
    void testcase1() {
        FirstNegativeIntegerInSizeK sizeK = new FirstNegativeIntegerInSizeK();
        int[] nums = {12, -1, -7, 5, 8, -15, 30, 25, 45};
        int[] expected = {-1, -1, -7, -15, -15, -15, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(sizeK.calculate(nums, 3)));
    }
}