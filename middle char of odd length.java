

/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.



middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();
        int  middle=word.length()/2;
        if (word.length()>=3 && word.length()%2!=0 ) {
            System.out.print(word.substring(middle-1, middle+2));
        }
        else {
            System.out.print("please Enter word with odd length and more than 2 characters");;
        }



}}