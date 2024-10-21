import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {
    private static Estudiante estudiante;

    @BeforeAll
    static void setUp() {
        System.out.println("Inicio de las pruebas...");
        estudiante = new Estudiante("Daniel", 20);
    }

    @AfterAll
    static void tearDown() {

        estudiante = null;
        System.out.println("Fin de las pruebas.");
    }

    @Test
    void getNumeroCalificacionesTest() {
        estudiante.agregarCalificacion(7.0);
        assertEquals(1, estudiante.getNumeroCalificaciones(), "las calificaciones deberian ser 1 ");
    }

    @Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificacion(6.0);
        estudiante.agregarCalificacion(8.5);
        assertEquals(3, estudiante.getNumeroCalificaciones(), "las calificaciones ahora debería ser 4");
    }

    @Test
    void obtenerPromedioTest() {
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);
        double expected= (6+8.5+9+7+7)/5;
        assertEquals(expected, estudiante.obtenerPromedio(), "El promedio");
    }



    @Test
    void agregarCalificacionExcepcionTest() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> estudiante.agregarCalificacion(11),
                "Se esperaba IllegalArgumentException al agregar una calificación mayor a 10"
        );
        assertEquals("La calificación debe estar entre 0 y 10.", thrown.getMessage());
    }
}