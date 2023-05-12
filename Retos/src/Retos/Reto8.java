package Retos;
import java.util.*;
public class Reto8 {
    public static void main(String[] args) {
        String juepipati=null, pipati;
        int respu = 0;
        Scanner capturar=new Scanner (System.in);
        do{
        System.out.println("Elija una opcion: piedra, papel, tijera");
        pipati = capturar.next();
        int elerandom = (int)(Math.random()*3+1);
        
        if(elerandom==1){
            juepipati = "piedra";
        }else if(elerandom==2){
            juepipati = "papel";
        }else if(elerandom==3){
            juepipati = "tijera";
        }

        System.out.println(elerandom);
        switch(pipati.toLowerCase()){
            case "piedra":
            if(elerandom==1){
                System.out.println( juepipati + ", Has empatado");
            }else if (elerandom==2){
                System.out.println(juepipati + ", Has perdido");
            }else if (elerandom==3){
                System.out.println(juepipati + ", Has ganado");
            }
            break;

            case "papel":
            if(elerandom==1){
                System.out.println( juepipati + ", Has ganado");
            }else if (elerandom==2){
                System.out.println(juepipati + ", Has empatado");
            }else if (elerandom==3){
                System.out.println(juepipati + ", Has perdido");
            }
            break;


            case "tijera":
            if(elerandom==1){
                System.out.println( juepipati + ", Has perdido");
            }else if (elerandom==2){
                System.out.println(juepipati + ", Has ganado");
            }else if (elerandom==3){
                System.out.println(juepipati + ", Has empatado");
            }
            break;

    }
    System.out.println("¿Quiere seguir jugando?: 1 Si, 2 No");
    respu = capturar.nextInt();        
    }while(respu==1);
    System.out.println("Muchas gracias por jugar, Vuelve pronto");
    capturar.close();  
}
}
