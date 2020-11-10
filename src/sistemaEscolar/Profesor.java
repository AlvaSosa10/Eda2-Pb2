package sistemaEscolar;

import java.util.HashSet;
import java.util.TreeSet;

public class Profesor extends Persona {
	private String desempeño;
	private String materia, cursoAsignado;
	private Integer añoIngreso, mesIngreso;
  //elegi TreeSet para que devolvamos la coleccion de lista de alumnos del profesor en orden alfabetico
 //despues volvemos a mirar el video de ruben y borgeat que hicieron con mariano, ahi esta hecho el test de la colaccion treeset
	private TreeSet<Alumno> alumnos;

	public Profesor(String nombre, String apellido, Integer dni,Integer añoIngreso, Integer mesIngreso, String materia, String cursoAsignado) {
		super(nombre, apellido, dni);
		this.materia = materia;
		this.cursoAsignado = cursoAsignado;
		this.añoIngreso = añoIngreso;
		this.mesIngreso = mesIngreso;
		this.alumnos = new TreeSet<Alumno>();
	}

	@Override
	public void evaluarDesempeño(String desempeño) {
		this.desempeño = desempeño;
	}

	public String getDesempeño() {
		return desempeño;
	}
	//seguí con los métodos que relacionan al alumno y profesor
	public String getCurso() {
		return cursoAsignado;
	}
    //alva hace el metodo calcular antiguedad y usalo tambien en auxiliares
	public String calcularAntiguedad(Integer añoActual, Integer mesActual) {
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
    //cree la clase curso que es contenedora y en ella se crean curso, y despues en curso se agrega alumno, profesor y auxiliar
	public Boolean agregarAlumnosASuLista(Integer dni, Curso curso) {
		Boolean seAgrego = false;
		if (curso != null) {
			if (curso.buscarAlumnos(dni)!= null) {
				alumnos.add(curso.buscarAlumnos(dni));
				seAgrego = true;
			}
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
	public Double calcularPromedio(Integer dni) {
		Double promedio = 0.0;
		Alumno alumno = buscarAlumnos(dni);
		if (alumno.getNota1erExamen() != null && alumno.getNota2doExamen() != null
				&& alumno.getNota3erExamen() != null) {
			promedio = (alumno.getNota1erExamen() + alumno.getNota2doExamen() + alumno.getNota3erExamen()) / 3;
			alumno.setPromedioFinal(promedio);
		}
		return promedio;
	}

	// falta test
	public Boolean informarCondicionDelAlumnoEnLaMateria(Integer dni) {
		Boolean aprobo = false;
		if (calcularPromedio(dni)>= 7.0) {
			aprobo = true;
		}
		return aprobo;
	}

	// falta test
	public Boolean informarNotaDeExamenPrevio(Integer dni, Double nota) {
		Alumno alumno = buscarAlumnos(dni);
		if(alumno.rendirExamenPrevio()) {
			alumno.setNotaExamenPrevio(nota);
			return true;
		}
		return false;
	}
	
	// falta test
	public TreeSet<Alumno> mostrarListaAlumnosAlfabeticamente() {
		return this.alumnos;
	}
	
	public String getMateria() {
		return materia;
	}

}
