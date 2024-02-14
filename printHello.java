import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter Your Name :");

    String name = myObj.nextLine();  
    System.out.println( "Hello " + name + "!");

  
  }
}