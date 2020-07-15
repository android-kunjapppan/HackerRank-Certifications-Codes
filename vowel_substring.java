import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String findSubstring(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                arr[i] = 1;
            }
        }

        int startIndex = -1;
        int endIndex = -1;
        int max = 0;
        int len = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (len < k) {
                len++;
            }
            count += arr[i];
            if (len == k) {
                if (count > max) {
                    max = count;
                    startIndex = i - k + 1;
                    endIndex = i;
                }
                count -= arr[i - k + 1];
                len--;
            }
        }
        if (startIndex == -1 || endIndex == -1) {
            return "Not found!";
        }
        return s.substring(startIndex, endIndex + 1);
    // Write your code here

    }

}

public class Solution {
