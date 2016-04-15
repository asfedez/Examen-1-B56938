/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class MetodosBiblioteca {
    
    ArrayList<PrestamoLibro> listaDePrestamos;
    String arregloInformacionConsultada[] = new String[4];
    
    public MetodosBiblioteca()
    {
        listaDePrestamos = new ArrayList<PrestamoLibro>();
    }
    
    
    public void agregarPrestamoDeLibro(String arreglo[])
    {
        listaDePrestamos.add(new PrestamoLibro(arreglo[0],arreglo[1],arreglo[2],arreglo[3]));
    }
    
    
    public boolean consultarPrestamoLibro(String numeroPrestamo)
    {
        boolean existencia=false;
        for (int i = 0; i < listaDePrestamos.size(); i++) {
            if(listaDePrestamos.get(i).getNumeroPrestamo().equalsIgnoreCase(numeroPrestamo))
            {
                existencia=true;
                arregloInformacionConsultada[0]= listaDePrestamos.get(i).getNumeroPrestamo();
                arregloInformacionConsultada[1]= listaDePrestamos.get(i).getNombreUsuario();
                arregloInformacionConsultada[2]= listaDePrestamos.get(i).getCedulaUsuario();
                arregloInformacionConsultada[3]= listaDePrestamos.get(i).getIsbnLibro();
            }
            
        }
        return existencia;
    }
    
    public String[] getArregloInformacionConsultada()
    {
        return arregloInformacionConsultada;
    }
    
    public void modificarPrestamoDeLibro(String arreglo[])
    {
        for (int i = 0; i < listaDePrestamos.size(); i++) {
            if(listaDePrestamos.get(i).getNumeroPrestamo().equalsIgnoreCase(arreglo[0]))
            {
                listaDePrestamos.get(i).setNombreUsuario(arreglo[1]);
                listaDePrestamos.get(i).setCedulaUsuario(arreglo[2]);
                listaDePrestamos.get(i).setIsbnLibro(arreglo[3]);
            }
            
        }
    }
    
    
    public void eliminarPrestamoDeLibro(String numeroDePrestamo)
    {
        for (int i = 0; i < listaDePrestamos.size(); i++) {
            if(listaDePrestamos.get(i).getNumeroPrestamo().equalsIgnoreCase(numeroDePrestamo))
            {
                listaDePrestamos.remove(i);
            }
        }
    }
    
    
    
}
