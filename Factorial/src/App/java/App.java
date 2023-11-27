package App.java;

public class App {

		public static void main(String[] args) {
			MultiFactorial mf = new MultiFactorial(150);
			mf.imprimirFactorial();
		}
		
		/*
		public static void main(String[] args) {
			MultiFactorial mf = new MultiFactorial(0);
			mf.imprimirFactorial();
		}
		
		public static int factorial(int n) {
			int resultado = 1;
			for(int i=n; i >= 1; i--) {
				resultado = resultado * i;
				System.out.println(i);
			}
			return resultado;
			
		}
		
		public static int multi(int a, int b) {
			return a*b;
		}
		*/
}
	

