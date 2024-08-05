// package Week1.Day11;
// import java.util.*;

// public class String {
//     // Create a string S = Your name , move the characters of your name by 1 and
//     // then print S

//     public static void name1(String name) {
//         String ans = "";
//         for (int i = 0; i < name.length(); i++) {
//             // System.out.print((char) (name.charAt(i) + 1));
//             ans+= (name.charAt(i) + 1);
//         }
//         System.out.println("");
//     }

//     public static void main(String[] args) {

//         name1("Aryan");
//     }
// }

package Week1.Day11;

public class Stringpractice {
    public static void name1(String name) {
        String ans = "";
        for (int i = 0; i < name.length(); i++) {
            ans += (char) (name.charAt(i) + 1);
        }
        System.out.println(ans);
    }

    public static String reverseString(String name) {
        String ans = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            ans += name.charAt(i);
        }
        return ans;

    }

    public static boolean palindrome(String name) {
        String rev = reverseString(name);
        if (name.equals(rev)) {
            return true;
        }
        return false;
        // System.out.println();

    }

    Create a function to reverse the words

    public static void reverseWords(String name) {
        String ans = "";
        String[] words = name.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            ans += words[i] + " ";
        }
        System.out.println(ans.trim());

    }

    // find the length of the longest substring with repeating characters
    public static int longestSubstring(String name) {
        int max = 0;
        int start = 0;
        int[] count = new int[256];
        for (int i = 0; i < name.length(); i++) {
            if (count[name.charAt(i)] == 0) {
                count[name.charAt(i)]++;
            } else {
                while (name.charAt(start) != name.charAt(i)) {
                    count[name.charAt(start)]--;
                    start++;
                }
                count[name.charAt(i)]++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max - 1;

    }

    

    public static void main(String[] args) {
        name1("Aryan");
        String s1 = ("Today is Thursday");
        String s2 = ("a");
        System.out.println(s1.compareTo(s2));
        System.out.println(reverseString("Nitin"));
        reverseWords(s1);
        System.out.println(palindrome("NITIN"));
        // name1.compareTo(reverseString("Nitin"));
        s1.substring(1, 3);
        System.out.println(s1.substring(1, 10));
        System.out.println(longestSubstring("aaaaqqqqqlllww"));
    }
}
