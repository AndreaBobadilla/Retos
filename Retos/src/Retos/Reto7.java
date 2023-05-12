package Retos;
import java.util.*;
public class Reto7 {
    public static void main(String[] args) {
        float cantApu, cont = 0, suma = 0;
        String ladmon=null, carisell;
        int respu =
        
        0;
        Scanner capturar=new Scanner (System.in);
        do{
            System.out.println("¿Cuanto dinero quiere apostar?");
            cantApu = capturar.nextFloat();
            System.out.println("Elija una opcion: cara, sello");
            carisell = capturar.next();
            int elerandom = (int)(Math.random()*2+1);
            if(elerandom==1){
                ladmon = "cara";
            }else if(elerandom==2){
                ladmon = "sello";
            }
            System.out.println(elerandom);
            if(carisell.equalsIgnoreCase(ladmon)){
                System.out.println("El lado que dio es " + ladmon + ", asi que ganaste");
                suma = suma + cantApu + cantApu;
                System.out.println(suma);
            }else{
                System.out.println("El lado que dio es " + ladmon + ", asi que perdiste");
                suma = suma + cantApu - cantApu;
                System.out.println(suma);
            cont++;
            }
            System.out.println("¿Quiere seguir jugando?: 1 Si, 2 No");
            respu = capturar.nextInt();
            }while(respu==1);
            System.out.println("Su total de veces jugadas es: " + cont + " Y su total en dinero es: " + suma);
            capturar.close(); 
        }
    }
