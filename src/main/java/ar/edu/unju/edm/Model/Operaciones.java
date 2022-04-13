package ar.edu.unju.edm.model;
import java.lang.Math;
@Component
public class Operaciones {
	private int Num1;
	private int Num2;
	public Operaciones() {
		// TODO Auto-generated constructor stub
	}
	public int getNum1() {
		return Num1;
	}
	public void setNum1(int num1) {
		Num1 = num1;
	}
	public int getNum2() {
		return Num2;
	}
	public void setNum2(int num2) {
		Num2 = num2;
	}
	public int resolverSuma() {
		return Num1+Num2;
	}
	public int resolverResta() {
		return Num1-Num2;
	}
	public int resolverMultiplicacion() {
		return Num1*Num2;
	
	}
	public int resolverDivision() {
		return Num1/Num2;
	}
	public int resolverRaiz() {
		return Math.pow((double)Num1,(1/(double)Num2));
	}
	public int resolverPotencia() {
		return Math.pow((double)Num1,(double)Num2);
	}
}

