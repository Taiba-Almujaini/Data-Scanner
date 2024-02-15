import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
     System.out.println("Enter brackets:");
     String bracket = myObj.nextLine();
     
     
    System.out.println("Enter word:");
    String s1 = myObj.nextLine();
    
    System.out.println( bracket.substring(0, 2) +s1 +bracket.substring(2));


  }
}