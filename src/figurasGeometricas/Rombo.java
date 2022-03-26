package figurasGeometricas;

import java.util.Scanner;

import excepciones.invalidInput;
import interfaces.CalculosCaracteristicas;

public class Rombo implements CalculosCaracteristicas {
	
	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private float diagonalMayor;
	private float diagonalMenor;
	
	//Constructor vac�o 
	public Rombo() {}
	
	//Constructor completo
	public Rombo(float diagonalMayor, float diagonalMenor) {
		this.setDiagonalMayor(diagonalMayor);
		this.setDiagonalMenor(diagonalMenor);
	}
	
	//Constructor copia
	public Rombo(Rombo rombo) {
		this.diagonalMayor = rombo.diagonalMayor;
		this.diagonalMenor = rombo.diagonalMenor;
	}

	//toString
	@Override
	public String toString() {
		return "Rombo [diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + "]";
	}

	//Getters & Setters
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
	
	//M�todos
	public void solicitarDatos() {	
		try {
			System.out.println("Introduce la diagonal mayor del rombo: ");
			this.setDiagonalMayor(Integer.parseInt(teclado.nextLine()));
		
			System.out.println("Introduce la diagonal menor del rombo: ");
			this.setDiagonalMenor(Integer.parseInt(teclado.nextLine()));
		}
		catch (Exception error) {
			System.out.println(error);
		}
	}
	
	@Override
	public void calcularArea() {
		float area = (diagonalMayor * diagonalMenor) / 2;
		this.imprimirCaracteristicas();
		System.out.println("		  �rea: " + area + "\n");
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
