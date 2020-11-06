package sistemaEscolar;



public class Auxiliar extends Persona {

	private String desempe�o;
    private String curso;
    private String antiguedad;
    private Integer a�oIngreso, mesIngreso;
    
    public Auxiliar(String nombre, String apellido, Integer dni,Integer a�o,Integer mes,String curso) {
		super(nombre, apellido, dni);
		this.a�oIngreso = a�o;
		this.mesIngreso = mes;
		this.curso = curso;
	}

	@Override
	public void verDesempe�o(String tareas) {
		this.desempe�o = tareas;

	}
	public String getDesempe�o() {
		return desempe�o;
	}
	public String getCurso() {
		return curso;
	}
	//Hace el metodo calcular antiguedad
	public String calcularAntiguedad(Integer a�oActual,Integer mesActual) {	
		return antiguedad;
			
		}
	public void setTareas(String tareas) {
		this.desempe�o = tareas;
	}


	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Integer getA�oIngreso() {
		return a�oIngreso;
	}

	public void setA�oIngreso(Integer a�oIngreso) {
		this.a�oIngreso = a�oIngreso;
	}

	public Integer getMesIngreso() {
		return mesIngreso;
	}

	public void setMesIngreso(Integer mesIngreso) {
		this.mesIngreso = mesIngreso;
	}
	

}
