/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int [] valores1 = {10, 100, 1000, 20, 200, 2000};
        int [] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};
        for (int i = 0; i < valores1.length; i++){
            //
            int v1 = valores1[i];
            int v2 = valores2[i];
          
            obtenerSuma(v1, v2);
        
        }
       /*
        En el codigo tenemos dos arreglos valores1 y valores2 y queriamos realizar
        una suma de cada posicion, entonces para enviar estos argumentos entramos
        a un ciclo for y dentro de eso creamos nuevas variables para poder enviar
        el arreglo que teniamos v1 y v2, luego invocamos a obtenerSuma y enviamos
        esos argumentos para que realizen la suma
*/
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
