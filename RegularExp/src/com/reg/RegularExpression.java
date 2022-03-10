package com.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
//	public static void main(String[] args) {
//		String pattern = "[a-z]+";
//		String check = "Happy Learning! WelCome To EduReka";
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(check);
//		while(m.find())
//			System.out.println(check.substring(m.start(), m.end()));
//		
//	}
	
	
	public static void main(String[] args) {
		String s = "I Will be in the room in 10 Minutes";
	
		Pattern p = Pattern.compile("\\bin\\b");
		Matcher m = p.matcher(s);
		while(m.find())
			System.out.println("Pattern Matches : " +m.group()+" at " +m.start());
		
	}

}
