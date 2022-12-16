import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void hello() {
        Hello h = new Hello("ISM");
        assertEquals(h.hello(), "Hello ISM");
    }
}