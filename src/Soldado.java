
public class Soldado extends Militar{
	/**
	 * return dias de vacaciones
	 */
	public int getDiasVacaciones() {
	        return super.getDiasVacaciones() - 5; // 1 semana de vacaciones
	    }
	/**
	 * return horas
	 */
	 public int getHoras() {
	        return super.getHoras()+40; // trabaja 80 horas / semana
	 }
	 /**
	  *  return salario
	  */
	 public double getSalario() {
	        return super.getSalario()-10000; // trabaja 80 horas / semana
	 }  
	 /**
	  * Recibe orden del general 
	  * @param orden
	  */
	 public void recibeOrden(String orden) {
	        System.out.println("Soldado: Ordene mi general. "+"General: "+orden);
	    }
}
