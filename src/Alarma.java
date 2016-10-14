
/**
 * 
 * @author Rodrigo Urrutia 16139
 * @version 14.10.16
 *
 */
public class Alarma extends Timbre {
/**
 * Imprime "alarma 1"
 * Llama al método m1 de Timbre
 */
	public void m1() {
		 System.out.println("alarma 1");
		 super.m1();
	}
/**
 * LLama al método m1 de timbre
 */
	public void m2() {
		 super.m1();
	}
/**
 * Imprime dos veces el toString de Timbre
 * return String
 */
	public String toString() {
		 return super.toString() + "…" + super.toString();
	}
}
