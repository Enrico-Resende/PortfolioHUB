import java.util.Scanner;
public class sort{
  public static void main(String[] args) {
    int n = 10;
    double[] a = new double[n];
    System.out.print("Digite os 10 numeros da array: ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++){
      a[i] = sc.nextDouble();
    }
    sort(a, n);
    printVetor(a, n);
  }

  public static void sort(double[] a, int n){
    boolean flag = true;
    while(flag){
      flag = false;
      for (int i = 0; i < n-1; i++) {
        double temp = a[i];
        if(a[i] > a[i+1]){
          a[i] = a[i+1];
          a[i+1] = temp;
          flag = true;
        }
      }
    }
  }
  public static void printVetor(double[] a, int n){
    for (int i = 0; i < n; i++) {
      System.out.printf("%.2f ", a[i]);
    }
  }

}
