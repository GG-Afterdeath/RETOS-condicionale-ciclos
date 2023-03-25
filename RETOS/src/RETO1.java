import java.util.Scanner;

public class RETO1 {
    public static void main (String[] args) {
    //F es C + 32 <-- En Farenheit
    //K es C + 273 <-- En Kelvin
    //Le sumaré a las operaciones 100 más ya que se fue el cambio que le dieron al reto. 

    int centigrados=0;
    int farenheit= 132;
    int kelvin= 373; 

    Scanner temperaturas= new Scanner (System.in);
    System.out.println("Hola abuela, por favor ingrese la temperatura que le va a poner a su horno, este programa le mostrará en diferentes unidades de medida.");
    System.out.println("Ingrese la temperatura de su horno en grados C");
    centigrados=temperaturas.nextInt();
    System.out.println("La temperatura ingresada de Centigrados fue " + centigrados + " En grados Farenheit sería " + (farenheit+centigrados) + " y en Kelvin  " + (kelvin+centigrados));
    temperaturas.close();



    }
}