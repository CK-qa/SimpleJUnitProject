import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sum() {
        Main main = new Main();
        Assert.assertEquals("1+2 != 3",3, main.sum(1,2));
    }
}