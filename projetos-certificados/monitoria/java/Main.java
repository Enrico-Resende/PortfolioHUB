import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float soma = 0;
    System.out.print("Qtas notas: ");
    int n = sc.nextInt();
    System.out.print("Escreva as notas: ");
    for (int i = 0; i<n; i++){
      soma+= sc.nextFloat();
    }
    System.out.printf("Media das notas: %.2f", soma/n);
  if(false){
  }
  else if(true){
    System.out.print("aluo");
  }

  }

}
