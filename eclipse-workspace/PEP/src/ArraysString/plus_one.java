package ArraysString;

import java.util.Scanner;

public class plus_one {

	 public static int[] plusOne(int[] digits) {
	 	 //Write your code here	
		 boolean carry = true;
		 for(int i = digits.length-1;i>=0;i--)
		 {
			 if(digits[i]==9&&carry==true)
				 {digits[i] = 0;carry=true;}
			 else if(carry==true)
			 {
				 digits[i] = digits[i]+1;
				 carry = false;
			 }
		 }
		 if(carry==true)
			 System.out.print(1+" ");
		 return digits;
	 	 }
	 
	 	 //Don't make any changes here.
	 	 public static void main(String[] args) {
	 	 	 Scanner scn = new Scanner(System.in);
	 	 	 int n=scn.nextInt();
	 	 	 int[] Input=new int[n];
	 	 	 for(int i=0;i<Input.length;i++){
	 	 	 Input[i]=scn.nextInt();
	 	 	 }
	 	 	 int ans[] = plusOne(Input);
	 	 	 for (int i : ans) {
	 	 	 	 System.out.print(i + " ");
	 	 	 }
	 
	 	 }
}
