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
public class Tipo {
    
    private String nombre;
    private ArrayList<Publicidad> publicidades = new ArrayList();

    public Tipo(String simple) {
        this.nombre = simple;
    }
    
    

    public void agregar(Publicidad p) {
        publicidades.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Publicidad> getPublicidades() {
        return publicidades;
    }

    public void setPublicidades(ArrayList<Publicidad> publicidades) {
        this.publicidades = publicidades;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
    
}
