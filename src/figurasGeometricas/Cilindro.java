package figurasGeometricas;

import interfaces.CalculosCaracteristicas;
import static java.lang.Math.PI;

import java.util.Scanner;

import excepciones.negativeInput;

public class Cilindro implements CalculosCaracteristicas {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private float radio;
	private float altura;
	
	//Constructor vacío
	public Cilindro() {}
	
	//Constructor completo
	public Cilindro(float radio, float altura) {
		this.setRadio(radio);
		this.setAltura(altura);
	}
	


	//Constructor copia
	public Cilindro(Cilindro cilindro) {
		this.radio = cilindro.radio;
		this.altura = cilindro.altura;
	}

	//toString
	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
	}
	
	//Getters & Setters
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	//Métodos
	public void solicitarDatos() throws negativeInput {

			System.out.println("Introduce la altura del cilindro: ");
			float altura = Float.parseFloat(teclado.nextLine());
			
			System.out.println("Introduce el radio del cilindro: ");
			float radio = Float.parseFloat(teclado.nextLine());
			
			if (altura <= 0 || radio <= 0) {
				throw new negativeInput("Ningún valor puede ser menor o igual a 0!");
			}

			this.setAltura(altura);
			this.setRadio(radio);

	}	
	@Override
	public void calcularArea() {
		float area = 2 * (float) PI * this.radio * (this.radio + this.altura);
		this.imprimirCaracteristicas();
		System.out.println("		     Área: " + area + "\n");
	}

	@Override
	public void calcularVolumen() {
		float volumen = (float) PI * (this.radio * this.radio) * this.altura;
		this.imprimirCaracteristicas();
		System.out.println("		     Volumen: " + volumen + "\n");
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("==============================================================");
		System.out.println("==========Calculadora de Toni Feliu de Cabrera Salas==========");
		System.out.println("==============================================================" + "\n");
		System.out.println("		     Radio: " + this.radio);
		System.out.println("		     Altura: " + this.altura + "\n");
	}
}
