import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void add() {
        var addition = new Addition();
        assertEquals(6, addition.add(1, 2, 3));
    }
}