package menu;

import java.util.Scanner;

import excepciones.invalidInput;
import figurasGeometricas.Cilindro;
import figurasGeometricas.Cono;
import figurasGeometricas.Cubo;
import figurasGeometricas.Rombo;

public class Menu {

	// Atributos
	private static Scanner teclado = new Scanner(System.in);

	//Método main de la aplicación
	public static void main(String[] args) throws invalidInput {

		Rombo rombo = new Rombo();
		Cilindro cilindro = new Cilindro();
		Cono cono = new Cono();
		Cubo cubo = new Cubo();

		boolean salir = false;

		while (!salir) {
			System.out.println("1.-Calcular área de un rombo.");
			System.out.println("2.-Calcular área de un cilindro.");
			System.out.println("3.-Calcular áreas de un cono.");
			System.out.println("4.-Calcular área de un cubo.");
			System.out.println("5.-Calcular volumen de un cilindro.");
			System.out.println("6.-Calcular volumen de un cono.");
			System.out.println("7.-Calcular volumen de un cubo.");
			System.out.println("8.-Salir");

			String choice = teclado.nextLine();

			switch (choice) {
			case "1":
				rombo.solicitarDatos();
				rombo.calcularArea();
				break;
			case "2":
				cilindro.solicitarDatos();
				cilindro.calcularArea();
				break;
			case "3":
				cono.solicitarDatos();
				cono.calcularArea();
				break;
			case "4":
				cubo.solicitarDatos();
				cubo.calcularArea();
				break;
			case "5":
				cilindro.solicitarDatos();
				cilindro.calcularVolumen();
				break;
			case "6":
				cono.solicitarDatos();
				cono.calcularVolumen();
				break;
			case "7":
				cubo.solicitarDatos();
				cubo.calcularVolumen();
				break;
			case "8":
				salir = true;
			}
		}
	}
}
