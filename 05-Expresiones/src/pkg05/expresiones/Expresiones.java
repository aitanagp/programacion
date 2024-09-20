/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.expresiones;

/**
 *
 * @author aitan
 * 05-Expresiones → Escribe la siguiente expresión aritmética:
(a+b)
2
.(a−b)

 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        a = 9;
        b = 6;
        double expr = Math.pow((a+b),2) * (a-b);
        System.out.println("Resultado: " + expr);
    }
    
}
