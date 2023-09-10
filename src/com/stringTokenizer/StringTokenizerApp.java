package com.stringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerApp {
    public static void main(String[] args) {
        String myFullName = "My, name, is, Koustav, Singha, Roy";
        StringTokenizer stringTokenizer = new StringTokenizer(myFullName,",");
        System.out.println("Quote:" +stringTokenizer.countTokens());
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        String[] printFullNameWithComma = myFullName.split(",", 1);
        System.out.println("Same output with comma with limit count:" +printFullNameWithComma.length);
        for(String name: printFullNameWithComma) {
            System.out.println(name);
        }
    }
}
