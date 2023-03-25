import java.util.Scanner;
public class RETO5{
    public static void main(String [] args){

    int jugador;
    //Definimos la variable (v)idas la cual usaremos como condición en el ciclo del juego 
    int edad,v=3;
    String nombre;
    Scanner captura=new Scanner(System.in);
//Capturar edad
        System.out.println("Bienvenido. Dígame su edad");
        edad=captura.nextInt();

            //evaluar edad
                    if(edad>100){
                        System.out.println("No mame morro. Sea serio");
                    } else if (edad<18){
                        System.out.println("No mame viejo, vaya a comerse un elote");
                    } else{
                        
                        System.out.println("Ponga su nombre");
                        nombre=captura.next();
                        while (v !=0){
                            System.out.println("Saisho wa gu,jan ken \n Tienes " +v +" vidas"); 
                            System.out.println("El bot ya eligió");
                            //Generamos la clase bot .Le asignamos al bot el valor que el método random generó. Random está limitado a 3 posibles numeros
                            int bot=(int)(Math.random()*3)+1;
                        System.out.println("Ahora, toma una decisión \n 1. Papel\n 2. Piedra\n 3. Tijeras ");
                        jugador=captura.nextInt();
      //Evaluar el caso 1, 2 y 3 y dentro de estos evaluar el caso 1.2; 1.3 etc...          
                    switch(jugador){
                         case 1:
                            System.out.println("Mi socio juega papel...");
                            switch (bot){
                                    case 1: System.out.println("Y.. El bot saca papel, Entonces hay un empate");
                                    break;
                                    case 2: System.out.println("Y.. Su papel se come la piedra del bot, enhorabuena"); v++;
                                    break;
                                    case 3: System.out.println("El bot contraataca con unas tijeras y le gana a su papelito"); v--;
                                    break;
                            }
                         break;
                         case 2:
                            System.out.println("El master lanza una piedra... ");
                            switch (bot){
                                case 1: System.out.println(".. A la cual el bot la atrapa usando un papel. perdiste XD"); v--;
                                break;
                                case 2: System.out.println(".. El bot le responde tirando una piedra, se chocan en el aire y PUM!!, Empate");
                                break;
                                case 3: System.out.println(".. El bot trata de defenderse usando unas tijeras que se rompen por la piedra, congrats, le ganó al bot y lo descalabró, que grande"); v++;
                                break;
                            }
                        break;
                         case 3:
                            System.out.println("Se puso peleón con las tijeras ");
                            switch (bot) {
                                case 1: System.out.println(".. Ganas ya que las tijeras hacen añicos el escudo de papel del bot"); v++;
                                break;
                                case 2: System.out.println(".. Tus tijeretas las rompe el rocazo que le dio el bot, Pierdes por que fuiste descalabrado"); v--;
                                break;
                                case 3: System.out.println(".. Quedan en empate ya que el bot mando unas tijeras a hacer un duelo");
                        break; 
                            }
                        }
                    }
                    //Cada vez que se genere un caso donde la elección del jugador sea superada por la del bot, se restará un valor al iterador del ciclo (v)
                         captura.close();
                         System.out.println("Gracias por jugar " +nombre);                   
                    
                }
            
    
    }
}