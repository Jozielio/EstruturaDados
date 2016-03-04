package ExercicioLista01;

public class SomaMatriz {

	private int matrizResultado[][];
	
	int[][] Somar(int matriz1[][], int matriz2[][], int linha, int coluna){

		matrizResultado = new int[linha][coluna];

/*Caso os valores de linha e coluna sejam passados manualmente ao chamar
 o metodo Somar dessa classe, o trecho de código abaixo deve inserido no progarama
 fazendo com o código não seja marcado como comentario!
  
  		if(linha != coluna){
			
			System.out.println("A Matriz precisa ser quadrada para realizar a Soma!");
			return;
			
			}else{*/
		
		for(int i = 0; i < matrizResultado.length; i++){
			for(int j = 0; j < matrizResultado[i].length;j++){
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		return matrizResultado;
	}
}