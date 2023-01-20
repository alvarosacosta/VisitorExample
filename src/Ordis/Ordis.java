package Ordis;

import Visitor.*;
import Warframes.*;
import java.util.ArrayList;

public class Ordis {
    private Visitor fr;
    private ArrayList<Warframe> warframes = new ArrayList<>();;

    public Ordis(Visitor fr) {
        this.fr = fr;
    }
    
    public void addWarframe(Warframe e){
        warframes.add(e);
    }
    
    public void getAllPrimes(){
        for (Warframe warframe : warframes)
            warframe.getPrime(fr);
        
    }
    
    public void getPrime(String name){
        for (Warframe warframe : warframes) {
            if(warframe.getName().equals(name))
                warframe.getPrime(fr);
        }
    }
    
    
}
