package CodeWars.SevenKyu.SimpleStringCharacters;

public class Kata {

    public static int[] Solve(String word) {
      return new int[] {
        (int) word.chars().filter(Character::isUpperCase).count(),
        (int) word.chars().filter(Character::isLowerCase).count(),
        (int) word.chars().filter(Character::isDigit).count(),
        word.replaceAll("[A-Za-z0-9]", "").length()
		  };
    }
}