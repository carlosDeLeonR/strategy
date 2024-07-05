/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Carlos Andres
 */
public class menorrecorrido implements estrategia{

    @Override
    public String ruta(String puntoA, String puntoB) {
        return "la ruta con menos distancia entre " + puntoA + " y " + puntoB + " es ir por la via principal";
    }
    
}
