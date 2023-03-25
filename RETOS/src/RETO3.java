import java.util.Scanner;
import java.util.Random;
public class RETO3 {

    public static void main(String[] args){
      //declarar variables e instanciar el objeto Scanner
        int edad; 
        //Para generar el número aleatorip importamos el método random, lo guardamos en la variable SUERTE y lo limitamos a dos posibilidades
        int suerte =(int) (Math.random()*2+1);
        String nombre;
        Scanner l =new Scanner(System.in);

        //Solicitar la variable edad. La cual determinará si el programa se ejecuta o no
        System.out.println("Digíte su edad: ");
        edad=l.nextInt();

//Evaluar la edad
if (edad >100){
    System.out.println("Madure, ya esta re grande para estos juegos");
} else if(edad <18){
    System.out.println("Aún no puede jugar");
}else {
    System.out.println("Introduzca su nombre");
    nombre=l.next();

    //Se evalua solo una condicion SUERTE es diferente a 2 imprime CARAS, en cualquier otro caso imprime SELLOS
    if(suerte!=2){
        System.out.println(nombre+ " Ha sacado CARAS");

    } else {System.out.println(nombre+ " Ha sacado SELLOS");}
}
l.close();
    }
}