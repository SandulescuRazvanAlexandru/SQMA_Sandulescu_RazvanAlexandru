import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void hello() {
        Hello h = new Hello("ISM");
        assertEquals(h.hello(), "Hello ISM");
    }
}