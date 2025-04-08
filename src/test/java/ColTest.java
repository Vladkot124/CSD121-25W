package lab4.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColTest {

    @Test
    void testValidInputs() {
        // Valid lowercase inputs
        assertEquals(Col.Left, Col.from("1"));
        assertEquals(Col.Left, Col.from("l"));

        assertEquals(Col.Middle, Col.from("2"));
        assertEquals(Col.Middle, Col.from("m"));
        assertEquals(Col.Middle, Col.from("c"));

        assertEquals(Col.Right, Col.from("3"));
        assertEquals(Col.Right, Col.from("r"));
    }

    @Test
    void testCaseInsensitiveInputs() {
        // Ensure method is case insensitive
        assertEquals(Col.Left, Col.from("L"));
        assertEquals(Col.Middle, Col.from("M"));
        assertEquals(Col.Middle, Col.from("C"));
        assertEquals(Col.Right, Col.from("R"));
    }

    @Test
    void testInvalidInputs() {
        // Test invalid inputs should throw an exception
        assertThrows(IllegalArgumentException.class, () -> Col.from("4"));
        assertThrows(IllegalArgumentException.class, () -> Col.from("x"));
        assertThrows(IllegalArgumentException.class, () -> Col.from(""));
        assertThrows(IllegalArgumentException.class, () -> Col.from("middle"));
    }
}