package AlgoritmoBusca;

public class FibonacciNaoRecursivo {

	private int a, b, fb;
	
	
	Integer fibonacci(int n){
		
		a = 0;
		b = 1;
		
		for(int i = 1; i <= n;i++){

			if(i == n){
				return fb;
			}

			fb = b + a;
			a = b;
			b = fb;
			
		}
		
		return null;
	}	
}