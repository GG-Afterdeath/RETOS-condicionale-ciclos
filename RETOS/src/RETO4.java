import java.util.Scanner;
public class RETO4 {

    public static void main(String[] args){

        String nombre;
        int edad;
        int jugador;
        Scanner capturar=new Scanner(System.in);

        //solicitar y capturar nombre y edad en el scanner
        System.out.println("Bienvenido, por favor digíte su nombre güero.");
            nombre=capturar.next();
        System.out.println("Dígame su edad.");
            edad=capturar.nextInt();

            //evaluar la edad
            if(edad>100){
                System.out.println("Mi so, usted ya no puede jugar");
            } else if( edad<18){
                System.out.println("Crezca antes de jugar chiquitín");
            } else{
                System.out.println("Saisho wa gu,jan ken"); 
                //Crear clase bot la cual va a tener el valor que genere el metodo random. Random está limitado para generar solo tres posibles resultados
            System.out.println("El bot ya eligió");
            int bot=(int)(Math.random()*3)+1;
        System.out.println("Ahora, toma una decisión \n 1. Papel\n 2. Piedra\n 3. Tijeras ");
        jugador=capturar.nextInt();

        //Evaluar cada resultado posible comparando el valor de eleccion del jugador con la que generó el metodo random
    switch(jugador){
         case 1:
            System.out.println("Mi socio juega papel...");
            switch (bot){
                    case 1: System.out.println("Y.. El bot saca papel, Entonces hay un empate"); 
                    break;
                    case 2: System.out.println("Y.. Su papel se come la piedra del bot, enhorabuena"); 
                    break;
                    case 3: System.out.println("El bot contraataca con unas tijeras y le gana a su papelito");
                    break;
            }
         break;
         case 2:
            System.out.println("El master lanza una piedra... ");
            switch (bot){
                case 1: System.out.println(".. A la cual el bot la atrapa usando un papel. perdiste XD");
                break;
                case 2: System.out.println(".. El bot le responde tirando una piedra, se chocan en el aire y PUM!!, Empate");
                break;
                case 3: System.out.println(".. El bot trata de defenderse usando unas tijeras que se rompen por la piedra, congrats, le ganó al bot y lo descalabró, que grande");
                break;
            }
        break;
         case 3:
            System.out.println("Se puso peleón con las tijeras ");
            switch (bot) {
                case 1: System.out.println(".. Ganas ya que las tijeras hacen añicos el escudo de papel del bot");
                break;
                case 2: System.out.println(".. Tus tijeretas las rompe el rocazo que le dio el bot, Pierdes por que fuiste descalabrado");
                break;
                case 3: System.out.println(".. Quedan en empate ya que el bot mando unas tijeras a hacer un duelo");
        break; 
            }
    }
    capturar.close();
    System.out.println("Muchas tenkius por jugar " + nombre);
    }
    }
}