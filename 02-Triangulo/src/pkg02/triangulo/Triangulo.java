/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.triangulo;

import java.util.Scanner;

/**
 *
 * @author aitan
 * 02-Triangulo → Programa que calcula el área de un triángulo cuya formula es
a=(b*h)/2.
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double b, h;
        
        h = 3;
        b = 7;
        
        double a = (b * h) / 2;
        
        System.out.println("El área de triángulo es: " + a);
        
    }
    
}
