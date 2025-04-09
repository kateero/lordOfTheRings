package mephi.b22901.kateero.laba2.Builders;

import java.util.Random;
import mephi.b22901.kateero.laba2.Ork;

public abstract class OrkBuilder {
    protected Ork ork;
    protected Random random = new Random();
    
    public Ork getOrk(){
        return ork;
    }
    
    public void createNewOrk(){
        ork = new Ork();
    }
    
    public void buildName(){
        
    }
    public abstract void buildStrenght();
    public abstract void buildAgility();
    public abstract void buildIntelligence();
    public abstract void buildHealth();
    
}
