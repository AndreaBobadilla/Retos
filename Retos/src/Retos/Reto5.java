package Retos;
// Importamos la clase Scanner 
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        // Declarar variables
        int diaNaci;
        String mesNaci;
        // Instanciamos la clase Scanner
        Scanner capturar=new Scanner (System.in);
        // Solicitamos dia de nacimiento
        System.out.println("Ingrese su dia de nacimiento: ");
        // Capturamos dia de nacimiento
        diaNaci = capturar.nextInt();
        // Solicitamos mes de nacimiento
        System.out.println("Ingrese su mes de nacimiento: ");
        // Capturamos mes de nacimiento
        mesNaci = capturar.next();
        // Utilizamos un condicional if para comparar los datos y determinar su signo zodiacal
        // Se evalua de la siguiente manera: 
        //(Marzo: dias -> 21 - 31; Abril: dias -> 1 - 20 = Aries)
        if(diaNaci>=21 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Marzo") || diaNaci>=1 && diaNaci<=20 && mesNaci.equalsIgnoreCase("Abril")){
            System.out.println("Tu signo zodiacal es Aries, tus caracteristicas son: Aries es un signo de fuego representado por un carnero y regido por Marte. Son personas con mucha energía y entusiastas. Le gustan los retos, las nuevas ideas y ama su libertad. Prefieren dar instrucciones que recibirlas, se ofenden fácilmente y son rencorosos." +
            "Los Aries son excelentes deportistas, médicos, exploradores, soldados o pilotos. Son buenos líderes y en cargos de política lo hacen muy bien. En sus relaciones de amistad son muy leales, y en el amor son muy apasionados, aunque les lleva tiempo comprometerse.");
        //(Abril: dias -> 21 - 31; Mayo: dias -> 1 - 21 = Tauro)
        }else if(diaNaci>=21 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Abril") || diaNaci>=1 && diaNaci<=21 && mesNaci.equalsIgnoreCase("Mayo")){
            System.out.println("Tu signo zodiacal es Tauro, tus caracteristicas son: Tauro está representado por el Toro y se encuentra regido por Venus. Las personas nacidas bajo este signo son pacientes y persistentes a la hora de alcanzar sus objetivos. Son confiables y seguras de sí mismas, aunque egocéntricas y resistentes al cambio." +
            "Los Tauro buscan relaciones estables y apasionadas. En el trabajo son confiables y rutinarios, y también ejercen muy bien como líderes. Son creativos e inteligentes, y funcionan muy bien como arquitectos, administradores, médicos y químicos.");
        //(Mayo: dias -> 22 - 31; Junio: dias -> 1 - 21 = Geminis)   
        }else if(diaNaci>=22 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Mayo") || diaNaci>=1 && diaNaci<=21 && mesNaci.equalsIgnoreCase("Junio")){
            System.out.println("Tu signo zodiacal es Geminis, tus caracteristicas son: Géminis es un signo de aire representado por mellizos, y está regido por Mercurio. Los Géminis son versátiles y se adaptan fácilmente a las circunstancias por muy difíciles que sean. Son elocuentes, comunicativos y cariñosos. Sin embargo detestan la rutina y eso los hace ser poco constantes." +
            "En el amor los Géminis también son duales; por un lado rechazan el romanticismo pero por el otro se entregan totalmente. En el trabajo pueden ser poco fiables, y su falta de constancia no les ayuda. Aún así son buenos en las ventas, en la política y en trabajos que impliquen creatividad.");
        //(Junio: dias -> 22 - 31; Julio: dias -> 1 - 22 = Cancer)       
        }else if(diaNaci>=22 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Junio") || diaNaci>=1 && diaNaci<=22 && mesNaci.equalsIgnoreCase("Julio")){
            System.out.println("Tu signo zodiacal es Cancer, tus caracteristicas son: Cáncer es un signo de agua, representado por el cangrejo y regido por la luna. Son sensibles, cariñosos y protectores, y tienen mucha imaginación y son hogareños. Aún así tienen tendencia al mal humor, son desorganizados y no toleran la crítica." +
            "En el amor buscan estabilidad y son comprometidos, cariñosos y detallistas. No les gustan las discusiones y en ocasiones son celosos. En el trabajo triunfan con facilidad, pues son empáticos y muy comprometidos. Les van bien las relaciones públicas, pero tambén el hogar y la cocina.");
        //(Julio: dias -> 23 - 31; Agosto: dias -> 1 - 23 = Leo)  
        }else if(diaNaci>=23 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Julio") || diaNaci>=1 && diaNaci<=23 && mesNaci.equalsIgnoreCase("Agosto")){
            System.out.println("Tu signo zodiacal es Leo, tus caracteristicas son: Leo está representado por el león, es signo de fuego y lo rige el sol. Las personas bajo este signo son generosas, fieles y cariñosas. También son dominantes, creativos, ambiciosos y valientes. De todos modos, en ocasiones les gana la arrogancia y la prepotencia." +
            "En el amor expresan una gran honestidad, e incluso en ocasiones hasta llega a ser hiriente. Son muy apasionados y les gusta experimentar antes de comprometerse. En el trabajo, los Leo buscan puestos donde puedan ejercer su autoridad.");
        //(Agosto: dias -> 24 - 31; Septiembre: dias -> 1 - 23 = Virgo)
        }else if(diaNaci>=24 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Agosto") || diaNaci>=1 && diaNaci<=23 && mesNaci.equalsIgnoreCase("Septiembre")){
            System.out.println("Tu signo zodiacal es Virgo, tus caracteristicas son: Virgo es un signo de tierra representado por la virgen y regido por Mercurio. Son personas trabajadoras, meticulosas y perfeccionistas. Se inclinan por la vida sana, son muy higiénicos y vanidosos. Hay que saber que además son conservadores y muy críticos con los demás." +
            "En el amor son personas muy cariñosas y son muy buenos padres o madres. Sin embargo suelen ser desconfiados. En el trabajo funcionan mejor siguiendo órdenes que siendo líderes, y se inclinan por profesiones o actividades que requieran rutina y orden.");
        //(Septiembre: dias -> 24 - 31; Octubre: dias -> 1 - 23 = Libra)  
        }else if(diaNaci>=24 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Septiembre") || diaNaci>=1 && diaNaci<=23 && mesNaci.equalsIgnoreCase("Octubre")){
            System.out.println("Tu signo zodiacal es Libra, tus caracteristicas son: Libra está representado por la balanza, es un signo de aire y lo rige Venus. Las personas nacidas bajo este signo son diplomáticas, sociables, optimistas y pacifistas. Suelen ser muy imparciales ,pero también algo tercos si se les contradice." + 
            "Los Libra son buenos amigos y compañeros sentimentales, y son cariñosos y fieles. En el trabajo triunfan en lo que tenga que ver con ventas y relaciones personales. También pueden ser buenos abogados o dominar cuestiones relacionadas con impartición de justicia.");
        //(Octubre: dias -> 24 - 31; Noviembre: dias -> 1 - 22 = Escorpio)
        }else if(diaNaci>=24 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Octubre") || diaNaci>=1 && diaNaci<=22 && mesNaci.equalsIgnoreCase("Noviembre")){
            System.out.println("Tu signo zodiacal es Escorpio, tus caracteristicas son: Escorpio es un signo de agua representado por un escorpión y está regido por Marte. Las personas escorpio son decididas, pasionales y emocionales. Son muy intensos, y así viven lo bueno y lo malo. Además hay que saber que son extremadamente observadores." +
            "Por otro lado, los Escorpio son personas muy sensuales y pasionales. Sus relaciones amorosas son muy profundas y llenas de intensidad. En el ámbito profesional, los escorpiones pueden triunfar en cualquier ámbito gracias a su gran capacidad de observación y crítica.");
        //(Noviembre: dias -> 23 - 31; Diciembre: dias -> 1 - 21 = Sagitario)
        }else if(diaNaci>=23 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Noviembre") || diaNaci>=1 && diaNaci<=21 && mesNaci.equalsIgnoreCase("Diciembre")){
            System.out.println("Tu signo zodiacal es Sagitario, tus caracteristicas son: Sagitario está representado por el centauro, y es un signo de fuego regido por Júpiter. Los nacidos bajo este signo son simpáticos, honestos, optimistas y tienen buen humor. Tambieén pueden ser irresponsables, demasiado inquietos y superficiales." +
            "En el amor los Sagitario buscan estabilidad, y si la encuentran son fieles, cariñosos y controlados. En el trabajo encuentran el éxito en la docencia, como científicos, en publicidad, en la música y en los deportes.");
        //(Diciembre: dias -> 22 - 31; Enero: dias -> 1 - 20 = Capricornio)
        }else if(diaNaci>=22 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Diciembre") || diaNaci>=1 && diaNaci<=20 && mesNaci.equalsIgnoreCase("Enero")){
            System.out.println("Tu signo zodiacal es Capricornio, tus caracteristicas son: Capricornio es un signo de tierra, está representado por una cabra con cola de pez y lo rige Júpiter. Las personas del signo Capricornio son ambiciosas y disciplinadas. Son prácticas, prudentes y pacientes. Sin embargo tienden a la melancolía y el pesimismo." +
            "En el amor les cuesta confiar y abrirse a sus parejas. Sienten que nunca pueden llegar a sentirse plenos y felices. En el trabajo son honestos y disciplinados. Son muy organizados, por lo que funcionan bien como gestores, administradores y economistas.");
        //(Enero: dias -> 21 - 31; Febrero: dias -> 1 - 18 = Acuario)
        }else if(diaNaci>=21 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Enero") || diaNaci>=1 && diaNaci<=18 && mesNaci.equalsIgnoreCase("Febrero")){
            System.out.println("Tu signo zodiacal es Acuario, tus caracteristicas son: Acuario está representado por el aguador, es un signo de aire y su planeta es Urano. Los nacidos bajo este signo son muy humanitarios, honestos y leales. Algunos acuario son tímidos y otros se van al extremo, convirtiéndose en los más extrovertidos." +
            "En el amor los acuario son honestos y fieles, y esperan lo mismo de sus parejas. Si no lo consiguen no lo saben manejar bien y pueden acabar muy afectados. En el trabajo funcionan perfectamente siendo líderes de grupos y llevándolos a lograr objetivos.");
        //(Febrero: dias -> 19 - 31; Marzo: dias -> 1 - 20 = Piscis)
        }else if(diaNaci>=19 && diaNaci<=31 && mesNaci.equalsIgnoreCase("Febrero") || diaNaci>=1 && diaNaci<=20 && mesNaci.equalsIgnoreCase("Marzo")){
            System.out.println("Tu signo zodiacal es Piscis, tus caracteristicas son: Piscis es un signo de agua representado por los peces y regido por Neptuno. Un nacido bajo este signo es una persona sensible, amable y con mucha compasión hacia con los demás. Además son tranquilos, pacientes y amables. Sin embargo no tienen mucha iniciativa para buscar soluciones ante adversidades." +
            "En las relaciones personales los piscis son personas muy entregadas, y buscan una unión profunda en todos niveles con sus parejas. En el trabajo funcionan mejor si lo hacen solos o si no tienen que tomar decisiones.");
        // Si no es ninguna de las anteriores condiciones el dia y el mes que digito el usuario son invalidos
        }else{
            System.out.println("Ingrese un dia y un mes de nacimiento valido");
        }
        // Limpiamos Buffer
        capturar.close();
    }
}
