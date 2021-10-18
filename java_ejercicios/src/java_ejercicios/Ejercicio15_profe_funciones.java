/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package java_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio15_profe_funciones {

   
    public static void main(String[] args) { // metodo main es el primero que lee el programa es el algoritmo principal
      int num1;
      int num2;
      int seleccion; //variable
      char valsalida;//variable
        System.out.println("ingrese dos numeros enteros positivos");
        num1= pedirEntero(); //asigno  num1 a la  funcion
        num2=pedirEntero();
        while (num1<1||num2<1) {            
            System.out.println("debe ingresar numero positivos mayor a cero");
             num1= pedirEntero(); //pide nuevamente los numeros
            num2=pedirEntero();
        }
        do {
            mostrarMenu(); //llama al procedimiento void mostrarMenu
        seleccion=validarSeleccion(); // una vez que muestra el menu y selecciona la opcion, valida si es correcta la opcion elegida
                                         //igualo mi variable seleccion con la funcion validarSeleccion
        valsalida=ejecutarSeleccion (seleccion,num1,num2);// varsalida es una varible y la igualo al retorno de la fc ejecutarSeleccion 
        //funcion toma como parametros los numeros elegidos y la seleccion del menu
            
        } while (valsalida!='S');//fc varsalida (arroja una "s/n") mientras sea distinta a (s)repite el bucle
        
        
    }
    
    public static int pedirEntero(){    //funcion pedirEntero pide ingresar numeros al sistema
        //(INT)devuelve valores enteros  
        Scanner leer=new Scanner(System.in);
        return leer.nextInt(); // retorna lo que se ingresa x teclado, lee
    }
     public static char pedirChar(){    //funcion pedirchar (caracter) pide ingresar caracter (s/n) en opcion 5
        Scanner leer=new Scanner(System.in);
        return leer.next().charAt(0); // retorna el caracter que va entre parentesis( si pongo cero) devuelve el primer caracter    
     }
    
    public static void mostrarMenu(){ //procedimiento void no devuelve valor --muestra menu de opciones
                                        // no tiene el return porque no espera devolucion
                                        //metodo para mostrar el menu
         System.out.println("----------MENU----------\n"   // \n imprime todo lo que sigue en otra linea
                 + "1. sumar\n"                             // no hace falta system,out para imprimir
                 + "2.restar\n"
                 + "3.multiplicar\n"
                 + "4.dividir\n"
                 + "5.salir");
    }
    public static int validarSeleccion(){ //metodo que llame a pedirEntero y verifique si ingreso entre 1 y 5, cada vez que cargo un numero lo valida
        int seleccion = pedirEntero(); //igualo validar seleccion  = a pedirEntero
          while (seleccion<1 || seleccion>5) {            
            System.out.println(" la seleccion es invalida");
            System.out.println(" elija otra opcion:");
            seleccion= pedirEntero(); //pide nuevamente los numeros
         }
          return seleccion;
    }
     public static char ejecutarSeleccion(int seleccion,int a, int b){ //metodo con char para que devuelva "s/n" en opcion 5
        char valsalida='\u0000';//inicializa en java una varible caracter en forma nula
        
         switch (seleccion) {
             case 1:
                 System.out.println("el resultado de la suma es:"+ (a+b));// la suma va entre parentisis para que no concatene 
                 //sino 2+3 (muestra 23) y no =5
                 break;// para que no siga analizando las otras opciones
            case 2:
                 System.out.println("el resultado de la resta es:"+ (a-b));// la resta va entre parentisis para que no concatene 
                 //sino 3-+2 (muestra 32) y no =1
                 break;// para que no siga analizando las otras opciones
            case 3:
                 System.out.println("el resultado de la multiplicación es:"+ (a*b)); 
                 break;
            case 4:
                double resultado=(double)a/b; //declaro variable resultado como real, para que me de con decimales 
                 System.out.println("el resultado de la división es:"+ resultado);
                 break;
            case 5:
                 System.out.println("¿esta seguro que desea salir del programa (s/n?");
                 valsalida=Character.toUpperCase(pedirChar()); //variable de salida llama a la funcion pedirChar(pasada a mayuscula)
                 //pongo Character to upper case para que pase a mayusculas todo
                 while (valsalida!='N'&& valsalida!='S') { //si el valor ingresado no es s,n,vuelve a pedir ingresar datos
                     System.out.println("ingrese una opcion valida");
                     valsalida=pedirChar();
                     
                 }
                    break;
                }
             return valsalida;
                  
     }
}


