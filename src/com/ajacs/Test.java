package com.ajacs;

import java.util.HashSet;

public class Test {
    int i;

    Test(int i) {
        this.i = i;
    }

    static {
        System.out.println("hiii");
    }

    @Override
    public int hashCode() {
        return 100; // Generate hash code based on the 'i' field
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Test test = (Test) obj;
        return i == test.i;
    }

    public static void main(String[] args) {
//        Test k = new Test(1);
//        Test n1 = new Test(20);
//        Test n2 = new Test(20);
//        HashSet<Test> n = new HashSet<>();
//        n.add(k);
//        n.add(n1);
//        n.add(n2);
//        System.out.println(n.contains(new Test(1)));  // true
//        System.out.println(n.contains(new Test(20))); // true
//        System.out.println(n.contains(new Test(100))); // false
//        System.out.println(n.contains(n2));
//        for (Test t : n) {
//            System.out.println(t);
        }


}

