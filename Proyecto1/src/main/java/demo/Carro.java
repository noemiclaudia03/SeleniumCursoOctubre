package demo;

public class Carro {
	static int numero;
	
	public static void main(String[] args) {
		
		numero=4;
		int numero2=3;
		boolean verdaderooOfalso;
		
		System.out.println(numero+numero2*numero);
		
		String cadeDeCaracteres;
		
		cadeDeCaracteres="Sergio Ramones";
		System.out.println(cadeDeCaracteres+" Curso de Selenium");
		
		verdaderooOfalso= cadeDeCaracteres.equals("Sergio Ramones");
		System.out.println(verdaderooOfalso);
		
		if (verdaderooOfalso==true) {
			System.out.println ("Nombre es igual");
		}else {
			System.out.print("Nombre NO es igual");	
				}
		
		

		
		
	
		
		
	}
	
	
	
}
