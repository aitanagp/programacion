/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosexpresiones;

import java.util.Scanner;

/**
 *
 * @author aitan
 * esccribir las expresiones aritmeticas siemmpre que los enteros sean mayores de 0 y c yd son distintps
 */
public class EjerciciosExpresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce el numero 1: ");
        Scanner tecladoa = new Scanner(System.in);
        int a = tecladoa.nextInt();
        
        System.out.println("Introduce el numero 2: ");
        Scanner tecladob = new Scanner(System.in);
        int b = tecladob.nextInt();
        
        System.out.println("Introduce el numero 3: ");
        Scanner tecladoc = new Scanner(System.in);
        int c = tecladoc.nextInt();
        
        System.out.println("Introduce el numero 4: ");
        Scanner tecladod = new Scanner(System.in);
        int d = tecladod.nextInt();
        
        if ((a > 0 && b > 0 && c > 0 && d > 0) && (c != d)) {
            System.out.println("a / b + 1 = " + (a/b+1));
            System.out.println("a + b / c - d = " + (a+b/c-d));
            System.out.println("a + b / c = " + (a+b/c));
            System.out.println("a + b * c / d = " + (a+b*(c/d)));
            System.out.println("[(a+b)^2]^2 = " + Math.pow(Math.pow(a+b, 2), 2));
            System.out.println("a * b / 1-4*a = " + ((a*b)/4-1*a));
            System.out.println("(a + b)^2 * a - b = " + Math.pow(a + b,2) * (a - b));
        }
    }
    
}
