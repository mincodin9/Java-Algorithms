package com.spring.string;
import java.util.Scanner;

public class S0101 {
	public int solution(String str, String s) {
		int answer=0;
		
		str = str.toLowerCase();
		s = s.toLowerCase();
		String[] str2 = new String[str.length()];
		str2 = str.split("");
		for(int i=0; i<str2.length; i++)
		{
			if(str2[i].equals(s)) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		S0101 T = new S0101();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = sc.nextLine();
		
		System.out.print(T.solution(str, s));
	}

}