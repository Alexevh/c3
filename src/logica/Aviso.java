/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author alex
 */
public class Aviso {
 
    private String texto;
    private int duracion;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Aviso(String texto, int duracion) {
        this.texto = texto;
        this.duracion = duracion;
    }

    public boolean validar() {
        return !texto.isEmpty() && texto.length()<=100 && duracion>0;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Aviso a = (Aviso)o;
        return a.texto.equalsIgnoreCase(texto);
    }
    
    
    @Override
    public String toString()
    {
        return texto;
    }
    
}
