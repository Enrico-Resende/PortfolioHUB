import java.util.Scanner;
public class q4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v[];
    System.out.print("qtos numeros no vetor? ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++){
      System.out.printf("Digite o numero %d do vetor: ", i+1);
      v[i] = sc.nextInt();
    }
    printVetor(v[], n);
  }
  public static void printVetor(int v[], int n){
    for (int i = 0; i < n; i++) {
      System.out.print(v[i] + " ");
    }
  }
}
