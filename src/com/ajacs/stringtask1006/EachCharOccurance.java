package com.ajacs.stringtask1006;

import java.util.HashMap;

public class EachCharOccurance {
	public static void main(String[] args) {
		String s="jasdoiufnvcjuhibajnvdcbnQOWIKUG7TYGYTROIQwjcb mosjihfgyrefdcjw7y8uwoeidiopu2i3ohufvijoacs;ki uhuncwomedinubr ynpq2oibuhtv canw;mco";
		HashMap<Character,Integer> h= new HashMap<>();
		for(int i=0;i<s.length();i++) {
			int c=0;
			if(!h.containsKey(s.charAt(i))) {
				for(int j=i;j<s.length();j++){
					if (s.charAt(i)==s.charAt(j)) {
						c++;
					}
				}
				h.put(s.charAt(i),c);
			}
		}
		System.out.println(h);
	}

}
