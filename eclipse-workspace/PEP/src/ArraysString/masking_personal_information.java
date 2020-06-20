package ArraysString;

import java.util.Scanner;

public class masking_personal_information {

	 public static void main(String[] args) {
 	 	 Scanner scn = new Scanner(System.in);
 	 	 String str = scn.next();
 	 	 System.out.print(maskPII(str));
 	 }
 
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input a string
 	 // It should return required output.
 
 	 public static String maskPII(String S) {
 	 	 // Write your code here
 		int atIndex = S.indexOf('@');
        if (atIndex >= 0) { // email
            return (S.substring(0, 1) + "*****" + S.substring(atIndex - 1)).toLowerCase();
        } else { // phone
            String digits = S.replaceAll("\\D+", "");
            String local = "***-***-" + digits.substring(digits.length() - 4);
            if (digits.length() == 10) return local;
            String ans = "+";
            for (int i = 0; i < digits.length() - 10; ++i)
                ans += "*";
            return ans + "-" + local;
 	 }
 	 }
}
