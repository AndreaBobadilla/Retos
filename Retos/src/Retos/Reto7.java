package Retos;
// Importamos la clase Scanner
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        // Declarar variables
        int cantApu, cont = 0, suma = 0;
        String ladmon=null, carisell;
        int respu, elerandom;
        // Instanciamos la clase Scanner
        Scanner capturar=new Scanner (System.in);
        // Comienza ciclo do
        do{
            // Solicitamos cantidad de dinero a apostar
            System.out.println("¿Cuanto dinero quiere apostar?");
            // Capturamos cantidad de dinero 
            cantApu = capturar.nextInt();
            // Solicitamos al usuario elegir una opcion cara o sello
            System.out.println("Elija una opcion: cara, sello");
            // Capturamos la opcion del usuario
            carisell = capturar.next();
            // Utilizamos el metodo Match random para generar numeros aleatorios de 1 a 2 
            elerandom = (int)(Math.random()*2+1);
            // Creamos condicional if para asignar un valor a ladmon dependiendo de la condicion (1 = cara, 2 = sello)
            if(elerandom==1){
                ladmon = "cara";
            }else if(elerandom==2){
                ladmon = "sello";
            }
            // Mostramos el numero aleatorio que genero elerandom para comprobar si quedo funcional el programa
            System.out.println(elerandom);
            // Para comparar el tipo de dato String se utiliza equalsIgnoreCase 
            // Creamos condicional if para comparar la eleccion del usuario con la de ladmon 
            // (si la opcion que eligio el usuario es igual a ladmon, el usuario gana; si la opcion que eligio el usuario es diferente a ladmon, el usuario pierde)
            if(carisell.equalsIgnoreCase(ladmon)){
                System.out.println("El lado que dio es " + ladmon + ", asi que ganaste");
                // Si gana el usuario, gana el doble de la cantidad de dinero apostado
                suma = suma + cantApu + cantApu;
                // Mostramos el total de la apuesta por el momento
                System.out.println(suma);
            }else{
                System.out.println("El lado que dio es " + ladmon + ", asi que perdiste");
                // Si pierde el usuario, pierde la cantidad de dinero apostado
                suma = suma + cantApu - cantApu;
                // Mostramos el total de la apuesta por el momento
                System.out.println(suma);
            }
            // Contador de veces jugadas
            cont++;
            // Preguntamos al usuario si quiere continuar jugando
            System.out.println("¿Quiere seguir jugando?: 1 Si, 2 No");
            // Capturamos respuesta del usuario
            respu = capturar.nextInt();
            // Con un while comparamos respuesta (si la respuesta es 1 -> Repite ciclo; si la respuesta es 2 -> muestra mensaje y termina ciclo)
            }while(respu==1);
            // Mostramos mensaje con el numero de veces jugadas y el total de dinero
            System.out.println("Su total de veces jugadas es: " + cont + " Y su total en dinero es: " + suma);
            // Limpiamos Buffer
            capturar.close(); 
        }
    }
