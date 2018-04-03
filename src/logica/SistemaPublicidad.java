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
public class SistemaPublicidad {


    private ArrayList<Publicidad> publicidades = new ArrayList();
    private  ArrayList<Tipo> tipos = new ArrayList();
    
    public boolean agregarPublicidad(Publicidad p)
    {
        
        if (p.validar() && !publicidades.contains(p))
        {
            publicidades.add(p);
            
            Tipo t = p.getTipo();
            t.agregar(p);
            
            return true;
            
        } else {
            return false;
        }
        
        
        
    }
    

    public void agregarTipo(Tipo t)
    {
        tipos.add(t);
        
    }

    public ArrayList<Publicidad> getPublicidades() {
        return publicidades;
    }

    public void setPublicidades(ArrayList<Publicidad> publicidades) {
        this.publicidades = publicidades;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }
    
    
}
