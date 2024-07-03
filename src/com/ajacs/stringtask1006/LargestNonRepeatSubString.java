package com.ajacs.stringtask1006;

public class LargestNonRepeatSubString {
    public static int LongestSubstring(String s) {
        int c=0;
        int d=0;
        String st="";
        for(int i=0;i<s.length();i++){
            StringBuffer t=new StringBuffer();
            for(int j=i;j<s.length();j++){
                if (t.indexOf(s.charAt(j)+"")==-1){
                    t.append(s.charAt(j));
                    c=Math.max(c,t.length());
                    if (c!=d) {
                    	d=c;
                    	st=t.toString();
                    }
                }
                else{
                    break;
                }
            }
        }
        System.out.println(st);
        return c;
        
    }
	
	public static void main(String[] args) {
		String s="abcasgtydged";
		System.out.println(LongestSubstring(s));
		
	}

}
