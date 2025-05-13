import java.util.*;

public class Inventario {

    private static ArrayList<String> nombres = new ArrayList<>();
    private static ArrayList<Integer> cantidades = new ArrayList<>();
    private static ArrayList<Double> precios = new ArrayList<>();

    // Método Principal (main)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Condiciones para cada opción
        // Iteración
        while (true) {
            indice();
            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1) {
                agregar();
            } else if (opcion == 2) {
                mostrar();
            } else if (opcion == 3) {
                total();
            } else if (opcion == 4) {
                borrar();
            } else if (opcion == 5) {
                System.out.println("Sesión terminada");
                break;
            } else {
                System.out.println("Valor invalido. Ingrese un valor del índice");
            }
            System.out.println();
        }
        sc.close();
    }

    // Método para mandar a salida estándar el índice
    public static void indice() {
        // Índice de funciones
        System.out.println(" Índice ");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Total de productos");
        System.out.println("4. Borrar producto");
        System.out.println("5. Salir");
        System.out.print(":");
    }

    // Método para agregar productos al inventario
    public static void agregar() {
        // Entrada de los datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        // Asignación de los datos en los arreglos
        nombres.add(nombre);
        cantidades.add(cantidad);
        precios.add(precio);
    }

    // Este método es para mostrar todos los productos que haya en el inventario
    public static void mostrar() {
        // Función para el caso en el que no haya productos en el inventario
        if (nombres.size() == 0) {
            System.out.println("No hay productos almacenados");
        }
        // Salida estándar de los productos almacenados
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(i + 1 + ". " + nombres.get(i) + " - " + cantidades.get(i) + " unidades - $" + precios.get(i));
        }
    }

    // Mostrar la cantidad de productos que hay en el inventario
    public static void total() {
        // Salida estándar del total de los productos en el inventario
        System.out.println("Total de productos en stock: " + nombres.size());
    }

    // Método para poder borrar el producto que se desee
    public static void borrar() {
        // Función para cuando no haya productos registrados
        if (nombres.size() == 0) {
            System.out.println("No hay productos para borrar");
        } else {
            // Primero se muestra el inventario
            mostrar();
            // Selección del producto para borrar
            System.out.print("Producto a borrar: ");
            int borrar = new Scanner(System.in).nextInt();
            nombres.remove(borrar - 1);
            cantidades.remove(borrar - 1);
            precios.remove(borrar - 1);
            System.out.println("Producto borrado");
        }
    }
}
