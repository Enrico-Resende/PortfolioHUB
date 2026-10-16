import java.util.Scanner;
public class q3{
  public static double input (Scanner sc){
    System.out.print("Nota: ");
    return sc.nextDouble();
  }

  public static double med(double a, double b){
    return (a+b)/2;
  }

  public static boolean aprovado(double nota){
    return (nota>=6);
  }

  public static void verificar(boolean a){
    if (a){
    System.out.println("Aprovado!");
    }else{
      System.out.println("Reprovado");
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    verificar(aprovado(q2.med(input(sc), input(sc))));
  }
}
