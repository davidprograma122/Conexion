package vista;

import controlador.AutorControlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Autor;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        AutorControlador AutorControlador = new AutorControlador();
        int op1;
        do {
            System.out.println("-----BIENVENIDO-----");
            System.out.println("""
                               Elija la opción que Usted requiera ejecutar:
                               1. Insertar autor
                               2. Mostrar lista de autores registrados
                               3. Actualizar información de un autor (por nombre)
                               4. Eliminar autor (por nombre)
                               0. Salir""");

            op1 = es.nextInt();
            es.nextLine();
            if (op1 == 1) {
                // Insertar libro
                System.out.println("Ingrese el nombre del autor");
                String nombre = es.nextLine();

                System.out.println("Ingrese el apellido del autor:");
                String apellido = es.nextLine();

                System.out.println("Ingrese la fecha de naciemiento (YYYY-MM-DD :");
                String fechaNace = es.nextLine();

                Autor A = new Autor(nombre, apellido, fechaNace);
                AutorControlador.crearAutor(A);

            } else if (op1 == 2) {
                // Mostrar lista de autores
                ArrayList<Autor> listarAutores = AutorControlador.listarAutores();
                for (Autor A : listarAutores) {
                    System.out.println(A.imprimir());
                }

            } else if (op1 == 3) {
                // Actualizar información de un Autor
                System.out.println("Ingrese el nombre del autor que desea actualizar:");
                String nombre = es.nextLine();

                String AutorExistente = AutorControlador.buscarAutor(nombre);
                if (AutorExistente == null) { 
                    System.out.println("Autor no encontrado.");
                } else {
                    System.out.println("Ingrese el apellido del autor a actualizar:");
                    String nuevoApellido = es.nextLine();

                    System.out.println("Ingrese la nueva fecha de nacimiento (YYYY-MM-DD):");
                    String nuevaFechaNace = es.nextLine();

                    Autor AutActualizado = new Autor(AutorExistente, nuevoApellido, nuevaFechaNace);
                    AutorControlador.actualizarAutor(AutActualizado, AutorExistente);
                }
            } else if (op1 == 4) {
                // Eliminar Autor
                System.out.println("Ingrese el nombre del autor que desea eliminar:");
                String nombre = es.nextLine();
                AutorControlador.eliminarAutor(nombre);

            } else if (op1 == 0) {
                System.out.println("Saliendo...");

            } else {
                System.out.println("Opción no válida, por favor elija una opción entre 0 y 4.");
            }
        } while (op1 != 0);

        es.close();
    }
}
