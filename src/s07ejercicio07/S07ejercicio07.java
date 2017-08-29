/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio07;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("ingrese distancia");
        double d=input.nextDouble();
        System.out.println("ingrese millas/galon:");
        double mxg=input.nextDouble();
        System.out.println("precio/galon: ");
        double pxg=input.nextDouble();
        System.out.println("el costo de viaje es: "+(d/mxg)*pxg);
    }
    
}
