package sistemaEscolarTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sistemaEscolar.Alumno;
import sistemaEscolar.Auxiliar;
import sistemaEscolar.Curso;
import sistemaEscolar.Profesor;

public class sistemaTest {

	//prueba de metodos clase curso

		@Test
		public void queSePuedaCrearUnCurso() {
			Curso primero = new Curso("2do 3era");
		    assertNotNull(primero);
		}
		@Test
		public void queSePuedaAgregarUnAlumnoAUnCurso() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			Boolean seAgrego = segundo.agregarAlumno(alumno);
			assertTrue("se agrego", seAgrego);
		}
		@Test
		public void queSePuedaAgregarUnProfesorAUnCurso() {
			Curso segundo = new Curso("2do 3era");
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			Boolean seAgrego =  segundo.agregarProfesor(wandulo);
			assertTrue("se agrego", seAgrego);
		}
		@Test
		public void queSePuedaAgregarUnAuxiliarAUnCruso() {
			Curso segundo = new Curso("2do 3era");
			Auxiliar auxiliar = new Auxiliar ("ema", "wandulo", 234343, 2015, 5, "2do 3era");
			Boolean seAgrego =  segundo.agregarAuxiliar(auxiliar); 
			assertTrue("se agrego", seAgrego);
		}
		
		@Test
		public void queNoSePuedaAgregarMasDeDosAuxiliares() {
			Curso segundo = new Curso("2do 3era");
			Auxiliar auxiliar = new Auxiliar ("ema", "wandulo", 244343, 2015, 5, "2do 3era");
			Auxiliar auxiliar2 = new Auxiliar ("ema", "wandulo", 234343, 2015, 5, "2do 3era");
			Auxiliar auxiliar3 = new Auxiliar ("ema", "wandulo", 224343, 2015, 5, "2do 3era");
			segundo.agregarAuxiliar(auxiliar);
			segundo.agregarAuxiliar(auxiliar2);
			Boolean seAgrego =  segundo.agregarAuxiliar(auxiliar3); 
			assertFalse("No se debe agregar", seAgrego);
		}
		
		/*@Test
		public void queNoSePuedaAgregarMasAlumnosDeLoPermitidoAUnCurso() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno1 = new Auxiliares ("ema", "wandulo", 244343, 2015, 5, "2do 3era");
			Auxiliares auxiliar2 = new Auxiliares ("ema", "wandulo", 234343, 2015, 5, "2do 3era");
			Auxiliares auxiliar3 = new Auxiliares ("ema", "wandulo", 224343, 2015, 5, "2do 3era");
			segundo.agregarAuxiliar(auxiliar);
			segundo.agregarAuxiliar(auxiliar2);
			Boolean seAgrego =  segundo.agregarAuxiliar(auxiliar3); 
			assertFalse("No se debe agregar", seAgrego);
		}*/
		
		// hacer buscartest
		
		
		// métodos de prueba para Clase Auxiliar
		
		
		@Test
		public void queUnAuxiliarPuedaCalcularSuAntiguedad() {
			Auxiliar wandulo = new Auxiliar("ema", "wandulo", 234343, 2015, 2, "2do 3era");
			String seAgrego =  wandulo.calcularAntiguedad(2020, 11);
			String tieneQueDar= " " + 5 + " " + 9 ;
			assertEquals("no dio bien", seAgrego, tieneQueDar);
		}
		//hacer solitartest
		
		
		//prueba de metodos en clase profesor
		
		@Test
		public void queUnProfesorPuedaAgregarUnAlumnoASuLista() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Boolean seAgrego =  wandulo.agregarAlumnosASuLista(37912, segundo); 
			assertTrue("Se agrego", seAgrego);
		}
		@Test
		public void queUnProfesorPuedaCalcularSuAntiguedad() {
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 2, "fisica", "2do 3era");
			String seAgrego =  wandulo.calcularAntiguedad(2020,3);
			String tieneQueDar= " " + 5 + " " + 1 ;
			assertEquals("no dio bien", seAgrego, tieneQueDar);
		}
		
		//prueba de métodos clase Alumno
		// test 
}
