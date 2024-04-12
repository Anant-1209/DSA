import java.util.*;

public class StringReverse {
    public static void stringReverse(String s[]) {
        // System.out.println("The original word is: " + s);
        String nstr = "", ch = "";
        for (int i = 0; i < s.length; i++) {

            ch = s[i]; // extracts each character
            nstr = ch + nstr;
        }

        System.out.println("The reverse of the word is: " + nstr);

    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();
        String word[] = { "h", "e", "l", "l", "o" };
        s.stringReverse(word);

    }

}
