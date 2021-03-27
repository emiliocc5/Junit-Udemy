package helper;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @Before
    public void setup(){
        System.out.println("Before test");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @After
    public void teardown() {
        System.out.println("After test");
    }
}
