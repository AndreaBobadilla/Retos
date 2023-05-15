package Retos;
// Importamos clase Scanner
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        // Declarar variables
        int cantprodu;
        float preprodu, total = 0;
        String respu;
        // Instanciamos la clase Scanner
        Scanner capturar=new Scanner (System.in);
        // Comienza ciclo do
        do{
            // Solicitamos cantidad de productos a comprar 
            System.out.println("¿Cuantos productos desea comprar?");
            // Capturamos cantidad de productos
            cantprodu = capturar.nextInt();
            // Comienza ciclo for
            for(int i = 0; i<cantprodu; i++){
                // Solicitamos precio de los productos
                System.out.println("Digite el precio del producto # " + (i+1));
                // Capturamos precio de los productos
                preprodu = capturar.nextFloat();
                // Calculamos el total a pagar de todos los productos
                total = total + preprodu;
            }
            // Mostramos el total de la compra
            System.out.println("El total de su compra es: " + total);
            // Preguntamos si desea agregar mas productos a su compra
            System.out.println("¿Desea agregar mas productos a su compra?: Si, No");
            // Capturamos respuesta 
            respu = capturar.next();
        // En un while comparamos la respuesta: (si es si -> repite ciclo; si es no -> muestra mensaje y termina ciclo)
        }while(respu.equalsIgnoreCase("Si"));
        // Mostramos mensaje de despedida y se termina el ciclo
        System.out.println("Muchas gracias por su compra, Vuelva pronto");
        // Limpiamos Buffer
        capturar.close();
    }
}
