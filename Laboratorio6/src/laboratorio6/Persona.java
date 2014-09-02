/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Juan Tomás García (13019)
  Juan José Tzun    (13017)
  Hoja de Trabajo 6
*/
package laboratorio6;

public class Persona implements Comparable<Persona>{
    private String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Persona -> " + nombre;
    }
   
    public int compareTo(Persona o){
        if (this.getNombre() == o.getNombre())
            return 1;
        else
            return 0;
    }
    
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        Persona other = (Persona)obj;
        if(this.nombre.equals(other.getNombre()))
            return true;
        else
            return false;
    }
}
