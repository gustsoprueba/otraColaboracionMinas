/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author HP STORE
 */
public class Calculadora {
    public void realizarOperacion(int op) {
        float a, b;
        Scanner ingreso = new Scanner(System.in);
        
        switch (op) {
            case (1):
                System.out.println("Ingrese un numero: ");
                a = ingreso.nextFloat();
                System.out.println("Ingrese otro numero: ");
                b = ingreso.nextFloat();
                System.out.println("Eligio + : Suma" + "\nResultado: " + a + 
                " + " + b + " = " + (a + b) + "\n--->FIN DEL PROGRAMA<---");
                break;
            case (2):
                System.out.println("Ingrese un numero: ");
                a = ingreso.nextFloat();
                System.out.println("Ingrese otro numero: ");
                b = ingreso.nextFloat();
                System.out.println("Eligio - : Resta" + "\nResultado: " + a + " - " + b + " = " + (a - b) + "\n--->FIN DEL PROGRAMA<---");
                break;
            case (3):
                System.out.println("Ingrese un numero: ");
                a = ingreso.nextFloat();
                System.out.println("Ingrese otro numero: ");
                b = ingreso.nextFloat();
                System.out.println("Eligio * : Multiplicacion" + "\nResultado: " + a + " * " + b + " = " + (a * b) + "\n--->FIN DEL PROGRAMA<---");
                break;
            case (4):
                System.out.println("Ingrese un numero: ");
                a = ingreso.nextFloat();
                System.out.println("Ingrese otro numero: ");
                b = ingreso.nextFloat();
                if (b == 0) {
                    System.out.println("ERROR!: No se puede realizar division por cero\n" + "\n--->FIN DEL PROGRAMA<---");
                } else {
                    System.out.println("Eligio / : Division" + "\nResultado: " + a + " / " + b + " = " + (a / b) + "\n--->FIN DEL PROGRAMA<---");
                }
                break;
            case (5):
                System.out.println("Ingrese un numero: ");
                a = ingreso.nextFloat();
                System.out.println("Ingrese otro numero: ");
                b = ingreso.nextFloat();
                calcularPotencia(a, b);
                break;
            case (6):
                System.out.println("--->FIN DEL PROGRAMA<---");
                break;
            default:
                System.out.println("La opcion ingresada no es correcta" + "\n--->FIN DEL PROGRAMA<---");
                break;
        }
    }

    public void calcularPotencia(float a, float b) {

        float contador = 1;
               
        if (b == 0) {
            System.out.println("Resultado de " + a + "^" + b + " = 1");
        } else {
            for (int i = 1; i <= b; i++) {
                contador = contador * a;
            }
            System.out.println("Resultado de " + a + "^" + b + " = " + contador + "\n");
            System.out.println("Resultado de " + a + "^" + b + " = " + Math.pow(a, b) + "\n--->FIN DEL PROGRAMA<---");
        }
    }
    
}
