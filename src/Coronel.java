// CC2006, Lab 4
// Una clase para representar a los Coroneles.

public class Coronel extends Teniente {
   /**
    * Recibe el salario y le suma 5000
    * return salario
    */
	public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    /**
     * Imprime orden
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
    /**
     * Llama al metodo con el mismo nombre de la clase Teniente
     */
    public void tomaOrdenCoronel(String orden) {
		 super.tomaOrdenCoronel(orden);
	}
    
}
