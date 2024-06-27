package com.example.StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class OccuringCharacteString {

	public static void main(String[] args)
	{
		String str="aabbbcddcccbbcaa";
		char ch;
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		System.out.println(map);

	}

}
