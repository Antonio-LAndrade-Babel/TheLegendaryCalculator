package com.legendary.calculator;



import com.legendary.controller.CalculatorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"com.legendary.controller" , "com.legendary.service", "com.legendary.calculator"})
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Bean
	public CommandLineRunner run (CalculatorService calculator) {
		return args -> {
			Scanner scanner = new Scanner(System.in);
			boolean exitApplication = false;
			while (!exitApplication){
				System.out.println("[1] Sumar\n[2] Restar\n[3] Multiplicar\n[4] Dividir\n[5] Salir");
				System.out.print("Por favor, selecciona una opción (o no...): ");
				int option = scanner.nextInt();
				if (option == 5) exitApplication = true;

				System.out.print("Escribe el primer operando. De preferencia, que sea un número.");
				double operatorA = scanner.nextDouble();
				System.out.print("Ahora el operando B. Igual, por dios, que sea un número.");
				double operatorB = scanner.nextDouble();

				try {
					double result = 0;
					switch(option) {
						case 1:
							result = calculator.add(operatorA, operatorB);
							break;
						case 2:
							result = calculator.subtract(operatorA, operatorB);
							break;
						case 3:
							result = calculator.multiply(operatorA, operatorB);
							break;
						case 4:
							result = calculator.divide(operatorA, operatorB);
							break;
						default:
							System.out.println("¿En serio has elegido una opción incorrecta?...");
					}
					System.out.println("El resultado obtenido es: " + result);
				} catch (IllegalArgumentException e) {
					System.out.println("Error fatalísimo!!!" + e.getMessage());
				}
			}
		};
	}
}
