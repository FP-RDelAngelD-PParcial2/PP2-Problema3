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
    public static void encontrarFactorial(){
        int a = solicitarDatos("numero para calcular el factorial ");
        int f = 1;
        //Se pone 1 ya que no hay factorial 0 porque la multiplicacion final saldria 0
        for(int i=1; i<=a; i++){ //En "i": el retroceso de numeros tiene que llegar hasta el 1
                                 //"i" es menor o igual a "a"(numero del que se quiere sacar factorial)
                                 //Osea que mientras "i" cumpla con la condicion no saldra del ciclo
        f=f*i;                   //Por ejemplo, si "a" es 3; 1 es menor que 3 entonces f=1, f=1*1 y seria 1
                                 //Entonces "i" aumenta 1 y se vuelve 2
                                 //2 es menor que 3 entonces f=1*2 y seria 2
                                 //Entonces i aumenta 1 y se vuelve 3
                                 //3 es menor o igual a 3 entonces f=2*3 y seria 6
                                 //Entonces i aumenta 1 y se vuelve 4
                                 //4 no es menor o igual a 3 entonces sale del ciclo
            
        }
        System.out.print("El factorial de " + a + " es " + f); //Imprime en pantalla utilizando el dato introducido y el factorial
    }
    
}
