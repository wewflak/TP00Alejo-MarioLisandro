package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.java.Calculadora.Calculadora;
import main.java.Calculadora.Operaciones;

@SpringBootApplication
public class Trabajo00AlejoMarioLisandroApplication {

	public static void main(String[] args) {
		SpringApplication.run(Trabajo00AlejoMarioLisandroApplication.class, args);
			    Operaciones unaCalculadora = new Calculadora();
			    unaCalculadora.setNum1(50);
			    unaCalculadora.setNum2(5);
			    System.out.println("El resultado de la Suma es: " + unaCalculadora.resolverSuma());
			    System.out.println("El resultado de la Resta es: " + unaCalculadora.resolverResta());
			    System.out.println("El resultado de la Multiplicacion es: " + unaCalculadora.resolverMultiplicacion());
			    System.out.println("El resultado de la Division es: " + unaCalculadora.resolverDivision());
			    System.out.println("El resultado de la Division es: " + unaCalculadora.resolverRaiz());
			    System.out.println("El resultado de la Division es: " + unaCalculadora.resolverPotencia());
				}
			}
	}

}
