import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        String lastTwoChars = word.substring(word.length() - 2);

        System.out.println( lastTwoChars+lastTwoChars+lastTwoChars);


    }
}