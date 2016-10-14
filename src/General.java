// CC2006, Lab 4
// Una clase para representar a los Generales.

public class General extends Militar {
	Soldado soldado = new Soldado();
	/**
	 * return dias de vacaciones
	 */
	public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }
/**
 * return formulario
 */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    /**
     * imprime estrategia
     */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
    /**
     * manda orden al soldado
     * @param orden
     */
    public void mandarSoldado(String orden) {
        soldado.recibeOrden(orden);
    }
    
}
