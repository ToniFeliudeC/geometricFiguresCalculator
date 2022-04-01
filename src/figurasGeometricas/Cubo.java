package figurasGeometricas;

import java.util.Scanner;

import excepciones.negativeInput;
import interfaces.CalculosCaracteristicas;

public class Cubo  implements CalculosCaracteristicas {

	//Atributos
	private Scanner teclado = new Scanner(System.in);
	private float aristas;
	
	//Constructor vacío
	public Cubo() {}
	
	//Constructor completo
	public Cubo(float aristas) {
		this.setAristas(aristas);
	}
	
	//Constructor copias
	public Cubo(Cubo cubo) {
		this.aristas = cubo.aristas;
	}

	//toString
	@Override
	public String toString() {
		return "Cubo [aristas=" + aristas + "]";
	}

	//Getters & Setters
	public float getAristas() {
		return aristas;
	}

	public void setAristas(float aristas) {
		this.aristas = aristas;
	}

	//Métodos
	public void solicitarDatos() throws negativeInput {
		
			System.out.println("Introduce la longitud de las aristas del cubo: ");
			float aristas = Float.parseFloat(teclado.nextLine());
			
			if (aristas <= 0) {
				throw new negativeInput("Ningún valor puede ser menor o igual a 0!");
			}
			
			this.setAristas(aristas);

	}
	
	@Override
	public void calcularArea() {
		float area = 6 * (this.aristas * this.aristas);
		this.imprimirCaracteristicas();
		System.out.println("		  Área: " + area + "\n");
	}

	@Override
	public void calcularVolumen() {
		float volumen = (this.aristas * this.aristas * this.aristas);
		this.imprimirCaracteristicas();
		System.out.println("		  Volumen: " + volumen + "\n");
		
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("==============================================================");
		System.out.println("==========Calculadora de Toni Feliu de Cabrera Salas==========");
		System.out.println("==============================================================" + "\n");
		System.out.println("		  Aristas: " + this.aristas + "\n");
	}
	
	
	
	
}
