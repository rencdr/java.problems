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
/*7.greatest common divisor 
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first number: ");
        int num1 = scanner.nextInt();
        System.out.print("second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("greatest common divisor : " + gcd);
    }

    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}
 */
/*
 8.HELP! Jason can't find his textbook! It is two days before the test date, and Jason's textbooks are 
 all out of order! Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study 
 before the test.

 class sorter {
  public static List<String> sort(List<String> textbooks) {
      Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
      return textbooks;
  }
}
 */
/*
 9. When provided with a number between 0-9, return it in words.
Input :: 1   Output :: "One". 

public class Kata
{
  public static String switchItUp(int number)
  {
    String numberName = "";
  switch (number){
      case 1:
        numberName = "One";
        break;
      case 2:
        numberName = "Two";
        break;
      case 3:
        numberName = "Three";
        break;
      case 4:
        numberName = "Four";
        break;
      case 5:
        numberName = "Five";
        break;
      case 6:
        numberName = "Six";
        break;
      case 7:
        numberName = "Seven";
        break;
      case 8:
        numberName = "Eight";
        break;
      case 9:
        numberName = "Nine";
        break;
  }
    return numberName;
  }
}
 */
/*
 10.You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.
 
 public class TrafficLights {

 public static String updateLight(String current) {
        if (current.equals("green")) {
            return "yellow";
        } else if (current.equals("yellow")) {
            return "red";
        } else if (current.equals("red")) {
            return "green";
        }

        return ""; // Bu satır gereksiz, çünkü yukarıdaki koşulların hepsi kapsanmış durumda
    }
  
}
  
 */
/*
 11.Given a non-negative integer, return an array / a list of the individual digits in order.

 public class Solution{
  public static int[] digitize(int n) {
        String[] strDigits = Integer.toString(n).split("");

        int[] result = new int[strDigits.length];

        for (int i = 0; i < strDigits.length; i++) {
            result[i] = Integer.parseInt(strDigits[i]);
        }

        return result;
    }

}
 */
/*
12.Create a function which translates a given DNA string into RNA.

public class Bio {
    public String dnaToRna(String dna) {
        String rna = dna.replace('T', 'U');
        return rna;  
    } 
}
 */
/*
 13.You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
Considering these factors, write a function that tells you if it is possible to get to the pump or not.
Function should return true if it is possible and false if not.

 public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
      return distanceToPump <= mpg * fuelLeft;
  }
  
}
 */