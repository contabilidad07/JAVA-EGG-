/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
* Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * * @author Cortinez Juan JosÃ©
 * @author Cecilia Bruna
 */
public class MatematicasServicio {
    public double devolverMayor(Matematicas mate){
        if(mate.getNumero1() > mate.getNumero2()){
            return mate.getNumero1();
        }else{
            return mate.getNumero2();
        }
    }
    
    public double calcularPotencia(Matematicas mate){
        double max = Math.max(mate.getNumero1(), mate.getNumero2());
        double min = Math.min(mate.getNumero1(), mate.getNumero2());
        return Math.pow(Math.round(max), Math.round(min));
    }
    
    public double calcularRaiz(Matematicas mate){
        double min = Math.min(mate.getNumero1(), mate.getNumero2());
        return Math.sqrt(Math.abs(min));
    }

}
