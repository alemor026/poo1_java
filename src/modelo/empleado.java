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
public class empleado extends persona{
     private String codigo_empleado, puesto;

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
     @Override
     public void agregar(){
  System.out.println("Codigo Empleado: " + getCodigo_empleado() );
  System.out.println("Puesto: " + getPuesto() );
  System.out.println("Nombre: " + this.getNombre() );
  System.out.println("Apellido: " + this.getApellido() );
  System.out.println("Direccion: " + this.getDireccion() );
  System.out.println("Telefono: " + this.getTelefono() );
  System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento() );
  
  }
   
    
}
