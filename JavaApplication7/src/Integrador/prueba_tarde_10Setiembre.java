/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

/**crea una funcion que valide si el numero es impar
 * que valide si es negativo
 * y si el decimal esta proximo a su entero inferior o piso
 * debe analizar las tres juntas, para ser verdadero, si una no cumple es falsa
 *ejemplo prueba mumuki, copio el codigo despues de declarar la funcion hasta return linea(24 a 30)
 * ojo con el return (ver el nombre de la variable)
 * @author Cecilia Bruna
 */
public class prueba_tarde_10Setiembre {

    
    public static void main(String[] args) {
        
        System.out.println(AnalisisNumero(7, -3, 1.73)); // ingreso los valores para que analice la funcion
        System.out.println(JugandoCadenas("hola"));
    }
    //hago la funcion estatica porque estoy en el main, retorna un booleano verdadero o falso
    
    public static boolean AnalisisNumero(int num1, int num2, double num3) { //el metodo recibe tres numeros como parametros, no lo ingreso x teclado 
        boolean resultado = false; // creo la variable resultado, siempre la inicializo en false, por defecto pienso en lo negativo
     

        //valida si num 1 es impar, si num2 es negativo, num3 que sea proximo a su entero inferior 
        if (num1 % 2 != 0 && num2 < 0 && Math.round(num3) == Math.floor(num3)) {  // num 3 si el redondeo (round) es mas proximo a su entero inferior (floor)
            resultado = true; // si cumple las tres condiciones es verdadero
        }
        return resultado;
    }

    // pruebo un metodo con un String (cadenas) como parametros dela funcion  quiero que reemplace una palabra por el asterisco "A"
    // siempre declaro variable string y dejo declarado el retorno, al tener retorno la debo inicializar ""  
    public static String JugandoCadenas(String palabrita) {
        String resultado = "";  //inicializo
           String auxInvertida=""; // creo variabla para invertir cadena y la inicializo
        resultado = palabrita.toUpperCase();   // para pasar la palabrita  a mayusculas
        //REEMPLAZO LAS VOCALES POR ASTERISCOS
        resultado = resultado.replaceAll("A", "*").replaceAll("E", "*").replaceAll("I", "*").replaceAll("O", "*").replaceAll("U", "*");
     // replaceAll recibe dos argumentos (la letra que busco reemplaza; lo que la reemplaza)
     // o coloco replaceAll (5 veces ) una por cada palabra a remplazar o agrego.replaceAll en la misma linea CONCATENANDO

      
     
     
      // PARA INVERTIR LA CADENA 
      //OPCION A: uso el bucle for, lo recorro al reves comienzo por (.lenght-1)xque comienza desde la posicion 0 
      //ej: palabra hola, su longitud es cuatro, pero las posiciones que ocupa son 0,1,2,3, hasta mayor  a cero (no toma el ultimo)
        //for (int i = resultado.length()-1; i >=0; i--) {     // i va disminuyendo el que es normal es: for(i=0;i<20;i++) 
          //  auxInvertida=auxInvertida+resultado.charAt(i);    // charA devuelve el caracter en el indice  especificado de la cadena
          //hola (lee la a, lee l queda el acumulado adelante (al) luego la o (alo) la h /(aloh)
       // }
            // OPCION B: bucle for normal pero concateno al reves
            for (int i = 0; i <resultado.length(); i++) {
                auxInvertida=resultado.charAt(i)+auxInvertida; //voy pegando los caracteres nuevos primeros y quedan al ultimo los anteriores
                //empiezaxla h, luego la o queda (oh), luego la l (loh) luego la a (aloh), a medida que avanza los voy poniendo adelante
            
        }
               
        return auxInvertida;
    }
    
}
