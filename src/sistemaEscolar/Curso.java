package sistemaEscolar;

import java.util.HashSet;

public class Curso {

	private String a�oYDivision;
	private HashSet<Alumno> alumnos;
	private HashSet<Profesor> profesores;
	private HashSet<Auxiliar> auxiliares;

	public Curso(String nombreYDivision) {
		this.a�oYDivision = nombreYDivision;
		this.alumnos = new HashSet<Alumno>();
		this.profesores = new HashSet<Profesor>();
		this.auxiliares = new HashSet<Auxiliar>();
	}

	public boolean agregarAlumno(Alumno alumno) {
		boolean seAgrego = false;
		if (alumno != null)
			if (alumnos.size() < 5 && this.a�oYDivision.equals(alumno.getCurso())) {
				alumnos.add(alumno);
				seAgrego = true;
			}
		return seAgrego;
	}

	public boolean agregarProfesor(Profesor profesor) {
		boolean seAgrego = false;
		if (profesor != null)
			if (this.a�oYDivision.equals(profesor.getCurso())) {
				profesores.add(profesor);
				seAgrego = true;
			}
		return seAgrego;
	}

	public boolean agregarAuxiliar(Auxiliar auxiliar) {
		boolean seAgrego = false;
		if (auxiliar != null)
			if (this.a�oYDivision.equals(auxiliar.getCurso()) && auxiliares.size() < 2) {
				seAgrego = true;
				auxiliares.add(auxiliar);
			}
		return seAgrego;
	}
}
