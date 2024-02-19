import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        if (word.length() >= 2)
        {
            if (word.endsWith("ly"))
                System.out.println("true");
            else
                System.out.println("false");
        }

         else
        {
            System.out.println("false");
        }

}}