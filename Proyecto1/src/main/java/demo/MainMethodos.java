package demo;

import java.io.ObjectOutput;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMethodos extends Metodos2 {
	
	public static void main(String[] args) {
		
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos (9,3);
		//Metodos2 objecto = new Metodos2(); -- se quita cuando se hereda
		
		System.out.println(nombreObjeto.sumatoria(66,3));
		System.out.println(heredar);
		
		nombreObjeto.mostrarMensaje();
		
		String elementoGuardado =nombreObjeto.mostrarNombre("Sergio");
		System.out.println(elementoGuardado);
		
		
		Metodos.prueba();
		
		//se debe tener una variable donde pueda guardar las listas//
		
		//List<String> listaNombres = objecto.listaDeNombres(); -- se quita por heredar
		//List<Integer> listaNumeros = objecto.listaNumeros();
		
		List<String> listaNombres = listaDeNombres();
		List<Integer> listaNumeros = listaNumeros();
		
		//Hay dos modos de mostrar la lista//
		//modo1//
		for (String nombre : listaNombres) {
			System.out.println(nombre);
			
		}
		System.out.println("for dos puntos");
		
		//modo2//
		for(int indice=0 ; indice<listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));
			
		}
		System.out.println("for con index");
		
		for (int numero : listaNumeros) {
			System.out.println(numero);
		}
		
		List<String> nombresSinElementosDuplicados = listaNombres.stream().distinct().collect(Collectors.toList());
		//ORDENANDO DE MANERA ALFABETICA CON EL SORT//
		Collections.sort(nombresSinElementosDuplicados);
		System.out.println(nombresSinElementosDuplicados);
		
		//ORDENADO DE REVERSA//
		Collections.sort(nombresSinElementosDuplicados, Collections.reverseOrder());
		System.out.println(nombresSinElementosDuplicados);
		
		
		//PARA ORDENAR LISTA DE NUMEROS// //SORT --> ORDENA DE MENOR A MAYOR// //REVERSEORDER--> INVIERTE EL ORDEN//
		System.out.println(Collections.max(listaNumeros));
		System.out.println(Collections.min(listaNumeros));
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);
		
		//QUITAR LOS REPETIDOS EN LISTA DE NUMEROS//
		Object last = null; 
		int numCount = 0;
		Iterator <Integer> i = listaNumeros.iterator();
		
		while (i.hasNext()) {
			Object temp = i.next();
			
			if(temp.equals(last)) {
				i.remove();
				numCount++; // es igual a poner numCount +1;//
			}else {
				last=temp;
			}
		}
		System.out.println(listaNumeros);
		System.out.println(numCount);
		
		
		//PARA COMPARAR LISTAS CON  LETRAS//
		List <String> nombres1 = listaDeNombres();
		List <String> nombres2 = listaDeNombres2();
		
		Collections.sort(nombres1);
		Collections.sort(nombres2);
		
		boolean isIgual = nombres1.equals(nombres2);
		System.out.println(isIgual);
		
		if(isIgual == true) {
			System.out.println("Las listas son iguales");
		}else {
			System.out.println("Las listas no son iguales");
		}
		
	}

}
