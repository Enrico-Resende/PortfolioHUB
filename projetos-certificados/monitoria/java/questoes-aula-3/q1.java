import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escreva sua idade: ");
    if (sc.nextInt() >= 18){
      System.out.println("Maior de idade parabens");
    }else{
      System.out.println("Menor de idade");
    }
  }
}
