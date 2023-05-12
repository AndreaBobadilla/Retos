package Retos;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        // Declarar variables 
        String nomEnfer, nomBebe, nomPa;
        float pesBebe, dosVacu; 
        int mesBebe;
        // Instanciamos la clase scanner
        Scanner capturar=new Scanner(System.in);
        // Solicitamos dato 1
        System.out.println("Digite el Nombre de la enfermera:");
        // Capturamos dato 1
        nomEnfer= capturar.nextLine();
        // Solicitamos dato 2
         System.out.println("Digite el Nombre del bebe:");
        // Capturamos dato 2
         nomBebe= capturar.nextLine();
        // Solicitamos dato 3
        System.out.println("Digite el Nombre del padre:");
        // Capturamos dato 3
        nomPa= capturar.nextLine();
        // Solicitamos dato 4
        System.out.println("Digite el Peso del bebe:");
        // Capturamos dato 4
        pesBebe= capturar.nextFloat();
        // Solicitamos dato 5
        System.out.println("Digite el Mes del bebe:");
        // Capturamos dato 5
        mesBebe= capturar.nextInt();
        // Calculamos la cantidad de dosis
        dosVacu= (pesBebe+10)/(mesBebe*10)*8;
        // Mostramos resultado
        System.out.println("La enfermera " + nomEnfer + " le aplico una cantidad de dosis de vacuna de " + dosVacu + " litros al bebe "+ nomBebe + " con el peso de " + pesBebe + " Kg y "+ mesBebe + " meses de nacido del padre " + nomPa);
        // La enfermera Andrea le aplico una cantidad de dosis de vacuna de 1.25 litros al bebe jose con el peso de 4.5 kg y 2 meses de nacido del padre Alberto 
        // Limpieza Buffer 
        capturar.close(); 
        
    }
}

