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
public class Usuario {
    
    /* Los atributos desde el punto de vista de dise;o deben ser siempre privados
    solo podemos usar publicos cuando hablamos de constantes o final*/
    
    private String nombre;
    private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    
    public Usuario()
    {
        
    }
    
    
    
    
}
