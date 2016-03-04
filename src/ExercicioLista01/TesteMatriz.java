package ExercicioLista01;

public class TesteMatriz extends Matriz{

	public static void main(String[] args) {
		
//		System.out.println(matriz1.length);
//		System.out.println(matriz1[0].length);
		
		PopularMatriz pm = new PopularMatriz();
		matriz1 = pm.popularMatriz(matriz1.length, matriz1[0].length);
		matriz2 = pm.popularMatriz(matriz2.length, matriz2[0].length);
			
//		SomaMatriz sm = new SomaMatriz();
//		matrizResultado = sm.Somar(matriz1, matriz2, tamanho, tamanho);

		ProdutoMatriz p = new ProdutoMatriz();
		matrizResultado = p.MultiplicarMatriz(matriz1, matriz2);
//		System.out.println(matriz1.length + " " +  matriz2[0].length);
		
		if(matrizResultado == null){
			return;
		}
			
		Imprimir imp = new Imprimir();
		imp.ImprimirMatriz(matriz1, matriz1.length, matriz1[0].length);
		imp.ImprimirMatriz(matriz2, matriz2.length, matriz2[0].length);
		imp.ImprimirMatriz(matrizResultado, matrizResultado.length, matrizResultado[0].length);

	}	
}