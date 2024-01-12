//This repo is for solutions to problems on sites Codewars, Hackerrank, Leetcode with java.
/* 1.Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
-----------
public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    return (flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0);
  }

  public static void main(String[] args) {
    System.out.println(isLove(2, 3));  // true
    System.out.println(isLove(2, 4));  // false
    System.out.println(isLove(5, 7));  // true
    System.out.println(isLove(6, 8));  // false
  }
}
 */
/* 2.Write a function to split a string and convert it into an array of words.
------------
 public class Solution {

    public static String[] stringToArray(String s) {
        String[] result = s.split("\\s+");
        return result;
    }

    public static void main(String[] args) {
        String inputString = "Hello World! This is a sample string.";
        String[] wordsArray = stringToArray(inputString);

        System.out.println("Words in the array:");
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }
}
 */
/* 3.Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 -------------
 import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
      
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        return new int[0];
    }
}

 */
/*4.Two Sum-Given an array of numbers, find the two numbers such that they add up to a specific target.
 import java.util.HashMap;
import java.util.Map;

public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numIndices = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numIndices.containsKey(complement)) {
            return new int[] { numIndices.get(complement), i };
        }
        numIndices.put(nums[i], i);
    }
    
    return new int[] { -1, -1 }; // Eğer çözüm bulunamazsa
}

 */
/*5.Palindrome Number-Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 public boolean isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    String strX = Integer.toString(x);
    int left = 0, right = strX.length() - 1;
    
    while (left < right) {
        if (strX.charAt(left) != strX.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
}

 */
/*6.Factorial
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println(number + " sayısının faktöriyeli: " + factorial);
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
 
 */