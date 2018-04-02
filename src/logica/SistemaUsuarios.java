/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class SistemaUsuarios {
    
    
    private ArrayList<Usuario> usuarios = new ArrayList();
    
    /* los metodos publicos tienen que ser los menos */
    public Usuario login(String nombre, String pass)
    {
        for (Usuario u: usuarios)
        {
            if(u.getNombre().equalsIgnoreCase(nombre)&&u.getPassword().equals(pass))
            {
                return u;
            }
        }
        
        return null;
    }
    
    
    
    
}
