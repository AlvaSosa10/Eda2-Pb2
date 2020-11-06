package sistemaEscolar;

import java.util.TreeSet;

public class Profesor extends Persona {
	private String desempeño;
	private String antiguedad;
	private String materia, curso;
	private Integer cargaHoraria, añoIngreso, mesIngreso;
  //elegi TreeSet para que devolvamos la coleccion de lista de alumnos del profesor en orden alfabetico
 //despues volvemos a mirar el video de ruben y borgeat que hicieron con mariano, ahi esta hecho el test de la colaccion treeset
	private TreeSet<Alumno> alumnos;

	public Profesor(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verDesempeño(String tareas) {
		this.desempeño = tareas;
	}

	public String getDesempeño() {
		return desempeño;
	}
	//seguí con los métodos que relacionan al alumno y profesor
	public String getCurso() {
		return curso;
	}
    //alva hace el metodo calcular antiguedad y usalo tambien en auxiliares
	public String calcularAntiguedad(Integer añoActual, Integer mesActual) {
		return antiguedad;
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
			if (dni.equals(alumno2)) {
				return alumno2;
			}
		}
		return null;
	}

	public Double informarNotaDeExamen(Integer dni, Double nota, Integer numExamen) {
		Alumno alumno = buscarAlumnos(dni);
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
		return nota;
	}

	public Double calcularPromedio() {
		Double promedio;
		Alumno alumno = buscarAlumnos(dni);
		promedio = (alumno.getNota1erExamen() + alumno.getNota2doExamen() + alumno.getNota3erExamen()) / 3;
		alumno.setPromedioFinal(promedio);
		return promedio;
	}

	public Boolean informarCondiconDelAlumnoEnLaMateria(Integer dni) {
		Alumno alumno = buscarAlumnos(dni);
		Boolean aprobo = false;
		if (alumno.getPromedioFinal() >= 7.0) {
			aprobo = true;
		}
		return aprobo;
	}

	public Double tomarExamenPrevio(Integer dni, Double nota) {
		Alumno alumno = buscarAlumnos(dni);
		if (alumno.anotarseAprevia()) {
			alumno.examenPrevio(nota);
		}
		return nota;
	}

	public TreeSet<Alumno> mostrarListaAlumnosAlfabeticamente() {
		return this.alumnos;
	}

}
