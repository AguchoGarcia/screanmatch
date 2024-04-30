import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Primera impresion del curso de inmersion en Java");
        //System.out.println("Pelicula Rescatando al Soldado Ryan");

        //Declaracion de variables
        int fechaDeLanzamiento = 1998;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBase = true;
        String nombre = "Rescatando al Soldado Ryan";
        String sinopsis = """
            Después de desembarcar en Normandía, en plena Segunda Guerra Mundial, unos soldados norteamericanos deben arriesgar sus vidas para salvar al soldado James Ryan, cuyos tres hermanos han muerto en la guerra.
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("Incluido en el plan Base: " + incluidoEnElPlanBase);

        double mediaEvaluacion = (4.5 + 5 + 3) / 3;
        System.out.println("Media de Evalucaion: " + mediaEvaluacion);
     
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Pelicula Popular en el Momento");
        } else {
            System.out.println("Pelicula Retro en Tendencia");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa tu puntuacion sobre la pelicula:");
            double notaUsuario = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaUsuario;
        } 
        System.out.println("La media de la pelicula, da un resultado de: " +
                mediaEvaluacionUsuario / 3);

    }
}
