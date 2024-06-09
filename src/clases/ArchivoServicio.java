package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoServicio {
    public ArchivoServicio() {
    }

    public void cargarDatos(ProductoServicio productoServicio, String ruta) {
        try(FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr)) {
            String line;
            while((line = br.readLine()) != null) {
                String [] dato = line.split(",");
                Producto producto = new Producto(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], dato[6]);
//                System.out.println(producto);

                productoServicio.agregarProductos(producto);
                System.out.println(productoServicio.getListaProductos());
            }
            System.out.println("Datos agregados a la lista correctamente");
            System.out.println();

        } catch(IOException e) {
            e.printStackTrace();
    }
    }
}

