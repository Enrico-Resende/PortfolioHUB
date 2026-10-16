import java.util.Scanner;
public class q4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int n = sc.nextInt();
    System.out.println("Tabuada: ");
    for (int i = 1; i < 11; i++) {
      System.out.printf("%d ----- %d\n", i, i*n);
    }
  }
}
