package org.example.examendi_vincentlopez.models;

import java.time.LocalDate;

/**
 * Clase Usuario
 */
public class Usuario {

    private String dniUsuario;
    private String fechaAltaSancion;
    private LocalDate fechaActual;

    /**
     * Constructor de la clase Usuario
     * @param dniUsuario Dni del usuario
     * @param fechaAltaSancion Fecha de alta de la sancion del usuario
     */
    public Usuario(String dniUsuario, String fechaAltaSancion) {
        this.dniUsuario = dniUsuario;
        this.fechaAltaSancion = fechaAltaSancion;
        this.fechaActual = LocalDate.now();
    }

    /**
     * Getter del dni del usuario
     * @return Dni del usuario
     */
    public String getDniUsuario() {
        return dniUsuario;
    }

    /**
     * Getter de la fecha de alta de la sancion del usuario
     * @return Fecha de alta de la sancion del usuario
     */
    public String getFechaAltaSancion() {
        return fechaAltaSancion;
    }

    /**
     * Metodo para sancionar a un usuario
     * @param dniUsuario Dni del usuario
     */
    public void sancionar(String dniUsuario, String fechaAltaSancion) {
        this.dniUsuario = dniUsuario;
        this.fechaAltaSancion = fechaAltaSancion;
    }

    /**
     * Metodo para verificar las sanciones de los usuarios
     */
    public void verificarSanciones() {
        if (fechaActual.isAfter(LocalDate.parse(fechaAltaSancion).plusDays(14))) {
            sancionar(dniUsuario, fechaAltaSancion);
        }else {
            quitarSancion(dniUsuario, fechaAltaSancion);
        }
    }

    /**
     * Metodo para quitar la sancion a un usuario
     * @param dniUsuario Dni del usuario
     * @param fechaAltaSancion Fecha de alta de la sancion del usuario
     */
    public void quitarSancion(String dniUsuario, String fechaAltaSancion) {
        this.dniUsuario = dniUsuario;
        this.fechaAltaSancion = fechaAltaSancion;
    }
}
