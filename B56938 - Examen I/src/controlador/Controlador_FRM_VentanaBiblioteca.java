
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosBiblioteca;
import vista.FRM_VentanaBiblioteca;


public class Controlador_FRM_VentanaBiblioteca implements ActionListener {

    FRM_VentanaBiblioteca frm_VentanaBiblioteca;
    MetodosBiblioteca metodosBiblioteca;
    
    public Controlador_FRM_VentanaBiblioteca(FRM_VentanaBiblioteca frm_VentanaBiblioteca) 
    {
        this.frm_VentanaBiblioteca=frm_VentanaBiblioteca;
        metodosBiblioteca = new MetodosBiblioteca();
    }
    
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getActionCommand().equalsIgnoreCase("Consultar"))
        {
            buscar();
        }
        if(evento.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodosBiblioteca.agregarPrestamoDeLibro(frm_VentanaBiblioteca.getInformacion());
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Prestamo agregado correctamente");
            frm_VentanaBiblioteca.inicializarGUI();
        }
        if(evento.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosBiblioteca.modificarPrestamoDeLibro(frm_VentanaBiblioteca.getInformacion());
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Prestamo modificado correctamente");
            frm_VentanaBiblioteca.inicializarGUI();
            
        }
        if(evento.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosBiblioteca.eliminarPrestamoDeLibro(frm_VentanaBiblioteca.devolverNumeroPrestamo());
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Prestamo eliminado");
            frm_VentanaBiblioteca.inicializarGUI();
        }
    }
    
    public void buscar()
    {
        if(metodosBiblioteca.consultarPrestamoLibro(frm_VentanaBiblioteca.devolverNumeroPrestamo()))
        {
            frm_VentanaBiblioteca.mostrarInformacion(metodosBiblioteca.getArregloInformacionConsultada());
            frm_VentanaBiblioteca.habilitarEdicion();
           
        }
        else
        {
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Prestamo no encontrado");
             frm_VentanaBiblioteca.habilitarAgregar();
        }
    }
    
}
