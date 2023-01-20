package main;

import Ordis.*;
import Visitor.*;
import Warframes.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Visitor fr = new Foundry();
        Ordis ordis = new Ordis(fr);
        
        ordis.addWarframe(new Ivara());
        ordis.addWarframe(new Excalibur());
        ordis.addWarframe(new Ember());
        
        System.out.println("Escriba el warframe que quiere mejorar a prime:"
                + "\n Ivara"
                + "\n Excalibur"
                + "\n Ember"
                + "\n Todos");
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        if(line.equals("Todos")){
            ordis.getAllPrimes();
            
        } else if(line.equals("Ivara") || line.equals("Excalibur") || line.equals("Ember")) {
            ordis.getPrime(line);
            
        } else {
            System.out.println("Eso no exite aqui mamahuevazo.");
        }
        
    }
    
}
