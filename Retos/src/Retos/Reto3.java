package Retos;
import java.util.*;

public class Reto3 {
    public static void main(String[] args) {
        String ladmon=null, carisell;
        Scanner capturar=new Scanner (System.in);
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
        }else{
            System.out.println("El lado que dio es " + ladmon + ", asi que perdiste");
        }  
        capturar.close(); 
        }
    }
