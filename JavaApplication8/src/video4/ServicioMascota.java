/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**aprendemos a actualizar objetos
 *
 * @author Cecilia Bruna
 */
public class ServicioMascota {
    
 private Scanner leer = new Scanner (System.in);
    private List<Mascota> mascota;// importo list creo objeto mascota tipo de dato mascota creo lista
    
    public ServicioMascota(){ // constructor vacio inicializa lista
        this. mascota=new ArrayList(); 
    }
    
    public  Mascota crearMascota(){ // metodo crearMascota 
        System.out.println("introducir nombre");// ingreso atributos por teclado del objeto
        String nombre = leer.next(); // lee nombre ingresado x teclado
        
        System.out.println("introducir apodo");
        String apodo = leer.next();
        
         System.out.println("introducir tipo");
        String tipo = leer.next();
      
     return new Mascota(nombre, apodo,tipo);// crea objeto y envia datos al constructor lleno
    }
    
     public void agregarMascota (Mascota m){   // recibe una mascota y la añade a la lista
       mascota.add(m);
     }
    
     
    public void mostraMascota (){   
        System.out.println("las mascotas actuales de la lista Mascota son: ");
        for (Mascota aux : mascota) { //for+control+espacio para for each va a recorrer sobre la lista de mascotas, la variable aux es de tipo Mascota
            System.out.println(aux.toString());// imprime la variable aux, el objeto con metodo toString
            
        }
        System.out.println("cantidad= "+mascota.size());// cantidad
    }
    //
    //crea mascotas todos chiquitos
    public void fabricachiquitos(int cantidad){   //recibe el parametro cantidad, que  equivale a la cantidad de mascotas a crear y añadir a la lista
        
        for (int i = 0; i < cantidad; i++) {// bucle de cero a cantidad
            //creamos y añadirlas las mascotas todas en las mismas listas para automatizarlas, es una forma rápida de crear muchos objetos
            mascota.add(new Mascota("fer","chiquito","Beagle") ); // a la lista mascota.add(le añado como argumento newMascota-mejor
           
           //es lo mismo poner de forma mas facil (es mejor el anterior)
           //la variable aux cada vez que da una vuelta el bucle crea un objeto o variables aux
          // Mascota aux= new Mascota ("fer","chiquito","Beagle"); //creo variable aux, le asigno una mascota nueva que estoy creando 
          // mascota.add(aux);//paso como argumento variable aux de clase mascota
            
        }
    }
    
    //crea mascotas pidiendo datos por teclado, automatizado// si quiero crear 100 mascotas cantidad debe ser = a 100
    public void fabricaMasc(int cantidad){// recibe la cantidad de mascotas a crear, cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
        for (int i = 0; i < cantidad; i++) {//llamo al metodo crearMascota para crearla
            
         
          Mascota mascotaCreada=crearMascota();// creo un objeto mascotaCreada para imprimirla lo igualo al metodo crearMascota que acabo de invocar
          agregarMascota(mascotaCreada); //invoco metodo agregarMascota yle paso la mascotaCreada 
            System.out.println(mascotaCreada.toString());// imprimo mascotaCreada es igual a crearMascota
        }
    }
    //aprendemos a actualizar objetos 
    //añadir Try and Catch (index es indice) modificando por referencia el objeto
    //en objetos pasados por referencia, modifica la coleccion 
                // public void actualizarMascota(int index){  //el metodo actualizarMascota, recibe como parametro el indice index  que mascota quiero modificar de la coleccion
               //      Mascota m=mascota.get(index);// llamo la lista index que contiene a las mascota,la busco por el get (index) indice, busca la mascota, la agarra, 
                     //la mete en la variable auxiliar m y la extrae
                  //   m.setApodo("Roberto");//seteo el apodo y se lo cambio a Roberto
               //  }
                  
                 
    //creando un nuevo objeto y pisando en base al indice, cambia una mascota por otra segun el index
                 public void actualizarMascota(int index){  //el metodo actualizarMascota, recibe como parametro el indice index  que mascota quiero modificar de la coleccion
                    
                     if (index<=(mascota.size()-1)){ // si el indice es mayor o igual al tamaño size de la coleccion menos 1 , lo actualizo
                                              
                             System.out.println("");
                     System.out.println("-----Actualizar-----");
                     Mascota m=crearMascota();// llamo la funcion crearMascota, crea una nueva mascota en la variable m y uso metodo set de mascota 
                     //la mete en la variable auxiliar m y la extrae
                     mascota.set(index, m);//coleccion mascota.set recibe indice index a modificar y creo m (mascota nueva)para modificar
                 }else   {  
                         System.out.println("indice erroneo");
                     }
                         
}
    
    //para eliminar hay dos formas  1 pasandole el objeto puntual, la referencia de memoria del objeto a eliminar  remove(objet o) 2. pasando el indice remove (int index)
    //3 en base a una collection (elimina una lista o conjunto de mascotas) removeAll(collection<?>c)4 removeIf (condicional para ver como queremos eliminar con un un filtro
     //haremos remove en base al indice remove (index)
    public void eliminarMascota(int index){//recibe un indice del main
        if (index<=(mascota.size()-1)){ // si el indice es menor o igual al tamaño size de la coleccion menos 1 ,lo elimina, sino no
           mascota.remove(index);
    }else{  
              System.out.println("fallo al eliminar, el indice erroneo");
        }
}
}
//aprendemos a actualizar objetos