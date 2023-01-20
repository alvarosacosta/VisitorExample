package Visitor;

import Warframes.*;

public class Foundry implements Visitor{

    @Override
    public void ensamblar(Ivara x) {
        System.out.println("Ivara tiene un culazo ahora que es prime.");
    }
    
    @Override
    public void ensamblar(Excalibur x) {
        System.out.println("Excalibur prime no lo usa ni dios.");

    }
    
    @Override
    public void ensamblar(Ember x) {
        System.out.println("Ember prime hizo que me aburriera el juego.");
    }
    
}
