package AlgoritmoBusca;

public class BuscaBinaria{

	private int vetor[];
	private int inicio, fim, busca;
	
	public BuscaBinaria(int vetor[], int inicio, int fim, int busca){
		
		this.vetor = vetor;
		this.inicio = inicio;
		this.fim = fim;
		this.busca = busca;
		BuscaBinaria();
		
	}
	
	int BuscaBinaria(){

		int meio;
		meio = (inicio + fim)/2;

		if(busca == meio){
			return meio;
		}
			
		else if(busca < meio){

			new BuscaBinaria(vetor, inicio, meio - 1, busca);
		}
			
		else{

			new BuscaBinaria(vetor, meio + 1, fim, busca);
		}
		
		return busca;
	}
}