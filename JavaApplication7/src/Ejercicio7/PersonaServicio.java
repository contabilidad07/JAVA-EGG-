/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 *
 * @author Cecilia Bruna profe egg
 */
public class PersonaServicio {// personaServicio se relaciona con clase persona
            
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final int IMC_BAJO=-1;// (VALOR MENOR A 20), DECLARO UNA CONSTANTE CON LA PALABRA FINAL, NO CAMBIA NUNCA SU VALOR
    private final int IMC_IDEAL=0;//(VALOR ENTRE 0 Y 25) HAY QUE INICIALIZARLAS AL CREARLAS, VAN CON MAYUSCULAS
    private final int IMC_ALTO=1;//(VALOR MAYOR A 25, SOBREPESO)
    public Persona crearPersona() { //metodo crearPersona de la clase Persona(donde estan los atributos)
        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        System.out.println("ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("ingrese el sexo- Hombre ('H'), Mujer ('M'), otro('O')");
        char sexo = Character.toUpperCase(leer.next().charAt(0));  /// character me deja acceder a metodos y a clases (char no deja)
        // guardo en sexo lo que ingresa el usuario y lo pasa a mayusculas lo que lea en la posicion cero (charAt(0)
        System.out.println("ingrese el peso en kg");
        double peso = leer.nextDouble();
        System.out.println("ingresa altura");
        double altura = leer.nextDouble();
        while (sexo != 'M' && sexo != 'H' && sexo != 'O') {  // bucle para que ingrese sexo correcto
            System.out.println("ingreso un sexo valido");
            sexo = Character.toUpperCase(leer.next().charAt(0));//vuelve a leer sexo ingresado

        }
        while (peso < 0) {
            System.out.println("ingrese un peso superior a cero");
            peso = leer.nextDouble();
        }
        //hay que crear la persona, se puede hacer con el set o de varias formas
        return new Persona (nombre,edad,sexo,peso,altura); //que retorne una nueva persona,llamando a su constructor (cadena para retornar parametros
        //en lugar de setear los atributos, lo guarde en variables nombre, edad, sexo,peso,altura y lo pase por constructor, hay que hacer objeto
        //new crea un nuevo objeto de la clase persona y envia los parametros al constructor
             }
    //CREO METODO TIPO ENTERO CALCULAR IMC, le pasamos los datos de una persona p y accedemos a sus atributos, peso, altura
    public int calcularIMC(Persona p){
    double altura=p.getAltura();//variable altura es igual al atributo altura del get
    double peso=p.getPeso(); //guardo en la variable peso el atributo pesto get
    double imc=peso/ (Math.pow(altura, 2));  // math (funcion matematica pow(potencia)devuelve el valor del primer argumento elevado a la potencia del segundo
    //imc = peso dividido (altura al cuadrado)
    if (imc<20){
        return IMC_BAJO; // menor a 20 = imc bajo, retorna-1
    }else if (imc>25) { 
            return IMC_ALTO;// mayor a 25 imc alto, retorna 1
        }else{
        return IMC_IDEAL;//  mayor a 20 y menor a 25, retorna 0
    }
        
    }
            //metodo es mayor de edad, indica si la persona que llega por parametro es mayor de edad
    public boolean esMayorDeEdad(Persona p){
        boolean mayor= p.getEdad()>=18;//variable mayor tipo boolean(v o f) almacena si edad es mayor o= a 18
        return mayor;// si es verdadero retorna la variable mayor, en vez de else
        
    }
    // hago un crearpersonas que nos retorne un vector del tipo persona para reemplazar los 4 objetos en el main
    //un arreglo que guarda datos del tipo persona  (tipo de dato, persona, vector)
    public Persona [] crearPersonas(int cant){  //vector del tipo persona para hacer el metodo crearPersonas 
    //(cant) preguntamos cuantas personas quiere {crear)
          Persona [] personas=new Persona [cant]; //creo un arreglo vector llamado personas
          for (int i = 0; i < personas.length; i++) {//personas.length (largo del vector llamado personas)
            personas[i]=crearPersona();// personas[i] en cada posicion del vector. se llama al metodo crearpersona en cada vuelta del bucle
                    //pide todos los datos en cada vuelta, llama al metodo crearpersona, carga nombre, edad,sexo, etc
    }// una vez lleno el arreglo personas, devuelve un vector del tipo personas 
        return personas;
    
}
    public void porcentajesPeso(Persona[] personas){  //calculo el porcentajePeso de todas las personas, paso el arreglo (Persona[])como dato
        int contadorAlto = 0; // hay que contar para cada masa corporal, alto, bajo, normal e inicializarlos en cero
        int contadorBajo = 0;
        int contadorIdeal = 0;
        // recorremos el arreglo para ver cada uno de los objetos guardados en nuestra lista de nuestro vector y evaluar cada uno de ellos
        //creo la variable cantidadPersonas
        int cantidadPersonas = personas.length;// a variabe cantidadPersonas es igua al largo de Persona
        // for each (para cada) fore+tabulador
        for (Persona persona : personas) //{recorrer con auxiliar persona,(objeto) tipo persona que recorre posicion x posicion un arreglo o una lista 
        // que esta despues de los dos puntos (personas) q ue le paso x parametro
        // bucle dice para cada persona hacer lo que se diga dentro del bucle
        {
            switch (calcularIMC(persona)) {//invoco metodo calcularIMC, se calcula sobre cada persona que recorre el bucle for
                case -1:          // la funcion calcularIMC retorna -1,1,0
                    System.out.println("esta persona esta por debajo de su peso ideal" + persona.getNombre());//muestra el nombre de la persona y el resultado de calcularIMC
                    contadorBajo++;  // es igual a poner (contadorBajo=ContadorBajo +1) acumula a medida que este en case-1
                    break;
                case 0:          // peso ideal en cero
                    System.out.println("esta persona esta en su peso ideal" + persona.getNombre());//muestra el nombre de la persona y el resultado de calcularIMC
                    contadorIdeal++;  //  acumula a medida que este en case 0
                    break;
                case 1:          // peso x encima 1
                    System.out.println("esta persona esta por encima de su peso ideal" + persona.getNombre());//muestra el nombre de la persona y el resultado de calcularIMC
                    contadorAlto++;  //  acumula a medida que este en case 1
                    break;

            }
        }
        System.out.println("Hay"+(contadorBajo*100/4)+ " % de personas estan debajo de su peso ideal");
         System.out.println("Hay"+(contadorIdeal*100/4)+ " % de personas estan en su peso ideal");
          System.out.println("Hay"+(contadorAlto*100/4)+ " % de personas estan encima de su peso ideal");
    }
    public void porcentajeEdad(Persona[] personas) {// este metodo porcentajeEdad, recibe un vector [] de personas
        int cantidadPersonas = personas.length; // variabe cantidadPersonas es igua al largo de Persona
        int contadorMayor = 0;//inicializo contadorMayor
        for (Persona persona : personas) {//fore+tab recorre todas las personas del vector personas y la guarda en persona
            if (esMayorDeEdad(persona)) {     // si la persona es mayorDeEdad la suma al contador   
                contadorMayor++;// cuenta los mayores
                System.out.println("es mayor de edad" + persona.getNombre());
            }
        }
        System.out.println("hay " + ((contadorMayor*100)/cantidadPersonas)+ "% mayores de edad");
         System.out.println("hay " + (((cantidadPersonas-contadorMayor)*100)/cantidadPersonas)+ "% menores de edad");

    }
    
    //hago un metodo para cargar los datos de las 4 personas al probarlo al programa y no cargarlo por teclado, , despues lo saco
    public Persona []crearPersonasTest(){ // creo un metodo crearPersonasTest, nos devuelve una lista del vector
    
    Persona[]personas=new Persona[4];//vector personas de la clase Persona tamaño 4, lo cargo manualmente en vez de hacer el bucle for
    personas[0]=new Persona("Pepe",15,'H',75,1.85); // cargo datos manualmente de la persona 0
    personas[1]=new Persona("Pedro",29,'M',48,1.62);
    personas[2]=new Persona("Juan",58,'O',99,1.82);
    personas[3]=new Persona("Marta",40,'M',60,1.68);
    return personas;// salteo el metodo crearPersonas para no cargar todo x teclado
    }
    
}
        
    
