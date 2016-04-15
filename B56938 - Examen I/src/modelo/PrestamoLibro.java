/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author administrador
 */
public class PrestamoLibro {
    
    private String numeroPrestamo;
    private String nombreUsuario;
    private String cedulaUsuario;
    private String isbnLibro;

    public PrestamoLibro(String numeroPrestamo, String nombreUsuario, String cedulaUsuario, String isbnLibro) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.isbnLibro = isbnLibro;
    }

    /**
     * @return the numeroPrestamo
     */
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    /**
     * @param numeroPrestamo the numeroPrestamo to set
     */
    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the cedulaUsuario
     */
    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    /**
     * @param cedulaUsuario the cedulaUsuario to set
     */
    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    /**
     * @return the isbnLibro
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     * @param isbnLibro the isbnLibro to set
     */
    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }
    
    
    
    
}
