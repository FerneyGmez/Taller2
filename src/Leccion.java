public class Leccion {

    public String id;
    public String titulo;
    public int duracion;


    public Leccion(String id, String titulo, int duracion){
        this.id = id;
        this.titulo = titulo;
        this.duracion =  duracion;

    }

    public String getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracion(){
        return duracion;
    }

}