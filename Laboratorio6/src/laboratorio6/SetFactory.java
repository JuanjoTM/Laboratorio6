/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Juan Tomás García (13019)
  Juan José Tzun    (13017)
  Hoja de Trabajo 6
*/
package laboratorio6;
import java.util.*;

public class SetFactory <E>{
    
    public Set<E> getSet(String selection){
        if(selection.equals("HS"))
            return new HashSet<E>();
        if(selection.equals("TH"))
            return new TreeSet<E>();
        else
            return new LinkedHashSet();
    }
}
