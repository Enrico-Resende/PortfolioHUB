import java.util.Scanner;
public class q3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("qtos numeros? ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.printf("%d ", i+1);
    }
  }
}
