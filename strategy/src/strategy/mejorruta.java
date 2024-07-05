/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Carlos Andres
 */
public class mejorruta implements estrategia{

    @Override
    public String ruta(String puntoA, String puntoB) {
      
        return "mas rapida entre " + puntoA + " y " + puntoB+" es desviarse para evitar trafico ";
    }
    
}
