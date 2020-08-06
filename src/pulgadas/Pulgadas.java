package pulgadas;

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class Pulgadas {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       DecimalFormat dec = new DecimalFormat("#.0");
       
       double n = 0;
       String u = "";
       double r = 0;
       double v = 0;
       
       System.out.println("BIENVENIDO");
       System.out.println("----------");
       System.out.println("¿Que unidad de medida vas a convertir a pulgadas?");
       System.out.println("");
       System.out.println("Escribe P para convertir pies");
       System.out.println("Escribe C para convertir centimetros");
       System.out.println("Escribe L para convertir leguas");
       System.out.println("Escribe Y para convertir yardas");
       u = entrada.nextLine();
       if ("p".equals(u)){
           u = "pies";
           System.out.println("¿Cual es el valor en pies que deseas convertir a pulgadas?");
           v = entrada.nextDouble();
           r = v/0.0833;
       } else if ("c".equals(u)){
           u = "centimetros";
           System.out.println("¿Cual es el valor en centimetros que deseas convertir a pulgadas?");
           v = entrada.nextDouble();
           r = v/2.54;
       } else if ("l".equals(u)){
           u = "leguas";
           System.out.println("¿Cual es el valor en leguas que deseas convertir a pulgadas?");
           v = entrada.nextDouble();
           r = 190080.02*v;
       } else if("y".equals(u)){
           u = "yardas";
           System.out.println("¿Cual es el valor en yardas que deseas convertir a pulgadas?");
           v = entrada.nextDouble();
           r = 36*v;
       } else {
       System.out.println("El valor que has ingresado es incorrecto o escribiste la letra en mayuscula");
       }
       System.out.println("--------------------------------------");
       System.out.println("Resultado: " + dec.format(v) + " " + u + " equivalen a " + dec.format(r) + " pulgadas");
    }
    
}
