package com.java8poc;

import java.io.*;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = in.readLine()) != null) {
			String finalStr = "";
			try {
				for (int i = 0; i <= s.length() - 1; i++) {
					if (i < s.length() - 1) {
						if (Integer.parseInt(s.charAt(i) + "") % 2 == 0
								&& Integer.parseInt(s.charAt(i + 1) + "") % 2 == 0) {
							finalStr += s.charAt(i) + "*";
						} else {
							if (Integer.parseInt(s.charAt(i) + "") % 2 != 0
									&& Integer.parseInt(s.charAt(i + 1) + "") % 2 != 0) {
								finalStr += s.charAt(i) + "-";
							} else {
								finalStr += s.charAt(i);
							}
						}
					} else {
						finalStr += s.charAt(i);
					}
				}
				System.out.println(finalStr);
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input");
			}
		}
	}
}
