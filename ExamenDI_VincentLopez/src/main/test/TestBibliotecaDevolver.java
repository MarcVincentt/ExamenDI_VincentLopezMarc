import org.example.examendi_vincentlopez.models.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Clase de test para el método devolver de la clase Biblioteca
 */
public class TestBibliotecaDevolver {

    private Biblioteca biblioteca;
    private Libro[] libros;
    private Prestamo[] prestamos;
    private Usuario[] usuarios;

    /**
     * Método para inicializar los atributos antes de cada test
     */
    @org.junit.Test
    public void setUp() {
        // Configuración inicial para las pruebas
        libros = new Libro[10];
        prestamos = new Prestamo[10];
        usuarios = new Usuario[10];
        biblioteca = new Biblioteca(libros, prestamos, usuarios);
    }

    /**
     * Test para el método devolver de la clase Biblioteca
     */
    @org.junit.Test
    public void testDevolver_EnFecha() {
        // Verificar que se pueda devolver un libro en fecha
        Libro libro = new Libro(1, "Java 101", "1234567890", "John Doe", Tematica.Cientifico, "01/01/2022");
        libros[0] = libro;
        Prestamo prestamo = new Prestamo(1, "123456789");
        prestamos[0] = prestamo;
        Usuario usuario = new Usuario("123456789", "2022-01-01");
        usuarios[0] = usuario;

        // Realizamos la devolución en fecha
        biblioteca.devolver(1, "123456789");

        // Verificar que el préstamo se eliminó y el usuario no tiene sanción
        assertNull(prestamos[0]);
        assertNull(usuario.getFechaAltaSancion());
    }

    /**
     * Test para el método devolver de la clase Biblioteca
     */
    @org.junit.Test
    public void testDevolver_FueraDeFecha() {
        // Verificar que se pueda devolver un libro fuera de fecha
        Libro libro = new Libro(1, "Java 101", "1234567890", "John Doe", Tematica.Ensayo, "01/01/2022");
        libros[0] = libro;
        Prestamo prestamo = new Prestamo(1, "123456789");
        prestamos[0] = prestamo;
        Usuario usuario = new Usuario("123456789", "2022-01-01");
        usuarios[0] = usuario;

        // Avanzamos la fecha de sanción para que esté fuera de fecha
        usuario.sancionar("123456789", "2022-01-01");
        usuario.verificarSanciones();

        // Realizamos la devolución fuera de fecha
        biblioteca.devolver(1, "123456789");

        // Verificar que el préstamo se eliminó pero el usuario sigue sancionado
        assertNull(prestamos[0]);
        assertNotNull(usuario.getFechaAltaSancion());
    }
}
