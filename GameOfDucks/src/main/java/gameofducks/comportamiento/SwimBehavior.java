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
public class SwimBehavior implements Behavior{
    public void doSwim(){
        System.out.println("swimming");
    }

    @Override
    public void doBehavior() {
        this.doSwim();
    }
}
