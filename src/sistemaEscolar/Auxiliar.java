package sistemaEscolar;



public class Auxiliar extends Persona {

	private String desempeño;
    private String curso;
    private String antiguedad;
    private Integer añoIngreso, mesIngreso;
    
    public Auxiliar(String nombre, String apellido, Integer dni,Integer año,Integer mes,String curso) {
		super(nombre, apellido, dni);
		this.añoIngreso = año;
		this.mesIngreso = mes;
		this.curso = curso;
	}

	@Override
	public void verDesempeño(String tareas) {
		this.desempeño = tareas;

	}
	public String getDesempeño() {
		return desempeño;
	}
	public String getCurso() {
		return curso;
	}
	//Hace el metodo calcular antiguedad
	public String calcularAntiguedad(Integer añoActual,Integer mesActual) {	
		return antiguedad;
			
		}
	public void setTareas(String tareas) {
		this.desempeño = tareas;
	}


	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Integer getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(Integer añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	public Integer getMesIngreso() {
		return mesIngreso;
	}

	public void setMesIngreso(Integer mesIngreso) {
		this.mesIngreso = mesIngreso;
	}
	

}
