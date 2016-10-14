// CC2006, Lab 4
// Una clase para representar a los militares en general.

public class Militar {
	/**
	 * fija las horas
	 * @return horas
	 */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    /**
     * fija el salario
     * @return salario
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    /**
     * fija los dias de vacaciones
     * @return
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }
/**
 * fija el formulario
 * @return color de formulario
 */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}
