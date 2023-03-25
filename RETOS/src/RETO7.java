import java.util.Scanner;
import java.util.Random;

public class RETO7 {
    public static void main(String[] args){
    String j1, j2, l1, l2;
    int n,v=2,v2=2, i;
        Scanner cap =new Scanner(System.in);
        
        System.out.println("Bienvenidos a los daditos\n Ganará el jugador 2 si deja sin vidas al 1. TODOS TIENEN 2 VIDAS");
            System.out.println("Ingrese el nombre del primer jugador");
        j1=cap.next();
            System.out.println("Ingrese el nombre del segundo jugador");
        j2=cap.next();
        
        //Solicitamos un input, una vez se ejecute se generará un número aleatorio del 1 al 6 con el metodo random
            while(v>0){
                System.out.println("Jugador 1, Escriba LANZAR");
                l1=cap.next();
                int r=(int) (Math.random()*6)+1;
                System.out.println("Jugador 2, Escriba LANZAR");
                l2=cap.next();
                int r2=(int) (Math.random()*6)+1;
                
                //Evaluamos todos los posibles casos que se presentarán en los 6 posibles resultadps
                switch(r){
                    case 1:
                    switch(r2){
                        case 1: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                        break;
                        case 2: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 3: System.out.println( j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 4: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 5: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 6: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                    }
                    break;
                    case 2: 
                    switch(r2){
                        case 1: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                        break;
                        case 2: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                        break;
                        case 3: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 4: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 5: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                        case 6: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                        break;
                }
                break;
                case 3: 
                switch(r2){
                    case 1: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                    break;
                    case 2: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                    break;
                    case 3: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                    break;
                    case 4: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                    break;
                    case 5: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                    break;
                    case 6: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                    break;
            }
            break;
            case 4:
            switch(r2){
                case 1: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 2: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 3: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 4: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 5: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 6: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                break;
    }
    break;
            case 5:
            switch(r2){
                case 1: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 2: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 3: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 4: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 5: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 6: System.out.println( j1+ " Saca "+ r+ " el " + j2+ " saca" + r2); v--;
                break;
}
            break;
            case 6:
            switch(r2){
                case 1: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 2: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 3: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 4: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 5: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
                case 6: System.out.println(j1+ " Saca "+ r+ " el " + j2+ " saca" + r2);
                break;
}           
break;
}
    }
    cap.close();
}
}