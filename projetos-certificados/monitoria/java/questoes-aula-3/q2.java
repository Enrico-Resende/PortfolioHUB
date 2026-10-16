import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    System.out.print("Digite sua nota (0 a 100): ");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    if (i > 10 || i <0){
      System.out.println("Nota invalida");
    }else if (i >= 90) {
      System.out.println("SS!");
    }else if(i >= 75) {
      System.out.println("MS");
    }else if (i >= 60) {
      System.out.println("MM");
    }else if (i >= 40) {
      System.out.println("MI");
    }else{
      System.out.println("II");
    }
  }
}
