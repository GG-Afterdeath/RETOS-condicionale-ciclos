import java.util.Scanner;

public class RETO2 {
    public static void main(String[] args){
      //declarar variables a usar e instanciar Scanner
        String bebe="";
        String medico="";
        String vacuna="";
        String eps="";
        float edad=0;
        float peso=0;
//Solicitar y capturar datos
        Scanner vacuneishon= new Scanner (System.in);

          System.out.println("Ingrese el nombre de su chino: ");
          bebe= vacuneishon.nextLine();
          System.out.println("Ingrese el nombre del profesional de la salud: "); 
          medico= vacuneishon.nextLine();
          System.out.println("Cuál es la vacuna a aplicar: ");
          vacuna= vacuneishon.nextLine();  
          System.out.println("EPS a la que el infante está afiliado: ");
          eps=vacuneishon.nextLine();
          System.out.println("Ingrese cuantos meses de edad tiene el bebé");
          edad=vacuneishon.nextFloat();
          System.out.println("Ingrese el peso de su bebe en kilos");
          peso=vacuneishon.nextFloat();
          vacuneishon.close();
//imprimir toda la información requerida. dentro de la impresión operar las variables edad y dosis
          System.out.println("Al bebé " + bebe + " el doctor " + medico + "de la EPS "+ eps+ " le ha aplicado la vacuna " + vacuna + " en una dosis de " + edad + 15/peso + 15 *10);
    }
}