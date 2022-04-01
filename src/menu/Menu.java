package menu;

import java.util.Scanner;

import excepciones.negativeInput;
import figurasGeometricas.Cilindro;
import figurasGeometricas.Cono;
import figurasGeometricas.Cubo;
import figurasGeometricas.Rombo;

public class Menu {

	// Atributos
	private static Scanner teclado = new Scanner(System.in);

	// Método main de la aplicación
	public static void main(String[] args) throws negativeInput {

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
				try {
					rombo.solicitarDatos();
					rombo.calcularArea();
				} catch (Exception e) {
					if (e.getMessage().equals("Ningún valor puede ser menor o igual a 0!")) {
					System.out.println(e.getMessage());
					}
					else {
						System.out.println("Debes introducir valores numéricos!");
					}
				}
				break;
			case "2":
				try {
					cilindro.solicitarDatos();
					cilindro.calcularArea();
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case "3":
				try {
					cono.solicitarDatos();
					cono.calcularArea();
				} catch (Exception e) {
					if (e.getMessage().equals("Ningún valor puede ser menor o igual a 0!")) {
					System.out.println(e.getMessage());
					}
					else {
						System.out.println("Debes introducir valores numéricos!");
					}
				}
				break;
			case "4":
				try {
					cubo.solicitarDatos();
					cubo.calcularArea();
				} catch (Exception e) {
					if (e.getMessage().equals("Ningún valor puede ser menor o igual a 0!")) {
					System.out.println(e.getMessage());
					}
					else {
						System.out.println("Debes introducir valores numéricos!");
					}
				}
				break;
			case "5":
				while (true) {
					try {
						cilindro.solicitarDatos();
						cilindro.calcularVolumen();
						break;
					} catch (Exception e) {
						if (e.getMessage().equals("Ningún valor puede ser menor o igual a 0!")) {
						System.out.println(e.getMessage());
						}
						else {
							System.out.println("Debes introducir valores numéricos!");
						}
					} 
				}
				break;
			case "6":
				while (true) {
					try {
						cono.solicitarDatos();
						cono.calcularVolumen();
						break;
					} catch (Exception e) {
						if (e.getMessage().equals("Ningún valor puede ser menor o igual a 0!")) {
						System.out.println(e.getMessage());
						}
						else {
							System.out.println("Debes introducir valores numéricos!");
						}
					} 
				}
				break;
			case "7":
				while (salir) {
					try {
						cubo.solicitarDatos();
						cubo.calcularVolumen();
						break;
					} catch (Exception e) {
						if (e.getMessage().equals("Ningún valor puede ser menor o igual a 0!")) {
						System.out.println(e.getMessage());
						}
						else {
							System.out.println("Debes introducir valores numéricos!");
						}
					} 
				}
				break;
			case "8":
				salir = true;
				break;
			}
		}
	}
}
