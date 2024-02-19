/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.



nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        System.out.print("Enter an integer n: ");
        int n = str.nextInt();

        String firstN = word.substring(0, n);
        String lastN = word.substring(word.length() - n);

        System.out.print (firstN + lastN);


}}