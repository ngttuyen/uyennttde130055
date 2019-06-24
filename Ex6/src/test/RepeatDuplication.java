package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatDuplication{
	public static String Replace (String a) {
		String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		
		Pattern pt = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher mc = pt.matcher(a);
		while(mc.find()) {
			a = a.replaceAll(mc.group(), "REPEAT");
		}
		return a;
	}

	public static void main(String[] args) {
		RepeatDuplication rd = new RepeatDuplication();
		System.out.println(rd.Replace("i go go to the school"));
	}
		
}
