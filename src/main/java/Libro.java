package biblioteca;

/**
 * Esta clase representa un libro con sus atributos: título, autor y año de publicación.
 *
 * @author Nagore Longaray
 * @version 1.0
*/

public class Libro {


    private String titulo; //Título del libro
    private String autor; //Autor del libro
    private int anioPublicacion; //Año de publicación del libro


    /**
     * Este es el constructor de la clase Libro.
     *
     * @param titulo Título del libro.
     * @param autor Nombre del autor del libro.
     * @param anioPublicacion El año en que se publicó el libro.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el título del libro y cuando llamamos a este metodo, nos muestra el titulo.
     *
     * @return Título del libro.
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Crea un título para el libro.
     *
     * @param titulo El título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el nombre del autor del libro.
     *
     * @return Nombre del autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Crea un nuevo autor para el libro.
     *
     * @param autor El nombre del autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     *
     * @return Año de publicación.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Establece un año de publicación para el libro.
     *
     * @param anioPublicacion El año de publicación.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
