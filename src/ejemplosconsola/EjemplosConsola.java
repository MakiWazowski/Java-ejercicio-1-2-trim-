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
    
    //empiezo a comparar desde la posicion 1 , no desde la 0 
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
    private boolean palindromo (String cadena){
        //primera fase: creo un nuevo string que sea una copia 
        //del que me pasan pero quitandole los espacios en blanco 
        String auxiliar = "";
         for (int i=0;i< cadena.length(); i++){
             if(cadena.charAt(i) != ' '){
                 auxiliar = auxiliar + cadena.charAt(i);
             
         }
         }
         //Ahora en auxiliar tengo el string pero sin espacios en blanco 
         int indiceIzq = 0;
         int indiceDrch = auxiliar.length()-1;
         
         //mientras sean iguales los caracteres en esas posiciones la palabra 
         //sera un palindromo en el momento en el que una de las comparaciones falle 
         //significa que no es un palindromo 
         
         //ademas, si el indice izq es mayor , ya he chequeado toda la frase 
         while (auxiliar.charAt(indiceIzq)== auxiliar.charAt(indiceDrch) && indiceIzq <= indiceDrch){
             indiceIzq++;
             indiceDrch--;
             
         }
         boolean esPalindromo = true;
         if (indiceIzq < indiceDrch){
         //si esto se cumple , es que la palabra no es un palindromo
            esPalindromo = false;
            //System.out.println("NO ES UN PALINDROMO, PRINGAO ");
         }
         
        return esPalindromo;// hay que cambiar esto luego para que funcione 
    }
    
    private boolean isograma (String palabra){
      //bucle para ver cual de las letras estoy mirando 
        //length-1 para que cuando llegue a la ultima no compare con un espacio 
         for (int i=0;i< palabra.length()-1; i++){
             //ir comprobando si son iguales las letras una a una
             //i+1 para que no se compare consigo misma y te de false 
             for (int j=i+1;j< palabra.length(); j++){
                 //comparamos la primera letra con la siguiente 
                 if(palabra.charAt(j)==palabra.charAt(i)){
                     return false;
                 }
             
            }
        
        }
      return true;
   }
    
    private void imprimeMes(int num ) {
        //filtra el numero para que siempre valga meos de 7 
        num = num % 7;
        
      int contador = 0;

  //tantas x como num haya 
        for(int j=0;j<num ; j++){
            System.out.print("XX"+" ");
            contador = contador + 1 ;
        }
        for(int i=1;i<=31; i++){
            if(contador<=7){
                if(i<=9){
            System.out.print("0"+ i +" ");
        }
                if(i>9){
                    System.out.print(" "+ i);
                }
                contador = contador + 1 ;
            }
            if(contador == 7){
                System.out.println("");
                contador = 0;
            }
        
        }
  
    for(int x=contador;x<7; x++){
            System.out.print(" XX");
          }
    }

    private boolean esAnagrama (String palabraA , String palabraB ){
        //quitamos los espacios de las dos palabras 
     /*   String auxiliarA = "";
         for (int i=0;i< palabraA.length(); i++){
             if(palabraA.charAt(i) != ' '){
                 auxiliarA = auxiliarA + palabraA.charAt(i);
             
         }
         }
          String auxiliarB = "";
         for (int i=0;i< palabraB.length(); i++){
             if(palabraB.charAt(i) != ' '){
                 auxiliarB = auxiliarB + palabraB.charAt(i);
             
         }
         }
         */
        //pasamos a mayusculas todas las letras 
        palabraA = palabraA.toUpperCase();
        palabraB = palabraB.toUpperCase();
        palabraA = quitaEspacios(palabraA);
        palabraB = quitaEspacios(palabraB);
        
        //indica si las palabras son anagramas o no 
        boolean anagrama = false;
      
       //solo empiezo a chequear si las dos palabras tienen la misma longitud 
       if (palabraA.length() == palabraB.length()){
       for (int i=0;i< palabraA.length(); i++){
           int posicion=0;
           //compara la primera letra con las de la otra palabra
        while ( posicion < palabraB.length() && palabraA.charAt(i)!= palabraB.charAt(posicion)){
               posicion ++;
           }
           if (posicion==palabraB.length()){
               //la letra no estaba 
               return false;
           }
           else{
               //la letra esta en b , asi que la elimino para no volverla 
               //a leer en la siguiente vuelta 
           palabraB=palabraB.substring(0,posicion) + palabraB.substring(posicion+1);
       }
       }
       //cuando no quedan letras en B que comparar por que coinciden 
        if(palabraB.length() == 0 ){
            return true;
        }
    }
       return anagrama;
    }
    private String quitaEspacios (String frase){
        String auxiliar = "";
         for (int i=0;i< frase.length(); i++){
             if(frase.charAt(i) != ' '){
                 auxiliar = auxiliar + frase.charAt(i);
    }
         }
         return auxiliar;
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
        
        System.out.println(ejercicios.palindromo("ACASO HUBO BUHOS ACA"));
        
        System.out.println(ejercicios.palindromo("HOLA CARACULO"));
        
        System.out.println(ejercicios.palindromo("TACOCAT"));
        
        System.out.println(ejercicios.isograma("murcielago"));
        
        System.out.println(ejercicios.isograma("noob"));
        
        System.out.println(ejercicios.isograma("estupido"));
        
       System.out.println(ejercicios.isograma("hola"));
        
       System.out.println(ejercicios.isograma("abecedario"));
        
      //  ejercicios.imprimeMes(3);
        
        System.out.println("roma amor " + ejercicios.esAnagrama("roma","amor"));
        
        System.out.println("i am lord voldemort " + ejercicios.esAnagrama("i am lord voldemort","tom marvolo riddle"));
         
        System.out.println("jamon monja " + ejercicios.esAnagrama("jamon","monja"));
        
        System.out.println("cabron bronca " + ejercicios.esAnagrama("cabron","bronca"));
        
        System.out.println("elija anomalia  " + ejercicios.esAnagrama("elija","anomalia"));
        
    }
    
}
