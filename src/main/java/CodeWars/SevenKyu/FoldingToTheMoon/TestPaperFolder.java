package CodeWars.SevenKyu.FoldingToTheMoon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaperFolder {
  @Test
  public void sampleTests() {
    assertEquals((Long)42L, PaperFolder.fold(384000000.0));
    assertEquals((Long)0L, PaperFolder.fold(0.00005));
  }
}