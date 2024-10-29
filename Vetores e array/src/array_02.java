
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class array_02 {

	private static ArrayList<Integer> num = new ArrayList<>();
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i = 0; i < 15; i++) {
			num.add(rand.nextInt(100) + 1);
		}
		System.out.println("Numeros não ordenados: " + num);
		Collections.sort(num);
		System.out.println("\n Numeros ordenados: " + num + "\n");
		System.out.println("A quantida de numeos pares é: " + pares(num));

	}

	private static int pares(ArrayList<Integer> numeros) {
		int tamanho = numeros.size();
		int qtdPares = 0;
		double flex = 0;
		for(int i = 0; i < tamanho; i++) {
			flex = numeros.get(i) % 2;
			if (flex == 0) {
				qtdPares++;
			}
		}
		return qtdPares;
	}
	
}