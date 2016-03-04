package AlgoritmoBusca;

public class Main {

	public static void main(String[] args) {
		
		int tam = 100;
		int vetor[] = new int[tam];
		int busca = 9;
		
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = i + 1;
		}
		
		BuscaBinaria bb = new BuscaBinaria(vetor, 0, tam, busca);
		System.out.println(bb.BuscaBinaria());
	}
}