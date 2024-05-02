import java.util.Scanner;

import modelo.Pelicula;
import modelo.Serie;

public class Principal {

    public void muestraElMenu() {

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion  != 9) {
            String menu = """
                    Bienvenido a Screanmatch.
                    1. Registrar Pelicula.
                    2. Registrar Serie.

                    9. Salir.
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                System.out.println("Ingrese el nombre de la Pelicula: ");
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el año de lanzamiento: ");
                int fechaDeLanzamiento = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese la duracion en minutos de la Pelicula: ");
                int duracionEnMinutos = teclado.nextInt();
                teclado.nextLine();
                Pelicula peliculaUsuario = new Pelicula();
                peliculaUsuario.setNombre(nombre);
                peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                peliculaUsuario.muestraFichaTecnica();
                break;

                case 2:
                System.out.println("Ingrese el nombre de la Serie: ");
                String nombreSerie = teclado.nextLine();
                System.out.println("Ingrese el año de lanzamiento: ");
                int fechaDeLanzamientoSerie = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese la duracion en minutos de la Serie: ");
                int duracionEnMinutosSerie= teclado.nextInt();
                teclado.nextLine();
                Serie serieUsuario = new Serie();
                serieUsuario.setNombre(nombreSerie);
                serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                serieUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutosSerie);
                serieUsuario.muestraFichaTecnica();
                break;

                case 9: System.out.println("Saliendo de la aplicacion.");
                break;

                default: System.out.println("Opcion no valida.");
                break;
            }
        }
    }
}
