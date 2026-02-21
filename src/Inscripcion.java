import java.time.LocalDate; //Para manejar la fecha actualizada
import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    enum estadoInscripcion {ACTIVA, CANCELADA, FINALIZADA}

    public LocalDate fecha;
    public estadoInscripcion estado;
    public List<Leccion> leccionesCompletadas;
    public Curso curso;

    public Inscripcion(Curso curso){
        this.fecha = LocalDate.now();
        this.estado = estadoInscripcion.ACTIVA;
        this.leccionesCompletadas = new ArrayList<>();
        this.curso = curso; //Así guardamos el curso
    }

    public  void completarLeccion(Leccion leccion){
        leccionesCompletadas.add(leccion);
    }
    public estadoInscripcion getEstado(){
        return estado;
    }
    public Curso getCurso(){
        return curso;
    }
    public void cancelar(){
        estado = estadoInscripcion.CANCELADA;
    }
    public void finalizar(){
        estado = estadoInscripcion.FINALIZADA;
    }
}
