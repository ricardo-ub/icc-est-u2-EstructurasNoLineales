package Evaluacion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {

    public Set<Persona> filtrarYOrdenar(
        List<Persona> personas, //10,000 personas
        int edadUmbral){ //18 anios

        Set<Persona> personasFiltradas = new TreeSet<>(
            (p1, p2) -> {
                int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());
                if (compEdad != 0) {
                    //nombres == retorno 0 o no ingrese
                    return 0;
                }
                 int compNombre = p1.getNombre().compareToIgnoreCase(p2.getNombre());
                 return compNombre;
            });

        return null;
    }

    public Map<String, Set<String>> agruparPorEdad (List<Persona> personas){
        //Personas agrupadas por edad
        String nombre = "Juan Perez";
        String [] palabras = nombre.split(" ");
        //["Juan","Perez"]
        nombre.split("e");
        //["Juan P","r", "z"]

        String primerNombre = palabras[0];
        String pNombre = nombre.split(" ")[0];

        return null;
    }
}
