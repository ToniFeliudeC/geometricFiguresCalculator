package figurasGeometricas;

import java.util.Scanner;

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
	public void solicitarDatos() {
		
		try {
			System.out.println("Introduce la longitud de las aristas del cubo: ");
			this.setAristas(Integer.parseInt(teclado.nextLine()));
		}
		catch (Exception error) {
			System.out.println(error);
		}
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
