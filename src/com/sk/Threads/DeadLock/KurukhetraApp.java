package com.sk.Threads.DeadLock;

public class KurukhetraApp {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();
        
        warrior1.setName("Karna");
        warrior2.setName("Arjuna");
        
        warrior1.start();
        warrior2.start();
    }
}
