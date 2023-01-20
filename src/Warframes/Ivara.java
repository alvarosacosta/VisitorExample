package Warframes;

import Visitor.Visitor;

public class Ivara implements Warframe {

    @Override
    public void getPrime(Visitor v) {
        v.ensamblar(this);
    }

    @Override
    public String getName() {
        return "Ivara";
    }
    
}
