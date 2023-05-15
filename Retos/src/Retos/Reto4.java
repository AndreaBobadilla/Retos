package Retos;
// Importamos la clase Scanner
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        // Declarar variables
        String juepipati=null, pipati;
        int elerandom;
        // Instanciamos la clase Scanner
        Scanner capturar=new Scanner (System.in);
        // Solicitamos eligir una opcion piedra, papel o tijera
        System.out.println("Elija una opcion: piedra, papel, tijera");
        // Capturamos la opcion que eligio el usuario
        pipati = capturar.next();
        // Utilizamos el metodo Match random para generar numeros aleatorios de 1 a 3
        elerandom = (int)(Math.random()*3+1);
        // Creamos condicional if para asignar un valor a juepipati dependiendo de la condicion (1 = piedra, 2 = papel, 3 = tijera) 
        if(elerandom==1){
            juepipati = "piedra";
        }else if(elerandom==2){
            juepipati = "papel";
        }else if(elerandom==3){
            juepipati = "tijera";
        }
        // Mostramos el numero aleatorio que genero elerandom para comprobar si quedo funcional el programa
        System.out.println(elerandom);
        // Utilizamos un switch para comprobar y evaluar la eleccion del usuario
        switch(pipati.toLowerCase()){
        /*En caso de que sea piedra evalua con un condicional if: 
        (si elerandom es 1 juepipati es piedra, el usuario ha empatado; si elerandom es 2 juepipati es papel, el usuario ha perdido;
        si elerandom es 3 jupipati es tijera, el usuario ha ganado)*/
            case "piedra":
            if(elerandom==1){
                System.out.println( juepipati + ", Has empatado");
            }else if (elerandom==2){
                System.out.println(juepipati + ", Has perdido");
            }else if (elerandom==3){
                System.out.println(juepipati + ", Has ganado");
            }
            break;
        /*En caso de que sea papel evalua con un condicional if: 
        (si elerandom es 1 juepipati es piedra, el usuario ha ganado; si elerandom es 2 juepipati es papel, el usuario ha empatado;
        si elerandom es 3 jupipati es tijera, el usuario ha perdido)*/
            case "papel":
            if(elerandom==1){
                System.out.println( juepipati + ", Has ganado");
            }else if (elerandom==2){
                System.out.println(juepipati + ", Has empatado");
            }else if (elerandom==3){
                System.out.println(juepipati + ", Has perdido");
            }
            break;
        /*En caso de que sea tijera evalua con un condicional if: 
        (si elerandom es 1 juepipati es piedra, el usuario ha perdido; si elerandom es 2 juepipati es papel, el usuario ha ganado;
        si elerandom es 3 jupipati es tijera, el usuario ha empatado)*/
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
    // Limpiamos Buffer
    capturar.close(); 
    }
}

