import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public String nombre;
    public String email;
    public List<Inscripcion> inscripciones;

    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;

        this.inscripciones = new ArrayList<>();
    }

    public void inscribirse(Curso curso){
        Inscripcion inscripcion = new Inscripcion(curso); //Creo una nueva inscripcion
        inscripciones.add(inscripcion); //Agregamos esta inscripcion al usuario
    }

    public void cancelarInscripcion(Curso curso){
        for (Inscripcion i : inscripciones) {

            // Si la inscripción corresponde al curso
            if (i.getCurso().equals(curso)) {

                // Cancelamos esa inscripción
                i.cancelar();
            }
        }
    }

    public List<Curso> cursosEnProgreso(){
        List<Curso> cursos = new ArrayList<>();

        for(Inscripcion i: inscripciones){
            if(i.getEstado() == Inscripcion.estadoInscripcion.ACTIVA){
                cursos.add(i.getCurso());
            }
        }
        return cursos;
    }

    public List<Curso> cursosFinalizados() {

        List<Curso> cursos = new ArrayList<>();

        for (Inscripcion i : inscripciones) {

            if (i.getEstado() == Inscripcion.estadoInscripcion.FINALIZADA) {

                cursos.add(i.getCurso());
            }
        }

        return cursos;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

}
