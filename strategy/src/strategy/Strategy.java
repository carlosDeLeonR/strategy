/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

/**
 *
 * @author Carlos Andres
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               NavegadorGPS gps = new NavegadorGPS(new mejorruta());
        gps.calcularRuta("peten", "huehuetenango");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new menorrecorrido());
        gps.calcularRuta("peten", "huehuetenango");


    }
    
}
