package ExercicioLista01;

public class Fatorial {

	public static int fatorial(int n) {
		if (n == 0) { // caso base
			return 1;
		} else { // caso recursivo
			return n * fatorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		f.fatorial(5);
	}
}
