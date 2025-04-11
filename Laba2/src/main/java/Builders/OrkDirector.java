package Builders;

import mephi.b22901.kateero.laba2.Ork;

public class OrkDirector {

    private OrkBuilder orkBuilder;

    public void setOrkBuilder(String nameTribe) {
        orkBuilder = OrkBuilderFactory.createOrkBuilder(nameTribe);
    }

    private void createBasicOrk() {
        orkBuilder.createNewOrk();
        orkBuilder.buildName();
        orkBuilder.buildStrenght();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        orkBuilder.buildWeapon(false);
        orkBuilder.buildArmor();
    }

    private void createLeaderOrk() {
        orkBuilder.createNewOrk();
        orkBuilder.buildName();
        orkBuilder.buildStrenght();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        orkBuilder.buildWeapon(false);
        orkBuilder.buildArmor();
        orkBuilder.buildBanner();
    }

    private void createScoutOrk() {
        orkBuilder.createNewOrk();
        orkBuilder.buildName();
        orkBuilder.buildStrenght();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        orkBuilder.buildWeapon(true);
        orkBuilder.buildArmor();
    }

    public Ork getOrk() {
        return orkBuilder.getOrk();
    }

    public void createOrk(String typeOrk) {
        switch (typeOrk) {
            case "Basic ork" ->
                createBasicOrk();

            case "Leader" ->
                createLeaderOrk();

            case "Scout" ->
                createScoutOrk();
        }
    }
}
