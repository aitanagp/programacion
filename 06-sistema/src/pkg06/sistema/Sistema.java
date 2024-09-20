/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.sistema;

import java.util.Scanner;

/**
 *
 * @author aitan
 * sistemas de ecuaciones lineales
 */
public class Sistema {

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
        
        System.out.println("Introduce el numero 5: ");
        Scanner tecladoe = new Scanner(System.in);
        int e = tecladoe.nextInt();
        
        System.out.println("Introduce el numero 6: ");
        Scanner tecladof = new Scanner(System.in);
        int f = tecladof.nextInt();
        
        double x, y;
        
        x = ((c*e)-(b*f)) / ((a*e) - (b*d));
        y = ((a*f)-(c*d)) / ((a*e)-(b*d));
        
        System.out.println("La solucion de c = " + a + "*" + x + "+" + b + "*" + y + " es: " + (a*x) + (b*y));
    }
    
}
