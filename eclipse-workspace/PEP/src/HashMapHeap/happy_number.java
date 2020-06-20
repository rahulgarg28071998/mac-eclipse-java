package HashMapHeap;

import java.util.*;

public class happy_number {

    public static boolean isHappy(int n) {
        // write your code here.
    	HashSet<Integer> hs = new HashSet<Integer>();
    	int sum = 0;
    	while(true)
    	{
    		int rem = n%10;
    		int quo = n;
    		//int num = n;
    		sum=0;
    		
    		while(quo!=0)
    		{
    			sum +=rem*rem;
    			quo = quo/10;
    			rem = quo%10;
    			
    		}
    		if(sum==1) {return true;}
    		else if(hs.contains(sum)) return false;
    		hs.add(sum);
    		n=sum;
    	}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (isHappy(N)) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }
    }
}
