package DeNangCao.cau2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ISBN_10_REGEX = "^(?:ISBN(?:-10)?:?\\s*)?(?=[0-9X]{10}$|(?=(?:[0-9]+[-\\s]){3})[-\\s0-9X]{13}$)[0-9]{1,5}[-\\s]?[0-9]+[-\\s]?[0-9]+[-\\s]?[0-9X]$";
    private static final String ISBN_13_REGEX = "^(?:ISBN(?:-13)?:?\\s*)?(?=[0-9]{13}$|(?=(?:[0-9]+[-\\s]){4})[-\\s0-9]{17}$)97[89][-\\s]?[0-9]{1,5}[-\\s]?[0-9]+[-\\s]?[0-9]+[-\\s]?[0-9]$";

    public static boolean isValidISBN(String isbn) {
        Pattern isbn10Pattern = Pattern.compile(ISBN_10_REGEX);
        Pattern isbn13Pattern = Pattern.compile(ISBN_13_REGEX);

        Matcher isbn10Matcher = isbn10Pattern.matcher(isbn);
        Matcher isbn13Matcher = isbn13Pattern.matcher(isbn);

        return isbn10Matcher.matches() || isbn13Matcher.matches();
    }
    private static final String REGEX_NAME = "^[a-zA-Z\\s-]+$";
    public static boolean isName(String name) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

}
