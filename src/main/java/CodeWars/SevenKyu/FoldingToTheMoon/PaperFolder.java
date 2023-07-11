package CodeWars.SevenKyu.FoldingToTheMoon;

public class PaperFolder {
  public static Long fold(Double distance) {
    if(distance < 0) {
      return null;
    }
    
    long n;
    double paper = 0.0001;
    
    for(n = 0; paper < distance; n++) {
      paper *= 2;
    }
    
    return n;
  }
}