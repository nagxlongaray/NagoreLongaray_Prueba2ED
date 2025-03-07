package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    /**
     * Test para verificar que el constructor de Libro asigna correctamente los valores.
     */
    @Test
    void testConstructor() {
        Libro libro = new Libro("Binding 13", "Chloe Walsh", 2024);

        assertNotNull(libro);
        assertEquals("Binding 13", libro.getTitulo());
        assertEquals("Chloe Walsh", libro.getAutor());
        assertEquals(2024, libro.getAnioPublicacion());
    }

}
