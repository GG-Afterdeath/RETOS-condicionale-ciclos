import java.util.Scanner;

public class RETO6 {
    public static void main(String [] args){
        //Declaramos variables a utilizar e instanciamos el Scanner
        int edad, tel;
        int it=1;
        String ini; 
    String nombre, apellido, exp, gust; 
    Scanner chisme=new Scanner(System.in);

    //evaluamos la respuesta almacenada en la variable ini
    System.out.println("¿Quiere enviar un formulario?\n SI / NO");
    ini=chisme.next();
    if (ini.equalsIgnoreCase("SI")){
    while (it==1){
        System.out.println("Bienvenido al formulario, necesito que me colabore con su doxxeo");
//el formulario solicitará datos y los almacena en las variables 
    System.out.println("Nombre");
nombre=chisme.next();
    System.out.println("Apellido");
apellido=chisme.next();
    System.out.println("Edad");
edad=chisme.nextInt();
    System.out.println("Cuente una experiencia (Haga espacios con _)");
exp=chisme.next();
    System.out.println("Cuente que es lo que más le gusta");
gust=chisme.next();

//Aquí solicitamos que le añada un valor al iterador. MIENTRAS el iterador valga 1(SI) se repetirá el proceso 
System.out.println("¿Desea enviar otro formulario? \n 1. SI 0. NO");
it=chisme.nextInt();
    }
} else {
    System.out.println("Todo bien");
}
 chisme.close();


    }
}