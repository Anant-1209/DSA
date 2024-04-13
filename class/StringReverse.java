import java.util.*;

class StringReverse {
    public void reverseString(char[] s) {
        // Iterate from the beginning (i) and end (j) of the array towards the middle.
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            // Swap characters at index i and j.
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        // At this point, the character array 's' contains the reversed string.
    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();
        char word[] = { 'h', 'e', 'l', 'l', 'o' };
        s.reverseString(word);
        String reversedString = new String(word);
        System.out.println("reverse string is: " + reversedString);

    }

}
