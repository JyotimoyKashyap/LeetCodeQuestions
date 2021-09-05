import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrailingZeroesTest {

    @Test
    void testCase1() {
        TrailingZeroes trailingZeroes = new TrailingZeroes();
        assertEquals(1, trailingZeroes.trailingZeroes(5));
    }
}