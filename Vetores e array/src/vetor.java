import java.util.Random;

public class vetor {

	public static void main(String[] args) {
		int vet[] = new int[10];
		Random aleatorio = new Random();
		int soma= 0;
		int flex = 0;
		int maior = 0;
		int menor = 10;
		
		for(int i = 0 ; i  < 10; i++) {
			vet[i] = aleatorio.nextInt(100) + 1;
			soma = vet[i] + soma;
			if (vet[i] > maior) {
				maior = vet[i];
			}
			if(vet[i] < menor) {
				menor = vet[i];
			}
			System.out.println("numeros: " + vet[i]);
		}
		
		System.out.println("\n O menor numero é: "+ menor);
		System.out.println("O maior numero é: " + maior);
		System.out.println("A soma dos valores inseridos é: " + soma);	
	}

}
