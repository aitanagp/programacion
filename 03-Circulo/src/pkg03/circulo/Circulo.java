/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.circulo;

/**
 *
 * @author aitan
 * . 03-Circulo → Programa que calcula la longitud de su circunferencia (Circunferencia =
2*π*R) 
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double pi = 3.14159;
        
        double r = 8;
        
        double circunferencia = 2 * pi * r;
        System.out.println("La longitud de circunferencia es: " + circunferencia);
    }
    
}
