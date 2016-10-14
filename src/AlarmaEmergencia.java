
/**
 * 
 * @author Rodrigo Urrutia 16139
 * @version 14.10.16
 *
 */
public class AlarmaEmergencia extends Alarma{
/**
 * Imprime "emergencia 1"
 */
	public void m1() {
		 System.out.println("emergencia 1");
	}
/**
 * Llama al método m1 de alarma
 */
	public void m2() {
		 super.m1();
	}
/**
 * Imprime "emergencia" con el toString de Alarma
 * return String
 */
	public String toString() {
		 return "emergencia " + super.toString();
	}
}
