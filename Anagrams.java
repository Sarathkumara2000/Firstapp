package practicePrctice1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
public static void main(String[] args) {
	String str,str1;
	Scanner sc=new Scanner(System.in);
	
	str=sc.next();
	str1=sc.next();
	if(str1.length()==str.length()) {
	char[] ch=str.toCharArray();
	char[] ch1=str.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(ch1);
	boolean res=ch.equals(ch1);
	if(res) {
		System.out.println("anagrams");
	}
	else {
		System.out.println("not anagrams");
	}
	
	}
	else {
		System.out.println("not anagrams");
	}
	
	
}
}
