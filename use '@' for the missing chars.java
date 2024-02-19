/*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.



atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

       if (word.length()>=2 ) {
            System.out.print(word.substring(0,2));
        }
        else {
           System.out.print(word.substring(0)+"@");


       }}
}