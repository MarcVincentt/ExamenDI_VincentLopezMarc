package org.example.examendi_vincentlopez.models;
/**
 * Clase Prestamo
 */
public class Prestamo {

    private int idLibro;
    private String dniUsuario;

    /**
     * Constructor de la clase Prestamo
     * @param idLibro id del libro
     * @param dniUsuario dni del usuario
     */
    public Prestamo(int idLibro, String dniUsuario) {
        this.idLibro = idLibro;
        this.dniUsuario = dniUsuario;
    }

    /**
     * Getter de libro, devuelve el id del libro
     * @return id del libro
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * Getter de usuario, devuelve el dni del usuario
     * @return dni del usuario
     */
    public String getDniUsuarioPrestamo() {
        return dniUsuario;
    }
}
