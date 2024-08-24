package test;

import java.util.Arrays;

public class TestCase {

	public static void main(String[] args) {
		
		/*String str1 = "mom";
		String str2 = "mnms";
		
		int length1 = str1.length();
		int length2 = str2.length();
		
		if (length1==length2) {
		
			char a[] = str1.toCharArray();
			char b[] = str2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			if (Arrays.equals(a, b)==true) {
				
				System.out.println("Given String are anagram");
				
			} else {
				
				System.out.println("Not anagram");

			}
			
		} else {
			
			System.out.println("Not an anagram");

		}
		*/
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1+" "+n2);
		
		for(int i = 2; i<=10; i++) {
		sum =n1+n2;
		System.out.println(" "+sum);
		
		n1=n2;
		n2=sum;
		
		}
	}

}
