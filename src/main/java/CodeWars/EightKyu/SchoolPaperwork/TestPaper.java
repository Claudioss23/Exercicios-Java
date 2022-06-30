package CodeWars.EightKyu.SchoolPaperwork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaper {

    @Test
    public void test1(){
        assertEquals(25, Paper.paperWork(5,5));
    }

    @Test
    public void test2(){
        assertEquals(0, Paper.paperWork(5,-5));
    }

    @Test
    public void test3(){
        assertEquals(0, Paper.paperWork(-5,-5));
    }

    @Test
    public void test4(){
        assertEquals(0, Paper.paperWork(-5,5));
    }

    @Test
    public void test5(){
        assertEquals(0, Paper.paperWork(5,0));
    }
}
