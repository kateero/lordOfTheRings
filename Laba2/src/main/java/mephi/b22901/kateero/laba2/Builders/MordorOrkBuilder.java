package mephi.b22901.kateero.laba2.Builders;


public class MordorOrkBuilder extends OrkBuilder{

    @Override
    public void buildStrenght(){
        double min = 1.0;
        double max = 100.0;
        double coefficient = 1.3;
        ork.setStrenght(random.nextDouble(min, max)* coefficient);
    }

    @Override
    public void buildAgility() {
        double min = 1.0;
        double max = 100.0;
        double coefficient = 0.7;
        ork.setAgility((min + (max - min) * random.nextDouble()) * coefficient);
    }

    @Override
    public void buildIntelligence() {
        ork.setIntelligence(random.nextDouble(1, 50));
    }

    @Override
    public void buildHealth() {
        ork.setHealth(random.nextDouble(50, 200));
    }  
}
