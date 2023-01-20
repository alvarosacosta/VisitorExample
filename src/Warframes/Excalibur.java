package Warframes;

import Visitor.Visitor;

public class Excalibur implements Warframe {

    @Override
    public void getPrime(Visitor v) {
        v.ensamblar(this);
    }
    
    @Override
    public String getName() {
        return "Excalibur";
    }
    
}
