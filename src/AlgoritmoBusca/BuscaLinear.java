package AlgoritmoBusca;

public class BuscaLinear {

	public Integer BLinear(int vetor[], int busca){
		
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] == busca){
				return vetor[i];
			}
		}
		return null;
	}
	
}
