package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductoServicio {
    private Producto producto = new Producto();
    private List<Producto> listaProductos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public ProductoServicio() {

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ProductoServicio(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos() {
        for(Producto producto : listaProductos) {
            System.out.println("1.-El nombre del articulo actual es: " + producto.getArticulo());
            System.out.println("2.-El código del producto: " + producto.getCodigo());
            System.out.println("3.-El color del producto: " + producto.getColor());
            System.out.println("4.-La descripción del producto: " + producto.getDescripcion());
            System.out.println("5.-La marca del producto: " + producto.getMarca());
            System.out.println("6.-El precio del producto: " + producto.getPrecio());
            System.out.println("7.-La talla del producto: " + producto.getTalla());
            System.out.println();
        }
    }

    public void agregarProductos(Producto producto) {
        listaProductos.add(producto);
    }

    public void editarProducto() {
        System.out.println("Ingrese código del producto que quiere editar: ");
        String codigo = sc.nextLine();

        boolean productoEncontrado = false;

        for(Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                productoEncontrado = true;
                  listarProductos();

                System.out.println("Ingrese la opción a editar de los datos del producto: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                if (opcion == 1) {
                    System.out.println("Ingrese nuevo nombre del artículo");
                    String dato = sc.nextLine();
                    producto.setArticulo(dato);
                } else if (opcion == 2) {
                    System.out.println("Ingrese nuevo código de producto");
                    String dato = sc.next();
                    producto.setCodigo(dato);
                } else if (opcion == 3) {
                    System.out.println("Ingrese nuevo color de producto");
                    String dato = sc.next();
                    producto.setColor(dato);
                } else if (opcion == 4) {
                    System.out.println("Ingrese nueva descripción de producto");
                    String dato = sc.next();
                    producto.setDescripcion(dato);
                } else if (opcion == 5) {
                    System.out.println("Ingrese nueva marca de producto");
                    String dato = sc.next();
                    producto.setMarca(dato);
                } else if (opcion == 6) {
                    System.out.println("Ingrese nuevo precio de producto");
                    String dato = sc.next();
                    producto.setPrecio(dato);
                } else if (opcion == 7) {
                    System.out.println("Ingrese nueva talla de producto");
                    String dato = sc.next();
                    producto.setTalla(dato);
                } else {
                    System.out.println("Opción no válida");
                }
            }
        }
        if(!productoEncontrado)
            System.out.println("Producto no existe");
    }
}
