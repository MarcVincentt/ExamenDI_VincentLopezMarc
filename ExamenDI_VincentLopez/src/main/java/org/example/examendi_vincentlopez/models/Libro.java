package org.example.examendi_vincentlopez.models;
/**
 * Clase Libro
 */
public class Libro {

    private int idLibro;
    private String titulo;
    private String isbn;
    private String autor;
    private Tematica tematica;
    private String fechaEdicion;

    /**
     * Constructor de la clase Libro
     * @param idLibro Identificador del libro
     * @param titulo Titulo del libro
     * @param isbn ISBN del libro
     * @param autor Autor del libro
     * @param tematica Tematica del libro
     * @param fechaEdicion Fecha de edicion del libro
     */
    public Libro(int idLibro, String titulo, String isbn, String autor, Tematica tematica, String fechaEdicion) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.tematica = tematica;
        this.fechaEdicion = fechaEdicion;
    }

    /**
     * Devuelve el identificador del libro
     * @return Identificador del libro
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * Devuelve el titulo del libro
     * @return Titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro
     * @return Autor del libro
     */
    public String getIsbn() {
        return isbn;
    }
}
