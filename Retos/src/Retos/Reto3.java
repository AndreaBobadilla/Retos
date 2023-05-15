package Retos;
// Importamos la clase Scanner
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        // Declarar variables 
        String ladmon=null, carisell;
        int elerandom;
        // Instanciamos la clase Scanner
        Scanner capturar=new Scanner (System.in);
        // Solicitamos que elija una opcion cara o sello
        System.out.println("Elija una opcion: cara, sello");
        // Capturamos la opcion que eligio 
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
        }else{
            System.out.println("El lado que dio es " + ladmon + ", asi que perdiste");
        }
        // Limpiamos Buffer 
        capturar.close(); 
        }
    }
