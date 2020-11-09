package sistemaEscolar;

import java.util.TreeSet;

public class Profesor extends Persona {
	private String desempe�o;
	private String materia, cursoAsignado;
	private Integer a�oIngreso, mesIngreso;
  //elegi TreeSet para que devolvamos la coleccion de lista de alumnos del profesor en orden alfabetico
 //despues volvemos a mirar el video de ruben y borgeat que hicieron con mariano, ahi esta hecho el test de la colaccion treeset
	private TreeSet<Alumno> alumnos;

	public Profesor(String nombre, String apellido, Integer dni,Integer a�oIngreso, Integer mesIngreso, String materia, String cursoAsignado) {
		super(nombre, apellido, dni);
		this.materia = materia;
		this.cursoAsignado = cursoAsignado;
		this.a�oIngreso = a�oIngreso;
		this.mesIngreso = mesIngreso;
		this.alumnos = new TreeSet<Alumno>();
	}

	@Override
	public void verDesempe�o(String tareas) {
		this.desempe�o = tareas;
	}

	public String getDesempe�o() {
		return desempe�o;
	}
	//segu� con los m�todos que relacionan al alumno y profesor
	public String getCurso() {
		return cursoAsignado;
	}
    //alva hace el metodo calcular antiguedad y usalo tambien en auxiliares
	public String calcularAntiguedad(Integer a�oActual, Integer mesActual) {
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
    //cree la clase curso que es contenedora y en ella se crean curso, y despues en curso se agrega alumno, profesor y auxiliar
	public Boolean agregarAlumnosASuLista(Alumno alumno, Curso curso) {
		Boolean seAgrego = false;
		if (curso != null) {
			if (curso.agregarAlumno(alumno)) {
				alumnos.add(alumno);
			}
			seAgrego = true;
		}
		return seAgrego;
	}

	public Alumno buscarAlumnos(Integer dni) {
		for (Alumno alumno2 : alumnos) {
			if (alumno2.getDni().equals(dni)) {
				return alumno2;
			}
		}
		return null;
	}
	// falta test de este metodo
	public Double informarNotaDeExamen(Integer dni, Double nota, Integer numExamen) {
		Alumno alumno = buscarAlumnos(dni);
		if(alumno.getNumeroDeExamen().equals(numExamen)) {
			switch (numExamen) {
			case 1:
				alumno.setNota1erExamen(nota);
				break;
			case 2:
				alumno.setNota2doExamen(nota);
				break;
			case 3:
				alumno.setNota3erExamen(nota);
				break;
			}
		}
		return nota;
	}
	
	//falta el test
	public Double calcularPromedio() {
		Double promedio;
		Alumno alumno = buscarAlumnos(dni);
		promedio = (alumno.getNota1erExamen() + alumno.getNota2doExamen() + alumno.getNota3erExamen()) / 3;
		alumno.setPromedioFinal(promedio);
		return promedio;
	}

	// falta test
	public Boolean informarCondiconDelAlumnoEnLaMateria(Integer dni) {
		Alumno alumno = buscarAlumnos(dni);
		Boolean aprobo = false;
		if (alumno.getPromedioFinal() >= 7.0) {
			aprobo = true;
		}
		return aprobo;
	}

	// falta test
	public void informarNotaDeExamenPrevio(Integer dni, Double nota) {
		Alumno alumno = buscarAlumnos(dni);
		if(alumno.rendirExamenPrevio()) {
			alumno.setNotaExamenPrevio(nota);
		}
	}
	
	// falta test
	public TreeSet<Alumno> mostrarListaAlumnosAlfabeticamente() {
		return this.alumnos;
	}
	
	public String getMateria() {
		return materia;
	}

}
