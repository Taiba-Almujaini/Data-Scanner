import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        if (word.length() % 2==0) {
            int middleIndex = word.length() / 2;
            System.out.println(word.substring(middleIndex - 1, middleIndex + 1));


        } else {
            System.out.println("the length of the word is odd , please enter even length of the word");
        }
    }
}