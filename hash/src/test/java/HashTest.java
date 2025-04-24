import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashTest {

    @Test
    @DisplayName("Testing case when array is null")
    void nullArray() {
         assertThrows(IllegalArgumentException.class,  () -> Hash.simpleHash(null));
    }

    @Test
    @DisplayName("Testing case when array is empty")
    void emptyArray() {
        byte[] result = Hash.simpleHash(new byte[0]);

        assertEquals(32, result.length);
    }

    @Test
    @DisplayName("Testing case when array is too long")
    void longArray() {
        byte[] result = Hash.simpleHash(new byte[1000]);

        assertEquals(32, result.length);
    }

    @Test
    @DisplayName("Testing case when equal strings has equal result byte array")
    void compareHash() {
        byte[] first = "hash".getBytes();
        byte[] second = "hash".getBytes();

        assertArrayEquals(Hash.simpleHash(first), Hash.simpleHash(second));
    }
}
