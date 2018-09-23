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
public class FlyBehavior implements Behavior{

    public void doFly(){
        System.out.println("Flying");
    }
    @Override
    public void doBehavior() {
        this.doFly();
    }
    
}
