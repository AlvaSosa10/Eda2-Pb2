package sistemaEscolarTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sistemaEscolar.Alumno;
import sistemaEscolar.Auxiliar;
import sistemaEscolar.Curso;
import sistemaEscolar.Profesor;

public class sistemaTest {

	//TEST CALSE CURSO

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
		public void queNoSePuedaAgregarDosVecesElMismoProfesorAUnCurso() {
			Curso segundo = new Curso("2do 3era");
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			Profesor wandulo1 = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			segundo.agregarProfesor(wandulo);
			Boolean seAgrego =  segundo.agregarProfesor(wandulo1);
			assertFalse("No se debe agregar", seAgrego);
		}
		
		@Test
		public void queSePuedaAgregarUnAuxiliarAUnCurso() {
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
		@Test
		public void queNoSePuedaAgregarDosVecesElMismoAuxiliar() {
			Curso segundo = new Curso("2do 3era");
			Auxiliar auxiliar = new Auxiliar ("ema", "wandulo", 244343, 2015, 5, "2do 3era");
			Auxiliar auxiliar2 = new Auxiliar ("ema", "wandulo", 234343, 2015, 5, "2do 3era");
			segundo.agregarAuxiliar(auxiliar);
			segundo.agregarAuxiliar(auxiliar2);
			Boolean seAgrego =segundo.agregarAuxiliar(auxiliar2);
			assertFalse("no se debe agregar", seAgrego);
		}
		
		@Test
		public void queNoSePuedaAgregarMasAlumnosDeLoPermitidoAUnCurso() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno1 = new Alumno ("ema", "wandulo", 344343);
			Alumno alumno2 = new Alumno ("ema", "angulo", 274343);
			Alumno alumno3 = new Alumno ("ema", "tulo", 247343);
			Alumno alumno4 = new Alumno ("ema", "benitez", 241343);
			Alumno alumno5 = new Alumno ("ema", "barreda", 244313);
			Alumno alumno6 = new Alumno ("ema", "balboa", 244340);
			alumno1.inscribirseAcurso("2do 3era");
			alumno2.inscribirseAcurso("2do 3era");
			alumno3.inscribirseAcurso("2do 3era");
			alumno4.inscribirseAcurso("2do 3era");
			alumno5.inscribirseAcurso("2do 3era");
			alumno6.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno1);
			segundo.agregarAlumno(alumno2);
			segundo.agregarAlumno(alumno3);
			segundo.agregarAlumno(alumno4);
			segundo.agregarAlumno(alumno5);
			Boolean seAgrego =  segundo.agregarAlumno(alumno6); 
			assertFalse("No se debe agregar", seAgrego);
		}
		@Test
		public void queNoSePuedaAgregarDosVecesElMismoAlumno() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno1 = new Alumno ("ema", "angulo", 12345);
			Alumno alumno2 = new Alumno ("ema", "angulo", 12345);
			alumno1.inscribirseAcurso("2do 3era");
			alumno2.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno1);
			Boolean seAgrego =segundo.agregarAlumno(alumno2); 
			assertFalse("no se debe agregar", seAgrego);
		}
		
		
		/* hacer buscartest ------
		no es necesario, el test para buscar, porque lo utiliza en un metodo la clase profesor y ese metodo ya recibio un test 
		y funciona correcto */
		
		
		
		// TESTE CLASE AUXILIAR
				
		
		@Test
		public void queUnAuxiliarPuedaCalcularSuAntiguedad() {
			Auxiliar wandulo = new Auxiliar("ema", "wandulo", 234343, 2015, 2, "2do 3era");
			String seAgrego =  wandulo.calcularAntiguedad(2020, 11);
			String tieneQueDar= " " + 5 + " " + 9 ;
			assertEquals("no dio bien", seAgrego, tieneQueDar);
		}
		
		
		//TEST CLASE PROFESOR
		
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
		
		@Test
		public void  queUnProfesorPuedaInformarNotaDePrevia() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 4.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 5.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 3.0, 3);
			 wandulo.calcularPromedio(37912);
			 alumno.anotarseAprevia();
			alumno.rendirExamenPrevio();
			Boolean pasoNota = wandulo.informarNotaDeExamenPrevio(37912, 5.0);
			assertTrue("no debe rendir",pasoNota);
		}
		
		@Test
		public void  queSeInformeLaCondicionDeLaMateriaComoAporbada() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 8.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 5.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 10.0, 3);
			 wandulo.calcularPromedio(37912);
			Boolean informarCondicion = wandulo.informarCondicionDelAlumnoEnLaMateria(37912);
			assertTrue("no aprobo",informarCondicion);
		}
		
		@Test
		public void  queSeInformeLaCondicionDeLaMateriaComoDesaporbada() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 8.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 5.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 2.0, 3);
			 wandulo.calcularPromedio(37912);
			Boolean informarCondicion = wandulo.informarCondicionDelAlumnoEnLaMateria(37912);
			assertFalse("no desaprobo",informarCondicion);
		}
		
	
//	TEST CLASE ALUMNO
		
		
		@Test
		public void queUnAlumnoPuedaRendirUnExamen() {
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.rendirExamen(1);
			Integer rindio = alumno.getNumeroDeExamen();
			Integer actual = 1;
			assertEquals("no rindio", rindio, actual);
		}
		
		@Test
		public void queUnAlumnoPuedaSaberSuNota() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 7.0, 1);
			 Double notaRecibida = alumno.getNota1erExamen();
			Double esperado = 7.0;
			assertEquals("la nota no coincide", notaRecibida, esperado);
		}
		
		@Test
		public void queUnAlumnoPuedaSaberSuPromedio() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 9.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 7.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 8.0, 3);
			Double promedioFinal = wandulo.calcularPromedio(37912);
			Double esperado = 8.0;
			assertEquals("no salio bien", promedioFinal, esperado);
		}
		
		@Test
		public void  queUnAlumnoPuedaAnotarseAPrevia() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 4.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 5.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 3.0, 3);
			 wandulo.calcularPromedio(37912);
			Boolean seAnotoAprevia = alumno.anotarseAprevia();
			assertTrue("no debe rendir", seAnotoAprevia);
		}
		@Test
		public void  queUnAlumnoSepaSiPromociono() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 7.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 7.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 10.0, 3);
			 wandulo.calcularPromedio(37912);
			Boolean promociono = alumno.promocionoLaMateria();
			assertTrue("no promociono", promociono);
		}
		@Test
		public void  queUnAlumnoPuedaRendirLaPrevia() {
			Curso segundo = new Curso("2do 3era");
			Alumno alumno = new Alumno("juan", "mamani", 37912);
			alumno.inscribirseAcurso("2do 3era");
			segundo.agregarAlumno(alumno);
			Profesor wandulo = new Profesor("ema", "wandulo", 234343, 2015, 5, "fisica", "2do 3era");
			wandulo.agregarAlumnosASuLista(37912, segundo);
			alumno.rendirExamen(1);
			 wandulo.informarNotaDeExamen(37912, 4.0, 1);
			 alumno.rendirExamen(2);
			 wandulo.informarNotaDeExamen(37912, 5.0, 2);
			 alumno.rendirExamen(3);
			 wandulo.informarNotaDeExamen(37912, 3.0, 3);
			 wandulo.calcularPromedio(37912);
			 alumno.anotarseAprevia();
			Boolean rindioPrevia = alumno.rendirExamenPrevio();
			assertTrue("no debe rendir", rindioPrevia);
		}
		
		
		
}
