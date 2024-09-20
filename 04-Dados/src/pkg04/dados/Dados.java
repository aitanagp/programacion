/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.dados;

import java.util.Random;

/**
 *
 * @author aitan
 * 04-Dados → Escriba un programa que cada vez que se ejecute muestre la tirada de dos
dados y nos diga su resultado.

 */
public class Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //crear un número aleatorio
        Random random = new Random();
        
        int dado = random.nextInt(6) + 1;
            
        System.out.println("Tirada del dado: " + dado);
        
    }
    
}
