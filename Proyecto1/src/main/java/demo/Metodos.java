package demo;

public class Metodos {
	int numero1, numero2;
	
	public Metodos (int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
		
	}
	
	public Metodos() {
		
	}
	
	public static void main(String[] args) {
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos (9,3);
		System.out.println(nombreObjeto.sumatoria(66,3));
		
		nombreObjeto.mostrarMensaje();
		
		String elementoGuardado =nombreObjeto.mostrarNombre("Sergio");
		System.out.println(elementoGuardado);
		
		Metodos.prueba();
	}
	
	public void mostrarMensaje () {
		
		System.out.println("Hola Mundo");

	}
	
	public int sumatoria (int numero1, int numero2) {
		return numero1 + numero2;
		
	}
	
	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}
	
	public static void prueba() {
		System.out.println("Método estatico");
	}
	
}