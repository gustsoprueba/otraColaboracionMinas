/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.test;

import calculadora.Calculadora;
import java.util.Scanner;

/**
 *
 * @author HP STORE
 */
public class CalculadoraTest {
    public static void main(String[] args) {
        
        calculadora.Calculadora cal = new Calculadora();
        int op = 0;
        
        do {
            Scanner entrada = new Scanner(System.in);
        System.out.println("___________Ingrese una opcion___________");
        System.out.println("1: SUMAR");
        System.out.println("2: RESTAR");
        System.out.println("3: MULTIPLICAR");
        System.out.println("4: DIVIDIR");
        System.out.println("5: POTENCIACION");
        System.out.println("6: SALIR DEL PROGRAMA\n");
        System.out.print("OPCION: ");
        //tengo que preguntar si es un entero entre 1 y 6, si no es entero tengo 
        //indicar que elija la opcion correcta
        //ArrayList<Integer> opcionesRegistradas = new ArrayList<>();        
        //for (int i = 1; i <= 6; i++) {
          //  opcionesRegistradas.add(i);
        //}        
        try
        {
            op = entrada.nextInt();
            cal.realizarOperacion(op);
        }
        catch (Exception e)
                {
                    op = 0;
                    System.out.println("Debe ingresar un número entero");
                }           
        }  
    while (op != 6);
    }        
}
