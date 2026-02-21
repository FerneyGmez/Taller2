public class Main {

    public static void main(String[] args) {

        //Aca creamos las lecciones
        Leccion l1 = new Leccion("L1", "Introducción a Java", 15);
        Leccion l2 = new Leccion("L2", "POO en Java", 25);

        //Ahora el curso
        Curso cursoJava = new Curso(
                "Java Básico",
                "Curso introductorio de Java",
                "Programación",
                Curso.Nivel.BASICO
        );

        // Agregamos lecciones al curso
        cursoJava.agregarLeccion(l1);
        cursoJava.agregarLeccion(l2);

        // Creo usuario
        Usuario usuario = new Usuario("Bryan", "bryan@email.com");

        // Inscripción del usuario
        usuario.inscribirse(cursoJava);

        System.out.println("Usuario inscrito en el curso.");

        // Simulamos el proceso

        // Obtenemos la inscripción
        Inscripcion inscripcion = usuario.cursosEnProgreso()
                .isEmpty() ? null : null;

        // Forma más clara (mejor práctica para estudiantes):
        for (Inscripcion i : usuario.getInscripciones()) {

            if (i.getCurso().equals(cursoJava)) {

                // Completar una lección
                i.completarLeccion(l1);

                System.out.println("Lección completada.");

                // Finalizar curso
                i.finalizar();

                System.out.println("Curso finalizado.");
            }
        }

        // Curso en progreso y finalizados

        System.out.println("\nCursos en progreso:");
        for (Curso c : usuario.cursosEnProgreso()) {
            System.out.println("- " + c.getNombre());
        }

        System.out.println("\nCursos finalizados:");
        for (Curso c : usuario.cursosFinalizados()) {
            System.out.println("- " + c.getNombre());
        }
    }
}