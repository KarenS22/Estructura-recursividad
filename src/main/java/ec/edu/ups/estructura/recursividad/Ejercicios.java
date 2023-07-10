/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.recursividad;

import java.util.List;

/**
 *
 * @author ACER
 */
public class Ejercicios {

    public static int numerosConsecutivos(int n) {
        System.out.println("Calculando suma(" + n + ")");
        if (n == 0) {
            System.out.println("Alcanzando caso base: suma(0) =1 ");
            return 0;
        } else {
            int factorialNMinus1 = numerosConsecutivos(n - 1);
            int factorialN = n + factorialNMinus1;

            System.out.println("Suma parcial de" + n + ": suma(" + (n - 1) + ")");
            return factorialN;
        }
    }

    public static int potenciaNumeros(int base, int exponente) {
        System.out.println("Calculando potencia(" + base + ", " + exponente + ")");
        if (exponente == 0) {
            System.out.println("Alcanzando caso base: potencia(" + base + ", 0) = 1");
            return 1;
        } else {
            int potenciaNMinus1 = potenciaNumeros(base, exponente - 1);
            int potenciaN = base * potenciaNMinus1;

            System.out.println("Producto parcial de " + base + "^" + exponente + ": " + base + " * potencia(" + base + ", " + (exponente - 1) + ")");
            return potenciaN;
        }
    }
    
    public static int sumaDigitosNumeros(int numero){
        if (numero == 0){
            return numero;
        }else {
            int residuo = sumaDigitosNumeros(numero/10);
            int respuesta = (numero%10) +residuo;
            //System.out.println(respuesta);
            return respuesta;
        }
    }

}
