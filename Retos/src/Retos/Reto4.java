package Retos;
import java.util.*;
public class Reto4 {
    
    public static void main(String[] args) {
        String juepipati=null, pipati;
        Scanner capturar=new Scanner (System.in);
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
        capturar.close(); 
    }
}

