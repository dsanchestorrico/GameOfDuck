/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofducks.comportamiento;

/**
 *
 * @author Daniel Sanchez
 */
public class DisplayBehavior  implements Behavior{
    public void display(){
        System.out.println("DIBUJAR");
    }

    @Override
    public void doBehavior() {
        this.display();
    }
}
