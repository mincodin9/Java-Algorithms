package com.spring.string;
import java.util.Scanner;

public class S0102 {
	public String solution(String str) {
		String answer="";
		StringBuilder sb = new StringBuilder();
		
		for(char x : str.toCharArray()) {
			int num = x;
			if(num>=65 && num<=90) x=Character.toLowerCase(x);
			else if(num>=97 && num<=122) x=Character.toUpperCase(x);
			sb.append(x);
		}
		
		answer=sb.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		S0102 T = new S0102();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print(T.solution(str));
	}

}
 
