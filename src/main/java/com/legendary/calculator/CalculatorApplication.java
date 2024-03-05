package com.legendary.calculator;

import com.legendary.controller.Calculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public CommandLineRunner run (Calculator calculator) {
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("[1] Sumar\n[2] Restar\n[3] Multiplicar\n[4] Dividir\n[5] Salir");
			System.out.print("Por favor, selecciona una opción (o no...): ");
			int option = scanner.nextInt();
			if (option == 5) break;

			System.out.print("Escribe el primer operando. De preferencia, que sea un número.");
			double operatorA = scanner.nextDouble();
			System.out.print("Ahora el operando B. Igual, por dios, que sea un número.");
			double operatorB = scanner.nextDouble();

			try {
				double result = 0;
				switch(option) {
					
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Error fatalísimo!!!" + e.getMessage());
			}
		}
	}
}
