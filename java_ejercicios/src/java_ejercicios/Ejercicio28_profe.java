/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios;

/**
 *
 * @author Cecilia Bruna
 */
public class Ejercicio28_profe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//defino matriz 10x10 con los valores del pdf
      int[][] matriz = {{01, 26, 36, 47, 05, 06, 72, 81, 95, 10},
                       {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, 
                       {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, 
                       {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, 
                       {32, 76, 79,  1, 36, 5, 67, 96, 12, 11}, 
                       {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, 
                       {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, 
                       {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, 
                       {24, 67, 97, 46, 87, 12, 67, 89, 93, 24}, 
                       {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
    int[][] patron = {{36, 5, 67}, 
                     {89, 90, 75}, 
                     {14, 22, 26}};// defino matriz 3x3
    buscarPatron(matriz,patron);//llamo al procedimiento buscarPatron
    }
    public static void buscarPatron(int[][]matriz,int[][]patron){//creo metodo (void) recibe como parametros a la matiz y a patron
        boolean aux; //variable tipo logica
        for (int i = 0; i < matriz.length-2; i++) { //matriz.lenght llega a 9, necesito que recorra hasta 7 (resto2) porque la matriz patron es de 3x3
            //para que coincida y sirva solo llega a la fila 7 la primer coincidencia ya que matriz tiene 9 filas y el patron es de 3x3
            for (int j = 0; j < matriz.length-2; j++) {// buscamos en cada posicion de j que coincida el patron
                aux=true; // la inicializo
                for (int k = 0; k < patron.length; k++) { //busco en la primer coincidencia de patron en i que se encuentre toda la matriz, creo una nueva matriz k (tres filas y columnas)
                    for (int l = 0; l < patron.length; l++) {
                        if (matriz [i+k][j+l]  != patron [k][l]){
                            // en cada posicion de matriz 10x10 que coincida con inicio de patron recorre 3x3 para ver si coinciden
                        //toma como referencia la posicion de i y j y las suma para establecer en que posicion de la matriz de 10x10 estamos y lo iguala a patron
                    
                            aux=false; // si no se cumple lo anterior aux es falso
                            break;
                            
                        }
                            
                    }
                                
                }
                if (aux){// fuera del bucle donde aux es falso, si se encuentra el patron, si aux es true
                        System.out.println("se encontro el patron en la columna: "+j+" y la fila: "+i); 
                        return;// el break anterior rompe el for, aunque el metodo sea void, el return termina la ejecucion del metodo, no devuelve nada porque es void 
                        //abajo no se puede escribir 
                }
            
            }
        }
        System.out.println("no se encontraron coincidencias");//fuera del for
    }
}
    
