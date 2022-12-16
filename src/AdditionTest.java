import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add() {
        var addition = new Addition();
        assertEquals(6, addition.add(1, 2, 3));
    }
}