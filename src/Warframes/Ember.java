package Warframes;

import Visitor.Visitor;

public class Ember implements Warframe{

    @Override
    public void getPrime(Visitor v) {
        v.ensamblar(this);
    }
    
    @Override
    public String getName() {
        return "Ember";
    }
    
}
