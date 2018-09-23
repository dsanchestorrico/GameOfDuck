/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofducks;


import gameofducks.comportamiento.*;

/**
 *
 * @author Daniel Sanchez
 */
public class GameOfDucks {

    public static void main(String[] args) {
        ObjectGame pato = new Duck("Denis",new FlyBehavior(), new QuakBehavior(), new SwimBehavior(), new DisplayBehavior());
        pato.display();
        
        ObjectGame perro = new Dog("Bobby");
        perro.display();
    }
    
}
