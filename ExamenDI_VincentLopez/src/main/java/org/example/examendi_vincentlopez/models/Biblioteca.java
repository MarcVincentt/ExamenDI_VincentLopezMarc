package org.example.examendi_vincentlopez.models;

/**
 * Clase Biblioteca
 *
 * Esta clase representa una biblioteca, con sus libros, prestamos y usuarios.
 *
 * Atributos:
 * - libros: array de libros
 * - prestamos: array de prestamos
 * - usuarios: array de usuarios
    *
 * Métodos:
 * - altaLibro: añade un libro al array de libros
 * - bajaLibro: elimina un libro del array de libros
 * - prestar: añade un prestamo al array de prestamos
 * - devolver: elimina un prestamo del array de prestamos
 *
 * @author Marc Vincent Lopez
 * @version 1.0
 */
public class Biblioteca {

    private Libro[] libros;
    private Prestamo[] prestamos;
    private Usuario[] usuarios;

    /**
     * Constructor de la clase Biblioteca
     *
     * @param libros array de libros
     * @param prestamos array de prestamos
     * @param usuarios array de usuarios
     */
    public Biblioteca(Libro[] libros, Prestamo[] prestamos, Usuario[] usuarios) {
        this.libros = libros;
        this.prestamos = prestamos;
        this.usuarios = usuarios;
    }

    /**
     * Método para añadir un libro al array de libros
     *
     * @param idLibro id del libro
     * @param titulo titulo del libro
     * @param isbn isbn del libro
     * @param autor autor del libro
     * @param tematica tematica del libro
     * @param fechaEdicion fecha de edicion del libro
     */
    public void altaLibro(int idLibro, String titulo, String isbn, String autor, Tematica tematica, String fechaEdicion) {
        Libro libro = new Libro(idLibro, titulo, isbn, autor, tematica, fechaEdicion);
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                break;
            }
        }
    }

    /**
     * Método para eliminar un libro del array de libros
     *
     * @param idLibro id del libro
     */
    public void bajaLibro(int idLibro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getIdLibro() == idLibro) {
                libros[i] = null;
                break;
            }
        }
    }

    /**
     * Método para añadir un prestamo al array de prestamos
     *
     * @param idLibro id del libro
     * @param dniUsuario dni del usuario
     */
    public void prestar(int idLibro, String dniUsuario) {
        Prestamo prestamo = new Prestamo(idLibro, dniUsuario);
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = prestamo;
                break;
            }
        }
    }

    /**
     * Método para eliminar un prestamo del array de prestamos
     *
     * @param idLibro id del libro
     * @param dniUsuario dni del usuario
     */
    public void devolver(int idLibro, String dniUsuario) {
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null && prestamos[i].getIdLibro() == idLibro && prestamos[i].getDniUsuarioPrestamo().equals(dniUsuario)) {
                prestamos[i] = null;
                break;
            }
        }
    }
}
