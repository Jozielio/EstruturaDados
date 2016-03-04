package ExercicioLista01;

public class Main extends Matriz{
	
	public static void main(String[] args) {

		PopularMatriz pm = new PopularMatriz();
		matriz1 = pm.popularMatriz(matriz1.length, matriz1[0].length);
		matriz2 = pm.popularMatriz(matriz2.length, matriz2[0].length);
			
		ProdutoMatriz p = new ProdutoMatriz();
		matrizResultado = p.MultiplicarMatriz(matriz1, matriz2);
		
		if(matrizResultado == null){
			return;
		}
			
		Imprimir imp = new Imprimir();
		imp.ImprimirMatriz(matriz1, matriz1.length, matriz1[0].length);
		imp.ImprimirMatriz(matriz2, matriz2.length, matriz2[0].length);
		imp.ImprimirMatriz(matrizResultado, matrizResultado.length, matrizResultado[0].length);

	}
}