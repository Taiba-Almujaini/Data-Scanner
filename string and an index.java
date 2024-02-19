
/*

Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.



twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();
        System.out.print("Enter an index: ");
        int index = str.nextInt();

        if (index < 0 || index > word.length() - 2) {
            System.out.print(word.substring(0, 2));
        }
        else {
            System.out.print(word.substring(index, index + 2));;
        }



}}