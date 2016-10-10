/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema3;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static int encontrarFactorial(){//s
        int a = solicitarDatos("numero para calcular el factorial");
        for(int i=0; i<=a; i++){
            System.out.print()
        }
            
       
    }
    
}
