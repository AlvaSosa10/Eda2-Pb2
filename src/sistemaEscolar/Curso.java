package sistemaEscolar;

import java.util.HashSet;

	public class Curso {

		private String a�oYdivision;
		private HashSet<Alumno> alumnos;
		private HashSet<Profesor> profesores;
		private HashSet<Auxiliar> auxiliares;

		public Curso(String nombreYdivision) {
			this.a�oYdivision = nombreYdivision;
			this.alumnos = new HashSet<Alumno>();
			this.profesores = new HashSet<Profesor>();
			this.auxiliares = new HashSet<Auxiliar>();
		}
        //hace los metodos para que el curso agrege a las diferentes personas
		public boolean agregarAlumno(Alumno alumno) {
			boolean seAgrego = false;
			
			return seAgrego;
		}

		public boolean agregarProfesor(Profesor profesor) {
			boolean seAgrego = false;
		
			return seAgrego;
		}

		public boolean agregarAuxiliar(Auxiliar auxiliar) {
			boolean seAgrego = false;
			
			return seAgrego;
		}
	}

