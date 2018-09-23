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
public class Duck implements ObjectGame {
    
    private String nombre;
    
    private FlyBehavior fly;
    private QuakBehavior noise;
    private SwimBehavior swim;
    private DisplayBehavior display;
    
    public Duck(String nombre, FlyBehavior fly, QuakBehavior quak, SwimBehavior swim, DisplayBehavior display){
        this.nombre = nombre;
        this.fly = fly;
        this.noise = quak;
        this.swim = swim;
        this.display = display;
    }

    @Override
    public void display() {
        System.out.println("Soy un Pato llamado: "+nombre);
        this.fly.doFly();
        this.noise.doNoise();
        this.swim.doSwim();
    }
}
