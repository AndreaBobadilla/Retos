package Retos;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        // Declarar variables
        int cantprodu;
        float preprodu, total = 0;

        
        String respu;
        Scanner capturar=new Scanner (System.in);
        do{
            System.out.println("¿Cuantos productos desea comprar?");
            cantprodu = capturar.nextInt();
            for(int i = 0; i<cantprodu; i++){
                System.out.println("Digite el precio del producto # " + (i+1));
                preprodu = capturar.nextFloat();
                total = total + preprodu;
            }
            System.out.println("El total de su compra es: " + total);
            System.out.println("¿Desea realizar otra compra?: Si, No");
            respu = capturar.next();
        }while(respu.equalsIgnoreCase("Si"));
        System.out.println("Muchas gracias por su compra, Vuelva pronto");
    capturar.close();
    }
}
