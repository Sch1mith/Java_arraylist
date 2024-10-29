import java.util.ArrayList;

public class Array_01 {

	private static ArrayList<String> fruta = new ArrayList<>();
	
	public static void main(String[] args) {

		fruta.add("Banana");
		fruta.add("Maçã");
		fruta.add("Kiwi");
		fruta.add("Jabuticaba");
		fruta.add("Amora");		
		
		exibir();
	
		fruta.remove(2);
		
		System.out.println("\n");
		
		exibir();
		
		System.out.println("\n");
		
		busca("maçã");
		busca("amendoim");
		
	}

	private static void exibir() {
		int tamanho = fruta.size();
		System.out.println("as frutas são \n");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(fruta.get(i));
		}
	}
	
	private static boolean busca(String frut) {
		int tamanho = fruta.size();
		for (int i = 0; i < tamanho; i++) {
			if(frut.equals(fruta.get(i).toLowerCase())) {
				System.out.println("item encontrado");
				return true;
			}
		}
		System.out.println("item não encontrado");
		return false;
	}
	
}
