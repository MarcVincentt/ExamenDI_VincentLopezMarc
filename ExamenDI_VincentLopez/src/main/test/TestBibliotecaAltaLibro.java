import org.example.examendi_vincentlopez.models.*;

import static org.junit.Assert.*;

/**
 * Clase de prueba para el método altaLibro de la clase Biblioteca
 */
public class TestBibliotecaAltaLibro {

    private Biblioteca biblioteca;
    private Libro[] libros;

    /**
     * Configuración inicial para las pruebas
     */
    @org.junit.Test
    public void setUp() {
        // Configuración inicial para las pruebas
        libros = new Libro[10];
        biblioteca = new Biblioteca(libros, new Prestamo[10], new Usuario[10]);
    }

    /**
     * Prueba para el método altaLibro
     */
    @org.junit.Test
    public void testAltaLibro_AtributosUnicosNoRepetidos() {
        // Verificar que se pueda dar de alta un libro con atributos únicos no repetidos
        biblioteca.altaLibro(1, "Java 101", "1234567890", "John Doe", Tematica.Revista, "01/01/2022");

        // Verificar que el libro se haya agregado correctamente
        assertNotNull(libros[0]);
        assertEquals("Java 101", libros[0].getTitulo());
        assertEquals("1234567890", libros[0].getIsbn());
    }

    /**
     * Prueba para el método altaLibro
     */
    @org.junit.Test
    public void testAltaLibro_AtributosUnicosRepetidos() {
        // Agregar un libro inicial
        biblioteca.altaLibro(1, "Java 101", "1234567890", "John Doe", Tematica.Infantil, "01/01/2022");

        // Intentar agregar un libro con atributos únicos repetidos
        biblioteca.altaLibro(2, "Python Basics", "1234567890", "Jane Doe", Tematica.Ensayo, "01/02/2022");

        // Verificar que el segundo libro no se haya agregado (misma ISBN)
        assertNull(libros[1]);
    }
}
