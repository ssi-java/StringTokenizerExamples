package stringtokenizerexamples;

import java.util.StringTokenizer;

public class StringTokenizerExamples {

    public static void main(String[] args) {
        System.out.println("Checking one String arg constructor");
        String s1 = "indore bhopal delhi";
        StringTokenizer st1 = new StringTokenizer(s1);
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        System.out.println("Checking two String args constuctor");
        String s2 = "sunday-monday-tuesday";
        StringTokenizer st2 = new StringTokenizer(s2, "-");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        System.out.println("Checking three args constructor");
        String s3="sunday-monday-tuesday";
        StringTokenizer st3=new StringTokenizer(s3,"-",true);
        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }

}
