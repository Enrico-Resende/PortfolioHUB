import java.util.Scanner;
public class quicksort{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros: ");
    int n = sc.nextInt();
    double[] a = new double[n];
    System.out.printf("Digite os %d numeros da array: ", n);
    for (int i = 0; i < n; i++){
      a[i] = sc.nextDouble();
    }

    double startTime = System.currentTimeMillis();
    System.out.println("Running! Wait...");
    sort(a, 0, n-1);
    printVetor(a);
    double endTime = System.currentTimeMillis();
    System.out.println("\nRun time: " + (endTime - startTime) + "ms");
  }

  public static double[] sort(double[] a, int min, int max){
    if (!(min < max)){
      return a;
    }

    int pIndex = max;
    int i;
    double temp;
    int j = min-1;

    for (i = min; i < max; i++) {
      if (a[i] < a[pIndex]){
        j++;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }

    j++;
    temp = a[pIndex];
    a[pIndex] = a[j];
    a[j] = temp;

    sort(a, min, j-1);
    sort(a, j+1, max);
    return a;
  }

  public static void printVetor(double[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%.2f ", a[i]);
    }
  }

}
