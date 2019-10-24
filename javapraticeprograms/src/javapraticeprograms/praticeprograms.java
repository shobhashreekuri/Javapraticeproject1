package javapraticeprograms;

import java.io.InputStream;
import java.util.Scanner;
public class praticeprograms {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String original=scan.nextLine();
		while(original.isEmpty() || original==null) {
			System.out.println("please enter valid string.");
			original=scan.nextLine();
		}
		scan.close();
		String output,output1;
		output=ReverseChar(original);
		System.out.println(output);
		System.out.println(reversestring(original));
		
		
	}
	

	private static String reversestring(String str1) {
		
		String Reverse="";
		
		if (str1.isEmpty()|| str1== null) {
			System.out.println("Empty string");
		}
		if (str1.length()<=1) {
			Reverse= str1;
		}else{
		String[] original = str1.split(" ");//"this,is,a,string"
		for(String item:original ) {
			Reverse=item+" " + Reverse;
			
		}
		}
		
		
	
			return Reverse.trim();
		
	}
	
	public static String ReverseChar(String original) {
		String reverse="";
		
		for(int item=original.length()-1; item>=0; item--) {
			reverse=reverse + original.charAt(item);
		}
		return reverse;
	}
	

}
