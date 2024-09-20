/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author aitan
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce el numero 1: ");
        Scanner teclado1 = new Scanner(System.in);
        int n1 = teclado1.nextInt();
        
        System.out.println("Introduce el numero 2: ");
        Scanner teclado2 = new Scanner(System.in);
        int n2 = teclado2.nextInt();
        
        
        int suma = n1 + n2;
        int resta = n1 - n2;
        int producto = n1 * n2;
        int division = n1 / n2;
        
        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + suma);
        System.out.println("La resta de " + n1 + " y " + n2 + " es: " + resta);
        System.out.println("El producto de " + n1 + " y " + n2 + " es: " + producto);
        System.out.println("La division de " + n1 + " y " + n2 + " es: " + division);
    }
    
}
