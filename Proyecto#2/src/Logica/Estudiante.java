
package Logica;


public class Estudiante extends Persona {
    
    // Atributos
    private String Carrera;
    private String promedio;
    
  
    // construuctor vacio para instancias
     
    public Estudiante(){
        
    }
    
   
    // constructor 
    public Estudiante(String Carrera, int promedio, String id, String nombre, String apellido1, String apellido2) {
        super(id, nombre, apellido1, apellido2);
        this.Carrera = Carrera;
        
    }
    
    
    // setters and getters

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

   

    
   
    
}
