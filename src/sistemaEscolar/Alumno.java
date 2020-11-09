package sistemaEscolar;

public class Alumno extends Persona implements Comparable <Alumno>{
	private String desempeño, curso;
	private Double promedioFinal, notaExamenPrevio;
	private Double nota1erExamen, nota2doExamen, nota3erExamen;
	private Integer numeroDeExamen;

	public Alumno(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
	}

	@Override
	public void verDesempeño(String desempeño) {
		this.desempeño = desempeño;

	}

	public String getDesempeño() {
		return desempeño;
	}

	/*
	 * el metodo inscribirse a curso es setearle al pibe un string curso habria que
	 * hacer que para que el profesor anote al pibe en su lista, que el curso del
	 * profesor coincida con el del pibe, si es que el pibe se pudo inscribir ahi
	 */
	public void inscribirseAcurso(String cursoElegido) {
		this.curso = cursoElegido;
	}

	// la idea es que el pibe rinda mandandole al profesor el numero de examen que
	// esta entregando y que con eso
	// el profesor pueda setear las notas del pibe como te dije arriba, nota 1,2 y 3
	public Integer rendirExamen(Integer numeroDeExamen) {
		switch (numeroDeExamen) {
		case 1:
			this.numeroDeExamen = numeroDeExamen;
			break;

		case 2:
			this.numeroDeExamen = numeroDeExamen;
			break;

		case 3:
			this.numeroDeExamen = numeroDeExamen;
			break;
		}
		return this.numeroDeExamen;
	}
	
	// falta test
	public Boolean anotarseAprevia() {
		Boolean seAnoto = false;
		if (getPromedioFinal() < 7.0) {
			seAnoto = true;
		}
		return seAnoto;
	}

	public Boolean promocionoLaMateria() {
		boolean promociono = false;
		if (getPromedioFinal() >= 7.0) {
			promociono = true;
		}
		return promociono;
	}

	public Boolean rendirExamenPrevio() {
		boolean rinde = false;
		if (anotarseAprevia()) {
			rinde = true;
		}
		return rinde;
	}
	

	public Double getPromedioFinal() {
		return promedioFinal;
	}

	public Double setNotaExamenPrevio(Double nota) {
		return this.notaExamenPrevio = nota;
	}

	public String getCurso() {
		return curso;
	}

	public void setPromedioFinal(Double promedioFinal) {
		this.promedioFinal = promedioFinal;
	}
	
	public Integer getNumeroDeExamen() {
		return numeroDeExamen;
	}

	public Double getNota1erExamen() {
		return nota1erExamen;
	}

	public void setNota1erExamen(Double nota1erExamen) {
		this.nota1erExamen = nota1erExamen;
	}

	public Double getNota2doExamen() {
		return nota2doExamen;
	}

	public void setNota2doExamen(Double nota2doExamen) {
		this.nota2doExamen = nota2doExamen;
	}

	public Double getNota3erExamen() {
		return nota3erExamen;
	}

	public void setNota3erExamen(Double nota3erExamen) {
		this.nota3erExamen = nota3erExamen;
	}
	@Override
	public int compareTo(Alumno otroAlumno) {
		return this.apellido.compareTo(otroAlumno.apellido);
	}

}
