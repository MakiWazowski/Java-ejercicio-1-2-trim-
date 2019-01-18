/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;
import java.util.Arrays;
/**
 *
 * @author UsuarioPC
 */
public class EjemplosConsola {
    //declaro un array de ints de instancia 
int[] listaNumeros = {20 ,31,27,2,5,99};
int[] listaNumeros2 = {-11,5,-34,7,209,33,77,7};
int[] listaNumeros3 = {0,2000,-4,1581,5,999,777,9};
int[] listaNumeros4 = {-5,-5,-200,-10,-60,-400};
//el metodo maximos va a calcular el maximo y 
//el segundo maximo de una lista de numeros 
private	int[] maximos (int[] lista){
    //declaramos un array de dos elementos 
    //para guardar el maximo y el segundo maximo 
    int [] listaMaximos = {lista[0],lista[1]};
    
    
    for (int i=0;i< lista.length; i++){
       
        if (listaMaximos[0] < lista[i]){
            //si llega aqui , es que el numero que estoy
            //comparando es mayor o igual que el que tengo 
            //primero en la lista de maximos 
            if (i!=0){ //desplazo solo a la derecha si no estoy justo en la 
                //primera posicion
                listaMaximos[1] = listaMaximos[0];//desplazo el de la derecha el que habia como max 
            }
            listaMaximos[0] = lista[i];//pongo en la primera posicion el nuevo maximo 
        }    
        else if (listaMaximos[1] < lista[i]){
            //compruebo si el numero que estoy leyendo es mayor que 
            //el SEGUNDO de la lista de maximos
            listaMaximos[1] = listaMaximos[0];//pongo en la segunda posicion el nuevo segundo maximo
        }
    }
    return listaMaximos;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios =new EjemplosConsola();    
        
        System.out.println ("HOLA MUNDO!");
        
        System.out.println(ejercicios.listaNumeros[2]);
        
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
        
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
        
        System.out.println( Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros4)));
        
    }
    
}
