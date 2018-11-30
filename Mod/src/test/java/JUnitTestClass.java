import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;

public class JUnitTestClass {

    @Before
    public void beforeClass() {
        System.out.println("This should be printed Before Method execution");
    }

    @After
    public void afterClass() {
        System.out.println("This should be printed After Method execution\n");
    }


    @Test
    public void greenJUnitTest() {
        System.out.println("jUnitTest running");
        Assert.assertThat("Not ok", "String", containsString("String"));
    }

    @Test
    public void yellowJUnitTestNegative() {
        System.out.println("jUnitTestNegative running");
        Assert.assertThat("Not ok", "String", containsString("String1"));
    }

    @Test
    public void redJUnitTest() {
        System.out.println("jUnitRedTest running");
        String s = null;
        System.out.println(s.length());
    }

    @Test(expected = NullPointerException.class)
    public void greenJUnitTestWithExpectedException() {
        System.out.println("jUnitTestWithExpectedException running");
        String s = null;
        System.out.println(s.length());
    }

    @Ignore
    @Test
    public void grayJUnitTestIgnored() {
        System.out.println("jUnitTestIgnored running");
        //ignore me
    }

    @Test
    public void yellowJUnitAssertNotNull() {
        assertNotNull(getClass().getResource("test.resources"));
    }

    @Test
    public void greenJUnitTestProperties() {
        try {
            Properties prop = new Properties();
            InputStream is = JUnitTestClass.class.getResourceAsStream("application.properties");
            prop.load(is);
            Assert.assertEquals(prop.getProperty("propertyName"), "propertyValue");
            Assert.assertEquals(prop.getProperty("anotherPropertyName"), "anotherPropertyValue");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
