import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float somaNotas = 0, peso, somaPesos = 0;
		int n = 3;
		
		for (int i=0; i<n; i++){
			System.out.printf("Digite o peso da nota %d: ", i+1);
			peso = sc.nextFloat();
			somaPesos+= peso;
			System.out.printf("Digite a nota %d: ", i+1);
			somaNotas+= sc.nextFloat() * peso;
		}
		
		System.out.printf("Media ponderada: %.2f", somaNotas/somaPesos);
	}
}
