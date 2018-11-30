import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void sum() {
        Main main = new Main();
        assertEquals("1+2 != 3",3, main.sum(1,2));
    }
}