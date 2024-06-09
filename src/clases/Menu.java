package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio = new ProductoServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();
    private String ruta = "C:\\Users\\andre\\IdeaProjects\\ReciclaJeans\\src\\ProductosImportados.csv";
    private Scanner sc = new Scanner(System.in);
    public Menu() {

    }

    public void mostrarMenu() {
       int opcion = 0;


        do {
            System.out.println("1 Listar producto");
            System.out.println("2 Editar datos");
            System.out.println("3 Importar datos");
            System.out.println("4 Salir");

            System.out.println("Elija una opción");
            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Ingrese una opción entre 1 y 4");
            }
        } while(opcion < 1 || opcion > 4);


        switch (opcion) {
            case 1: productoServicio.listarProductos();
                    mostrarMenu();
                    break;
            case 2: productoServicio.editarProducto();
                mostrarMenu();
                    break;
            case 3:
                archivoServicio.cargarDatos(productoServicio, ruta);
                mostrarMenu();
                    break;
            case 4: System.out.println("Ha finalizado el programa");
                    break;
            default: System.out.println("Opción no válida");
        }
    }
}
