package sistemaEscolar;

public class Auxiliar extends Persona {

	private String desempe�o;
    private String cursoAsignado;
    private Integer a�oIngreso, mesIngreso;
    
    public Auxiliar(String nombre, String apellido, Integer dni,Integer a�o,Integer mes,String cursoAsigando) {
		super(nombre, apellido, dni);
		this.a�oIngreso = a�o;
		this.mesIngreso = mes;
		this.cursoAsignado = cursoAsigando;
	}

	@Override
	public void verDesempe�o(String tareas) {
		this.desempe�o = tareas;

	}
	public String getDesempe�o() {
		return desempe�o;
	}
	public String getCurso() {
		return cursoAsignado;
	}
	
	//Hace el metodo calcular antiguedad
	public String calcularAntiguedad(Integer a�oActual,Integer mesActual) {	
		Integer cantidadA�os;
		if(mesActual < mesIngreso) {
			cantidadA�os = a�oActual - 1 - a�oIngreso;
		}else {
			cantidadA�os = a�oActual  - a�oIngreso;
		}
		Integer cantidadMes;
		if(mesActual < mesIngreso) {
			cantidadMes = (mesActual + 12 - mesIngreso);
		}else {
			 cantidadMes = (mesActual - mesIngreso);
		}
		String antiguedad = " " + cantidadA�os + " " + cantidadMes;
		return antiguedad ;
	}
	
	// SolicitarCambio de curso
	
	/*public Boolean solicitarCambioDeCurso (Curso curso, String nuevoCurso) {
		if(curso.buscarAuxiliar(this.dni)!= null) {
			curso.eliminarAuxiliar(this.dni);
			this.cursoAsignado = nuevoCurso;
			return true;
		}
		return false;
	}*/
	
	public void setTareas(String tareas) {
		this.desempe�o = tareas;
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
