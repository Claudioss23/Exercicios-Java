package CodeWars.SevenKyu.FunctionalAddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKata {
    
    @Test
    public void simpleAdd() {
      assertEquals(8 ,Kata.add(3).applyAsInt(5));
    }
}