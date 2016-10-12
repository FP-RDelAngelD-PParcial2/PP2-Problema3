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
    encontrarFactorial();
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static void encontrarFactorial(){//s
        int a = solicitarDatos("numero para calcular el factorial");
        //Se pone 1 ya que no hay factorial 0 porque la multiplicacion final saldria 0
        //El retroceso de numeros tiene que llegar hasta el 1
        int f= 1;
        for(int i=1; i<=a; i++){
            f=f*i;
        }
        System.out.print("El factorial de " + a + " es " + f);
    }
    
}
