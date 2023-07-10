/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.estructura.recursividad;

import java.io.File;

/**
 *
 * @author ACER
 */
public class EstructuraRecursividad {

    public static void main(String[] args) {
       /* System.out.println("Hello World!");
        int numero = 12 ;
        int exponente = 3;
        int factorial = Factorial.factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
      
        System.out.println("-----------------------");
        int factorialRecursiva = Factorial.factorialRecusivo(numero);
        System.out.println("El factorial de " + numero + " es " + factorialRecursiva);
        System.out.println("-----------------------");
        
        
        System.out.println("-----------------------");
        int factorialRecursiva = Ejercicios.numerosConsecutivos(numero);
        System.out.println("La suma de " + numero + " es " + factorialRecursiva);
        System.out.println("-----------------------");
       
       System.out.println("-----------------------");
        int potenciaRecursiva = Ejercicios.potenciaNumeros(numero, exponente);
        System.out.println("La potencia de " + numero + " es " + potenciaRecursiva);
        System.out.println("-----------------------");
        
        System.out.println("-----------------------");
        int sumaDigitosRecursiva = Ejercicios.sumaDigitosNumeros(numero);
        System.out.println("La suma de " + numero + " es " + sumaDigitosRecursiva);
        System.out.println("-----------------------");*/
        
       String path = "C:\\Users\\ACER\\OneDrive\\Escritorio\\RD";
        File mainPath = new File(path);
        
        Directorio.renombrarCarpetas(mainPath);
    
    }
}
