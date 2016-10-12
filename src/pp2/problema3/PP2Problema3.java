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
        int f = 1; //Se pone 1 ya que no hay factorial 0 porque la multiplicacion final saldria 0
                   //El retroceso de numeros tiene que llegar hasta el 1
        while(a !=0){
            f*=a;
            a--;
        }
        System.out.print("El factorial es " + f);
    }
    
}
