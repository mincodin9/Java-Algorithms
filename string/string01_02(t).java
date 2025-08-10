package com.spring.string;
import java.util.Scanner;

public class T0102 {
	public String solution(String str) {
		String answer="";
		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//			else answer+=Character.toLowerCase(x);
			
			//아스키코드 사용
			if(x>=65 && x<=90) answer+=(char)(x+32);
			else answer+=(char)(x-32);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		T0102 T = new T0102();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
