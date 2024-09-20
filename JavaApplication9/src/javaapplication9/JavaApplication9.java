/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author aitan
 * escribir un programa que calcule y muestre el área de un cuadrado de lado igual a 5
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int lado = teclado.nextInt();
        int area;
        area = lado * lado;
        
        System.out.println("El area de un cuadrado de lado " + lado + " es: " + area);       
    }
    
}
