import java.util.Scanner;
public class RETO8 {
    
    public static void main(String[] args){

        //declarar variables
        String p1="", p2="", p3="";
        int cp,vidas=3;
        Scanner capi=new Scanner(System.in);

        //Guardar el valor ingresado en la variable ContadorPalabras
        System.out.println("Hola jugador. \nDigíte cuantas palabras quiere adivinar 1, 2 o 3.");
            cp=capi.nextInt();

            //Con un condicional multiple evaluamos disitntos casos utilizandi un condicional adicional
            //En caso de que el dato ingresado mediante el scanner sea diferente al almacenado el iterador vidas se reduce
        while(vidas>0){
            switch(cp){
                case 1:
                System.out.println("Escriba la palabra :D\n Pista: Plural de algo que se encuentra en las ostras");
                p1=capi.next();
                if(p1.equalsIgnoreCase("almejas")){
                        System.out.println("Ganaste viejo, que genial :)");
                } else {
                    System.out.println("Pierdes una vida unu" + vidas +" restantes"); vidas--;
                }
               break;
               case 2: 
               System.out.println("Adivina la primera palabra \n Pista: Ave de estanque la cual gusta de migas de pan"); 
               p2=capi.next();
               System.out.println("Adivina la segunda palabra\n Pista: Plural de algo que se encuentra en las ostras");
               p1=capi.next();

                if(p1.equalsIgnoreCase("almejas") && p2.equalsIgnoreCase("pato")){
                    System.out.println("Ganaste dude :D");
                } else {
                    System.out.println("Chale,no las adivinaste te quedan " + vidas + " vidas"); vidas--;
                }
                break;
               case 3:
               System.out.println("Adivina la primera palabra\n Pista: INCREÍBLE pero en latín");    
                p3=capi.next();
               System.out.println("Adivina la segunda palabra\n Pista: Hace QUACK");
                p2=capi.next();
               System.out.println("Adivina la tercera palabra\n Pista: Las contienen las ostras");     
                if(p1.equalsIgnoreCase("almejas") && p2.equalsIgnoreCase("pato") && p3.equalsIgnoreCase("incredibilis")){
System.out.println("Le atinó a todas, que grande BV");                    
                } else {
                    System.out.println("Nah, muy dificil" + vidas+ " restantes"); vidas--;    
                }
                break;
            }            
        }
        System.out.println("Gracias por jugar personita :D"); 
        capi.close();
    }
}
