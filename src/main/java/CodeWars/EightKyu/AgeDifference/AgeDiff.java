package CodeWars.EightKyu.AgeDifference;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        return birth < yearTo ?
                "You are " +
                        (yearTo - birth) +
                        (yearTo - birth == 1 ? " year old." : " years old.") :
                birth > yearTo ?
                        "You will be born in " +
                                (birth - yearTo) +
                                (birth - yearTo == 1 ? " year." : " years.") :
                        "You were born this very year!";
    }
}