package Builders;

public class OrkDirector {

    private OrkBuilder orkBuilder;

    public void setOrkBuilder(String nameTribe) {
        orkBuilder = OrkBuilderFactory.createOrkBuilder(nameTribe);
    }

    public void createBasicOrk() {
        orkBuilder.buildName();
        orkBuilder.buildStrenght();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        orkBuilder.buildWeapon();
        orkBuilder.buildArmor();
    }
    
    public void createLeaderOrk() {
        orkBuilder.buildName();
        orkBuilder.buildStrenght();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        orkBuilder.buildWeapon();
        orkBuilder.buildArmor();
        orkBuilder.buildBanner();
    }
}
