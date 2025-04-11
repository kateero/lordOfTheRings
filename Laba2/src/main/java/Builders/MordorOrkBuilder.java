package Builders;

public class MordorOrkBuilder extends OrkBuilder {

    @Override
    public void buildStrenght() {
        double min = 1.0;
        double max = 100.0;
        double coefficient = 1.3;
        ork.setStrenght(random.nextDouble(min, max) * coefficient);
    }

    @Override
    public void buildAgility() {
        double min = 1.0;
        double max = 100.0;
        double coefficient = 0.7;
        ork.setAgility(random.nextDouble(min, max) * coefficient);
    }

    @Override
    public void buildIntelligence() {
        double min = 1.0;
        double max = 50.0;
        ork.setIntelligence(random.nextDouble(min, max));
    }

    @Override
    public void buildHealth() {
        double min = 50.0;
        double max = 200.0;
        ork.setHealth(random.nextDouble(min, max));
    }

}
