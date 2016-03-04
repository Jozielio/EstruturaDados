package ExercicioLista01;
import java.util.Random;

public class PopularMatriz {

	int[][] popularMatriz(int linha, int coluna){
	
		int matrizResultado[][] = new int[linha][coluna];
		Random random = new Random();

		for(int i = 0;i < matrizResultado.length; i++){
			for(int j = 0; j < matrizResultado[i].length; j++){
				matrizResultado[i][j] = random.nextInt(5);
			}
		}

		return matrizResultado;
	
	}
}