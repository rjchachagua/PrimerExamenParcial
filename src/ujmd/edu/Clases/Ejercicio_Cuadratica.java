/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.Clases;

import java.util.Scanner;

/**
 *
 * @author rjcha
 */
public class Ejercicio_Cuadratica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b,c,aux,x,x1,x2;

        System.out.println("Ingrese el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = teclado.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = teclado.nextDouble();

        aux = Math.pow(b, 2) - 4 * a * c;
        if (aux < 0) {
            System.out.println("La ecuación no tiene soluciones reales");
        }
        if (aux == 0) {
            x=-b/(2*a);
        }else{
            System.out.println("La ecuación tiene dos soluciones reales distintas");
            x1=(-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
            x2=(-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
            
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}
