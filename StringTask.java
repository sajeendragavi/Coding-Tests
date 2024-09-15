package org.example;

public class StringTask {
    public static void main(String[] args){
        String text = "Thi1s is a t3est str1ing w1th numbe3rs 123.";

        StringBuilder cleanedText = new StringBuilder();

        for(int i = 0; i < text.length(); i++){
            char  currentChar = text.charAt(i);

            if(!Character.isDigit(currentChar)){
                cleanedText.append(currentChar);
            }
        }

        System.out.println("Original text: " + text);
        System.out.println("cleaned text:" +cleanedText);
    }

}
