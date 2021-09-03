import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharacterTest {

    @Test
    void solution() {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        int[] arr = { 2, 3, 7, 9, 11, 2, 3, 11};
        assertEquals(Arrays.toString(new int[]{7, 9}), Arrays.toString(uniqueCharacter.solution(arr)));
    }
}