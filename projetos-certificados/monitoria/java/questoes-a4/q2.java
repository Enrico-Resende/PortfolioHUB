import java.util.Scanner;
public class q4{
  public static double med(double x, double y){
    return (x+y)/2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite duas notas: ");
    double a = sc.nextDouble(), b = sc.nextDouble();
    System.out.printf("Media das notas: %f", med(a, b));
  }
}
