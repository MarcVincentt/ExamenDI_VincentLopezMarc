import org.example.examendi_vincentlopez.models.*;
import static org.junit.Assert.*;

/**
 * Clase de prueba para el método prestar de la clase Biblioteca
 */
public class TestBibliotecaPrestar {

    private Biblioteca biblioteca;
    private Libro[] libros;
    private Prestamo[] prestamos;
    private Usuario[] usuarios;

    /**
     * Configuración inicial para las pruebas
     */
    @org.junit.Test
    public void setUp() {
        // Configuración inicial para las pruebas
        libros = new Libro[0];
        prestamos = new Prestamo[0];
        usuarios = new Usuario[0];
        biblioteca = new Biblioteca(libros, prestamos, usuarios);
    }

    /**
     * Prueba para el método prestar
     */
    @org.junit.Test
    public void testPrestarLibroNoExiste() {
        // Verificar que no se pueda prestar un libro que no existe
        biblioteca.prestar(1, "123456789"); // DNI de un usuario ficticio
        assertNull(prestamos[0]); // No debería haber préstamo
    }

    /**
     * Prueba para el método prestar
     */
    @org.junit.Test
    public void testPrestarUsuarioNoExiste() {
        // Verificar que no se pueda prestar un libro a un usuario que no existe
        Libro libro = new Libro(1, "Java 101", "1234567890", "John Doe", Tematica.Cientifico, "01/01/2022");
        libros[0] = libro;
        biblioteca.prestar(1, "111111111"); // DNI de un usuario ficticio
        assertNull(prestamos[1]); // No debería haber préstamo
    }

    /**
     * Prueba para el método prestar
     */
    @org.junit.Test
    public void testPrestarLibroYUsuarioExisten() {
        // Verificar que se pueda realizar un préstamo correctamente
        Libro libro = new Libro(1, "Java 101", "1234567890", "John Doe", Tematica.Novela, "01/01/2022");
        libros[0] = libro;
        biblioteca.prestar(1, "123456789"); // DNI de un usuario ficticio
        assertNotNull(prestamos[0]); // Debería haber préstamo
        assertEquals(1, prestamos[0].getIdLibro());
    }
}
