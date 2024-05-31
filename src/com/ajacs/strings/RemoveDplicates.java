package com.ajacs.strings;

public class RemoveDplicates {
	
	public static void main(String[] args) {
		String s="aaaavbbddwafnasjdhncsmsndcjsdnsdicsvdnosibcsdndhbfhjndfvhjdkjwdiheubhuifgv jkviudfjchugvjchvgu kjcdihfjvhdjie ndklfhgb ndk'odpe dlkeoih";
		StringBuffer sb=new StringBuffer();
		for (char c:s.toCharArray()) {
			if (sb.indexOf(""+c)==-1) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
