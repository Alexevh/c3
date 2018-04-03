/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import logica.Logica;
import logica.Tipo;
import logica.Usuario;

/**
 *
 * @author alex
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        cargarDatos();
        
        
        /* Genero una ventana de login*/
        new Login(null, false).setVisible(true);
    }

    private static void cargarDatos() {
       
        Logica logica = Logica.getInstancia();
        logica.agregarUsuario(new Usuario("Peter", "password"));
        logica.agregarUsuario(new Usuario("Jack", "1234"));
        logica.agregarTipo(new Tipo("Simple"));
        logica.agregarTipo(new Tipo("Circular"));
        logica.agregarTipo(new Tipo("Aleatoria"));
    }
}
