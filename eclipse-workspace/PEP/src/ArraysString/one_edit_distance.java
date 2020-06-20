package ArraysString;

import java.util.Scanner;

public class one_edit_distance {

	public static boolean isOneEditDistance(String s, String t) {
		// write your code here.
		if (s.length() - t.length() > 1)
			return false;

		int count = 0;
		// for equal size
		if (s.length() == t.length())
			for (int i = 0; i < s.length(); i++) {
				if (t.charAt(i) != s.charAt(i)) {
					if (count == 1)
						return false;
					else
						count++;
				}
			}
		// for longer case
		else {
			String max = s.length() > t.length() ? s : t;
			String min = s.length() < t.length() ? s : t;
			for (int i = 0, j = 0; i < min.length() && j < max.length();) {
				if (min.charAt(i) != max.charAt(j)) {
					if (count == 1)
						return false;
					else {
						j++;
						count++;
					}
				} else {
					i++;
					j++;
				}
			}
		}
		return true;
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isOneEditDistance(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
