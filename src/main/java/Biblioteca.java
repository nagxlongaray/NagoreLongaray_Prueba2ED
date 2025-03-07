package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una biblioteca con una colección de libros.
 * Nos permite agregar, eliminar y/o buscar libros por título o por autor.
 *
 * @author Nagore Longaray
 * @version 1.0
 */

public class Biblioteca {

    /**
     * Representa la lista de libros disponibles en la biblioteca.
     */
    private final List<Libro> libros;


    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que nos permite inicializar la biblioteca con una lista de libros.
     *
     * @param libros representa la lista de libros con la que se inicializará la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * agregarLibro: Este metodo añade un libro a la colección de la biblioteca.
     *
     * @param libro Hace referencia al libro que se quiere agregar.
     * @return {@code true} nos devuelve true si el libro se ha añadido correctamente, {@code false} y false si no ha podido agregarlo.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * eliminarLibro: Este metodo elimina un libro de la biblioteca.
     *
     * @param libro El libro que se desea eliminar.
     * @return {@code true} si el libro fue eliminado, {@code false} si no estaba en la biblioteca.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Cuando llamamos a este metodo, nos devuelve la lista de libros disponibles en la biblioteca.
     *
     * @return Devuelve la lista con los libros que se han almacenados en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * encuentraUnLibroPorTitulo: Este metodo, busca un libro dentro de la biblioteca el titulo que le proporcionemos.
     *
     * @param titulo Es el título del libro que se quiera buscar.
     * @return El libro encontrado o {@code null} si ese libro que hemos pasado por el parametro libro no existe en la biblioteca creada.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * encuentaUnLibroPorAutor: Este metodo, busca un libro por su autor.
     * Este metodo está obsoleto y ha sido
     * reemplazado por {@link #encuentraLibrosPorAutor(String)}.
     *
     * @param autor Es el autor del libro que se quisiera buscar.
     * @return Devuelve el primer libro encontrado de ese autor o {@code null} si no existiera.
     * @deprecated Desde la versión 2.0. Usar {@link #encuentraLibrosPorAutor(String)}.
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Encuentra todos los libros (lista de libros) escritos por un autor.
     * Disponible desde la versión 2.0.
     *
     * @param autor Parametro para buscar los libros del autor indicado.
     * @return Una lista con los libros de ese autor o devuelve {@code null} si no hay coincidencias.
     * @since 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
