import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        if (word.length()>2) {
            System.out.println(word.substring(1, word.length() - 1));;

        }
        else {
            System.out.println("please enter the word with more than 2 character");
        }
    }
}