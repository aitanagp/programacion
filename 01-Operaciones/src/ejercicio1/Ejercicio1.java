/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author aitan
 * Programa que dado dos números, mayores que cero, a y b calcule:
 * el resto de dividir a entre b, elevado a b y la raiz cuadrante de a y de b
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        //inicializar con valores
        a=10;
        b=5;
        //calcular resto de a entre b
        double resto = a % b;
        
        System.out.println("Resto de " + a + "/" + b + ": " + resto);
        //calcular a elevado b
        double elevado = Math.pow(a,b);
        
        System.out.println(a + " elevado de " + b + ": " + elevado);
        //calcular raiz cuadrada de a y de b
        double raizA = Math.sqrt(a);
        double raizB = Math.sqrt(b);
        
        System.out.println("Raíz cuadrada de " + a + ": " + raizA);
        System.out.println("Raiz Cuadrada de " + b + ": " + raizB);
    }
    
}
