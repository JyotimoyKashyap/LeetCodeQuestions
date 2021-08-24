import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesOfAnagramsTest {

    @Test
    void count() {
        CountOccurrencesOfAnagrams anagrams = new CountOccurrencesOfAnagrams();
        String s = "abaabaasbqurof";
        String pattern = "abaa";
        assertEquals(3, anagrams.count(s, pattern));
    }

    @Test
    void test2(){
        CountOccurrencesOfAnagrams anagrams = new CountOccurrencesOfAnagrams();
        String s = "forxxorfxdofr";
        String pattern = "for";
        assertEquals(3, anagrams.count(s, pattern));
    }

    @Test
    void test3(){
        CountOccurrencesOfAnagrams anagrams = new CountOccurrencesOfAnagrams();
        String s = "aabaabaa";
        String pattern = "aaba";
        assertEquals(4, anagrams.count(s, pattern));
    }
}