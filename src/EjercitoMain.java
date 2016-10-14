public class EjercitoMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Soldado soldado = new Soldado();
		General general = new General();
		Coronel coronel = new Coronel();
		
		System.out.println("Ahora es momento del soldado.");
		System.out.println("El soldado tiene "+soldado.getDiasVacaciones()+" días de vacaciones.");
		System.out.println("El color de su formulario es "+soldado.getFormularioVacaciones()+".");
		System.out.println("Además, trabaja "+soldado.getHoras()+" horas a la semana y le pagan Q"+soldado.getSalario()+"\n");
		
		System.out.println("Ahora es momento del general. Tiene "+general.getDiasVacaciones()+" días de vacaciones.");
		System.out.println("El color de su formulario es "+general.getFormularioVacaciones()+".");
		general.planificaEstrategia();
		general.mandarSoldado("Limpie los baños\n");
		
		System.out.println("Ahora es momento del coronel. Tiene salario de Q"+coronel.getSalario());
		System.out.println("El color de su formulario es "+coronel.getFormularioVacaciones()+".");
		coronel.ejecutaOrdenManiobra();
		System.out.println("");
		
		System.out.println("Ahora es momento del teniente.");
		coronel.tomaOrdenCoronel("Rompan filas");
	}
}