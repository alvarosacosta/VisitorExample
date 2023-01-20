package Warframes;

import Visitor.Visitor;

public interface Warframe {
    public void getPrime(Visitor v);
    public String getName();
}
