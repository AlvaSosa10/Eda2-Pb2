package sistemaEscolar;

public class Auxiliar extends Persona {

	private String funcion;
    private String cursoAsignado;
    private Integer añoIngreso, mesIngreso;
    
    public Auxiliar(String nombre, String apellido, Integer dni,Integer año,Integer mes,String cursoAsigando) {
		super(nombre, apellido, dni);
		this.añoIngreso = año;
		this.mesIngreso = mes;
		this.cursoAsignado = cursoAsigando;
	}

	@Override
	public void indicarFuncion(String funcion) {
		this.funcion = funcion;

	}
	public String getFuncion() {
		return funcion;
	}
	public String getCurso() {
		return cursoAsignado;
	}
	
	//Hace el metodo calcular antiguedad
	public String calcularAntiguedad(Integer añoActual,Integer mesActual) {	
		Integer cantidadAños;
		if(mesActual < mesIngreso) {
			cantidadAños = añoActual - 1 - añoIngreso;
		}else {
			cantidadAños = añoActual  - añoIngreso;
		}
		Integer cantidadMes;
		if(mesActual < mesIngreso) {
			cantidadMes = (mesActual + 12 - mesIngreso);
		}else {
			 cantidadMes = (mesActual - mesIngreso);
		}
		String antiguedad = " " + cantidadAños + " " + cantidadMes;
		return antiguedad ;
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
