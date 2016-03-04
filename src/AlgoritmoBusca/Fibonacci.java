package AlgoritmoBusca;

public class Fibonacci {

	public int fibonacci(int n){
		
		if(n==0 || n==1){
			return n;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibonacci(11));
	}
}
