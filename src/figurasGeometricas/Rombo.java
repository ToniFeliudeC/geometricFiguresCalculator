package figurasGeometricas;

import java.util.Scanner;

import excepciones.negativeInput;
import interfaces.CalculosCaracteristicas;

public class Rombo implements CalculosCaracteristicas {

	// Atributos
	private static Scanner teclado = new Scanner(System.in);
	private float diagonalMayor;
	private float diagonalMenor;

	// Constructor vacío
	public Rombo() {
	}

	// Constructor completo
	public Rombo(float diagonalMayor, float diagonalMenor) {
		this.setDiagonalMayor(diagonalMayor);
		this.setDiagonalMenor(diagonalMenor);
	}

	// Constructor copia
	public Rombo(Rombo rombo) {
		this.diagonalMayor = rombo.diagonalMayor;
		this.diagonalMenor = rombo.diagonalMenor;
	}

	// toString
	@Override
	public String toString() {
		return "Rombo [diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + "]";
	}

	// Getters & Setters
	public float getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(float diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	public float getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	// Métodos
	public void solicitarDatos() throws negativeInput {

		System.out.println("Introduce la diagonal mayor del rombo: ");
		float diagonalMayor = Float.parseFloat(teclado.nextLine());

		System.out.println("Introduce la diagonal menor del rombo: ");
		float diagonalMenor = Float.parseFloat(teclado.nextLine());
		
		if (diagonalMayor <= 0 || diagonalMenor <= 0) {
			throw new negativeInput("Ningún valor puede ser menor o igual a 0!");
		}
		
		this.setDiagonalMayor(diagonalMayor);
		this.setDiagonalMenor(diagonalMenor);

	}

	@Override
	public void calcularArea() {
		float area = (diagonalMayor * diagonalMenor) / 2;
		this.imprimirCaracteristicas();
		System.out.println("		  Área: " + area + "\n");
	}

	@Override
	public void calcularVolumen() {
		this.imprimirCaracteristicas();
		System.out.println("Una figura de 2 dimensiones no tiene volumen." + "\n");
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("==============================================================");
		System.out.println("==========Calculadora de Toni Feliu de Cabrera Salas==========");
		System.out.println("==============================================================" + "\n");
		System.out.println("		  Diagonal mayor: " + this.diagonalMayor);
		System.out.println("		  Diagonal menor: " + this.diagonalMenor + "\n");
	}

}
