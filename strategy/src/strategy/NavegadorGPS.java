/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author Carlos Andres
 */
public class NavegadorGPS {
    private estrategia strategy;

    public NavegadorGPS(estrategia strategy) {
        this.strategy = strategy;
    }

    public void setRutaStrategy(estrategia strategy) {
        this.strategy = strategy;
    }

    public void calcularRuta(String puntoA, String puntoB) {
        System.out.println(strategy.ruta(puntoA, puntoB));
    }
}
