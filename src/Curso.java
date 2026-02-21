import java.util.ArrayList;
import java.util.List;

public class Curso {

    enum Nivel {BASICO, INTERMEDIO, AVANZADO}

    public String nombre;
    public String descripcion;
    public String categoria;
    public Nivel nivel;
    public List<Leccion> lecciones;

    public Curso(String nombre, String descripcion, String categoria, Nivel nivel){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nivel = nivel;

        this.lecciones = new ArrayList<>();
    }

    public void agregarLeccion(Leccion leccion){
        lecciones.add(leccion);
    }

    public void eliminarLeccion(Leccion leccion){
        lecciones.remove(leccion);
    }

    public void enProgreso(Leccion leccion){
        System.out.println("Leccion el progreso" + leccion.getTitulo());
    }

    public void finalizado(Leccion leccion){
        System.out.println("Leccion finalizada" + leccion.getTitulo());
    }

    public List<Leccion> getLecciones(){
        return lecciones;
    }

    public String getNombre(){
        return nombre;
    }

}
