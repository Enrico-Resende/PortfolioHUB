import java.util.Scanner;
public class q1{
  public static int dobro(int n){
    return 2*n;
  }

  public static void main(String[] args) {
    System.out.print("Digite um numero: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.printf("Dobro de %d: %d", n, dobro(n));
  }
}
