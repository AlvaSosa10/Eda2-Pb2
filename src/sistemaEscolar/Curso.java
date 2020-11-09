package sistemaEscolar;

import java.util.HashSet;

public class Curso {

	private String añoYDivision;
	private HashSet<Alumno> alumnos;
	private HashSet<Profesor> profesores;
	private HashSet<Auxiliar> auxiliares;

	public Curso(String nombreYDivision) {
		this.añoYDivision = nombreYDivision;
		this.alumnos = new HashSet<Alumno>();
		this.profesores = new HashSet<Profesor>();
		this.auxiliares = new HashSet<Auxiliar>();
	}

	public boolean agregarAlumno(Alumno alumno) {
		boolean seAgrego = false;
		if (alumno != null)
			if (alumnos.size() < 5 && this.añoYDivision.equals(alumno.getCurso())) {
				alumnos.add(alumno);
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

	public boolean agregarProfesor(Profesor profesor) {
		boolean seAgrego = false;
		if (profesor != null)
			if (this.añoYDivision.equals(profesor.getCurso())) {
				profesores.add(profesor);
				seAgrego = true;
			}
		return seAgrego;
	}
	
	public Profesor buscarProfesor(Integer dni) {
		for (Profesor profesor : profesores) {
			if (profesor.getDni().equals(dni)) {
				return profesor;
			}
		}
		return null;
	}

	public boolean agregarAuxiliar(Auxiliar auxiliar) {
		boolean seAgrego = false;
		if (auxiliar != null)
			if (this.añoYDivision.equals(auxiliar.getCurso()) && auxiliares.size() < 2) {
				seAgrego = true;
				auxiliares.add(auxiliar);
			}
		return seAgrego;
	}
	
	public Auxiliar buscarAuxiliar(Integer dni) {
		for (Auxiliar auxiliar : auxiliares) {
			if (auxiliar.getDni().equals(dni)) {
				return auxiliar;
			}
		}
		return null;
	}

	public Boolean eliminarAuxiliar(Integer dni) {
		// TODO Auto-generated method stub
		for (Auxiliar auxiliar : auxiliares) {
			if (auxiliar.getDni().equals(dni)) {
				auxiliares.remove(auxiliar);
				return true;
			}
		}
		return false;
		
	}
}
