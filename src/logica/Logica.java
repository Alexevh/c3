/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Logica {
    
    private SistemaUsuarios su = new SistemaUsuarios();
    private SistemaPublicidad sp = new SistemaPublicidad();
    
    /* Singleton, el constructor es privado, la instancia es el unico que va a existir*/
    private static Logica instancia = new Logica();
    
    public static Logica getInstancia(){
        return instancia;
    }
    
    private Logica()
    {
        
    }
    
    
    /* Vamos a delegar los metodos */

    public Usuario login(String nombre, String pass) {
        return su.login(nombre, pass);
    }

    public void agregarUsuario(Usuario u) {
        su.agregarUsuario(u);
    }

    public boolean agregarPublicidad(Publicidad p) {
        return sp.agregarPublicidad(p);
    }

    public void agregarTipo(Tipo t) {
        sp.agregarTipo(t);
    }

    public ArrayList<Publicidad> getPublicidades() {
        return sp.getPublicidades();
    }

    public ArrayList<Tipo> getTipos() {
        return sp.getTipos();
    }
    
    
    
    
    
    
}
