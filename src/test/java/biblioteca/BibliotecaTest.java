package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    /**
     * Configuración inicial antes de cada test.
     */
    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("Binding 13", "Chloe Walsh", 2024);
        libro2 = new Libro("Un cuento perfecto", "Elisabet Benavent", 2020);
    }

    /**
     * Prueba para agregar un libro a la biblioteca.
     */
    @Test
    void agregarLibro() {
        biblioteca.agregarLibro(libro1);
        assertNotNull(biblioteca.getLibros());
        assertEquals(1, biblioteca.getLibros().size());
        assertTrue(biblioteca.getLibros().contains(libro1));
    }

    /**
     * Prueba para eliminar un libro de la biblioteca.
     */
    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro1);
        biblioteca.eliminarLibro(libro1);
        assertEquals(0, biblioteca.getLibros().size());
        assertFalse(biblioteca.getLibros().contains(libro1));
    }

    /**
     * Prueba para encontrar un libro por su título.
     */
    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro1);
        assertNotNull(biblioteca.encuentraLibroPorTitulo("Binding 13"));
        assertEquals(libro1, biblioteca.encuentraLibroPorTitulo("Binding 13"));
    }

    /**
     * Prueba para encontrar libros por un autor específico.
     */
    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        assertNotNull(biblioteca.encuentraLibrosPorAutor("Chloe Walsh"));
        assertEquals(1, biblioteca.encuentraLibrosPorAutor("Chloe Walsh").size());
        assertTrue(biblioteca.encuentraLibrosPorAutor("Chloe Walsh").contains(libro1));
    }
}