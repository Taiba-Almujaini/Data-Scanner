/*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.



lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = str.nextLine();
        System.out.println("Enter second string:");
        String s2 = str.nextLine();


        if (s1.length()>=1 && s2.length()>=1) {
            System.out.print(s1.substring(0,1)+s2.substring(s2.length()-1));
        }
        else {
            if (s1.length() >= 1 && s2.length() < 1)
                System.out.print(s1.substring(0, 1) +"@");
        else
            {
                System.out.print("@"+s2.substring(s2.length()-1));
            }

       }}
}