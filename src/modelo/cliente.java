/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuaria
 */
public class cliente extends persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
  public void agregar(){
  System.out.println("nit: " + getNit() );
  System.out.println("nombre: " + this.getNombre() );
  System.out.println("apellido: " + this.getApellido() );
  System.out.println("direccion: " + this.getDireccion() );
  System.out.println("telefono: " + this.getTelefono() );
  System.out.println("fecha_nacimiento: " + this.getFecha_nacimiento() );
  
  }
    
    
}
