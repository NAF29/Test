package javaPac;

import java.util.Arrays;

public class Hello {

	
	public static void main(String args[]) {
		int a= 10;
		int b=20;
		int z=a+b;
		System.out.println();
		
		String Text = "Hello World";
		StringBuilder sb = new StringBuilder(Text);
		StringBuilder rev= sb.reverse();
		System.out.println(rev);
		
		String[] text= {"hello","programm","java","world"};
		Arrays.sort(text);
		for(String s: text) {
			System.out.println(s);
		}
		
	}
}
