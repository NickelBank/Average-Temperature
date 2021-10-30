///////////////////////////////////////////////////////////////////////////////////////////
//Main.java
//Nicholas LeBlanc
//12/30/20
//Calculate the average low tempurature
///////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    double average;

    int temp = scan.nextInt();

    int sentinel = 999;

    while (temp < sentinel){
      sum += temp;
      temp = scan.nextInt();

      count++;
    }

    if(count > 0){
      average = (double) sum/count;
      System.out.println("The average low temperature is: " + average);
    }
    else{
      System.out.println("There was no data entered");
    }
  }
}