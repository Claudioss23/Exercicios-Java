package CodeWars.EightKyu.OOPiracy;

public class Ship {
  private final double draft;
  private final int crew;
    
  public Ship(double draft, int crew) {
    this.draft = draft;
    this.crew = crew;
  }

  // your code here
  
  public boolean isWorthIt() {
    return draft - (crew * 1.5) > 20;
  }
} 