import java.util.Scanner;

public class Primerange
 {
  public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the number: ");
 int input = scanner.nextInt();
int count = 0;
for (int i = 2; i < input; i++)
 {
boolean isPrimeNumber = true;
for (int j = 2; j < i; j++)
 {
   if (i % j == 0) {
   isPrimeNumber = false;
   break; 
    }
  }
  if (isPrimeNumber)
 {
   count++;
   System.out.print(i + ", ");
}
}
  System.out.println("Count: " + count);
    }
}