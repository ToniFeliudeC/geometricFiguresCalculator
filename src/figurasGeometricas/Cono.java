package figurasGeometricas;

import interfaces.CalculosCaracteristicas;
import static java.lang.Math.PI;

import java.util.Scanner;

import excepciones.negativeInput;

public class Cono implements CalculosCaracteristicas {

	//Atributos
	private static Scanner teclado = new Scanner(System.in);
	private float radio;
	private float altura;
	private float generatriz;
	
	//Constructor vacío
	public Cono() {}
	
	//Constructor completo
	public Cono(float radio, float altura, float generatriz) {
		this.setRadio(radio);
		this.setAltura(altura);
		this.setGeneratriz(generatriz);
	}
	
	//Constructor copia
	public Cono(Cono cono) {
		this.radio = cono.radio;
		this.altura = cono.altura;
		this.generatriz = cono.generatriz;
	}

	//toString
	@Override
	public String toString() {
		return "Cono [radio=" + radio + ", altura=" + altura + ", generatriz=" + generatriz + "]";
	}

	//Getterse & Setters
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

	public float getGeneratriz() {
		return generatriz;
	}

	public void setGeneratriz(float generatriz) {
		this.generatriz = generatriz;
	}

	//Métodos
	public void solicitarDatos() throws negativeInput {
			
			System.out.println("Introduce el radio del cono: ");
			float radio = Float.parseFloat(teclado.nextLine());
			
			System.out.println("Introduce la altura del cono: ");
			float altura = Float.parseFloat(teclado.nextLine());
			
			System.out.println("Introduce la generatriz del cono: ");
			float generatriz = Float.parseFloat(teclado.nextLine());
			
			if (altura <= 0 || radio <= 0 || generatriz <= 0) {
				throw new negativeInput("Ningún valor puede ser menor o igual a 0!");
			}
		
			this.setRadio(radio);
			this.setAltura(altura);	
			this.setGeneratriz(generatriz);
			
	}
	
	@Override
	public void calcularArea() {
		float areaLateral = (float) PI * this.radio * this.generatriz;
		float areaSuperficie = (float) PI * (this.generatriz + this.radio);
		this.imprimirCaracteristicas();
		System.out.println("		  Área lateral: " +  areaLateral);
		System.out.println("		  Área de la superfície: " + areaSuperficie + "\n");
		
		
	}

	@Override
	public void calcularVolumen() {
		float volumen = ((float) PI * (this.radio * this.radio) * this.altura) / 3;
		this.imprimirCaracteristicas();
		System.out.println("		  Volumen: " + volumen + "\n");
		
		
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("==============================================================");
		System.out.println("==========Calculadora de Toni Feliu de Cabrera Salas==========");
		System.out.println("==============================================================" + "\n");
		System.out.println("		  Radio: " + this.radio);
		System.out.println("		  Altura: " + this.altura);
		System.out.println("		  Generatriz: " + this.generatriz + "\n");
		
	}
	
	
}
