import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        if (word.length() >= 2 ) {

        System.out.println(word.substring(word.length() - 2) + word.substring(0, word.length() - 2) );

            }
        else {
            System.out.println("please Enter word more than 2 character ");
        }

    }
}


