package com.java8poc;

import java.io.*;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s, str1 = "", str2 = "", finalStr = "", largestMatch = "";
		while ((s = in.readLine()) != null) {
			if (s.length() > 1) {
				str1 = s.split(", ")[0];
				str2 = s.split(", ")[1];
				finalStr = "";
				String firstString = (str1.length() >= str2.length()) ? str1 : str2;
				String secondString = (str1.length() <= str2.length()) ? str1 : str2;
				for (int i = 0; i <= firstString.length() - 1; i++) {
					for (int j = 0; j <= secondString.length() - 1; j++) {
						if (firstString.substring(i).equalsIgnoreCase(secondString.substring(j))) {
							finalStr = firstString.substring(i);
						}
					}
					if(finalStr.length()>largestMatch.length())
						largestMatch = finalStr;
				}
				if(largestMatch.length()==0)
					System.out.println("NULL");
				else
					System.out.println(largestMatch);
				largestMatch="";
				finalStr=null;
			}
		}
	}
}
