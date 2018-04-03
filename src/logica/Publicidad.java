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
public class Publicidad {

    private String nombre;
    private ArrayList<Aviso> avisos = new ArrayList();
    private Tipo tipo;
    private boolean activa;

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    public Publicidad()
    {
        
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
    
    public boolean validar() {
        return !nombre.isEmpty()&&tipo!=null && avisos.size()>0;        
        
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Aviso> getAvisos() {
        return avisos;
    }

    public void setAvisos(ArrayList<Aviso> avisos) {
        this.avisos = avisos;
    }
    
    
    
    
    @Override
    public boolean equals(Object o)
    { 
        Publicidad p = (Publicidad) o;
        return p.nombre.equalsIgnoreCase(nombre);
    }
    
    /* Un aviso no tiene sentido sin la publicidad, es una composcion en nuestro UML 
    por eso en vez de ser creado por el propio objeto aviso quien lo crea es publicidad
    */
    public boolean agregarAviso(String txt, int duracion)
    {
        if (!activa)
        {
             Aviso a = new Aviso(txt, duracion);
             if (a.validar() && !avisos.contains(a))
             {
                 avisos.add(a);
                 return true;
             }
        }
        
        return false;
       
        
    }
    
    @Override
    public String toString()
    {
        return nombre + "[" + avisos.size() + "]";
    }
    
}
