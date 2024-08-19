package view;
import controller.ControllerQuantDigitos;
public class PrincipalQuantDigitos {
	public static void main (String [] args) {
		
	ControllerQuantDigitos m = new ControllerQuantDigitos();
	int num = 15206;
	int quant = m.QuantDigitos(num);
	System.out.println ("O número " + num + " possui " + quant + " dígitos");
	}

}
