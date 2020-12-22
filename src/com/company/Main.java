package com.company;

public class Main {

    public static String scroll(String s) {
        String c1 = s.substring(0,1);
        String c2 = s.substring(1);
        return c2+c1;
    }

    public static String convertName(String name) {
        int commalocation = name.lastIndexOf(",");
        String first = name.substring(commalocation+2);
        String last = name.substring(0,commalocation);
        return first.trim() + " " + last.trim();
    }

    public static String negative(String s) {
        s = s.replace("1", "X");
        s = s.replace("0", "Y");
        s = s.replace("X", "0");
        s = s.replace("Y", "1");
        return s;
    }

    public static String convertDate(String dateStr) {
        String month = dateStr.substring(0,2);
        String day = dateStr.substring(3,5);
        String year = dateStr.substring(6);
        return day + "-" + month + "-" + year;
    }

    public static String convertDate2(String dateStr) {
        int fslash = dateStr.indexOf("/");
        int lslash = dateStr.lastIndexOf("/");
        String month = dateStr.substring(0,fslash);
        String day = dateStr.substring(fslash+1, lslash);
        String year = dateStr.substring(lslash+1);
        return day + "-" + month + "-" + year;
    }

    public static boolean startsWith(String s, String prefix) {
        if(s.length() < prefix.length()) {
            return false;
        }
        else {
            int l = prefix.length();
            String first = s.substring(0, l);
            return first.equals(prefix);
        }
    }

    public static boolean endsWith(String s, String suffix) {
        if(s.length() < suffix.length()) {
            return false;
        }
        else {
            int lsuffix = suffix.length();
            int ls = s.length();
            String last = s.substring(ls + 1 - lsuffix);
            return last.equals(suffix);
        }
    }

    public static String removeTag(String s, String tag) {
        int tagloc = s.indexOf(tag);
        int tagloc2 = s.lastIndexOf(tag);
        if (tagloc != -1 && tagloc2 != -1) {
            s = s.substring(tagloc, tagloc2);
            s = s.replace("<", "");
            s = s.replace(">", "");
            s = s.replace("/", "");
            s = s.replace(tag, "");

        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));

        System.out.println(convertName(" Reubenstein, Lori Renee      "));

        System.out.println(negative("0010111001"));

        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));

        System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</b>Hello World<b>", "b"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b> Happy Birthday", "b"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}
