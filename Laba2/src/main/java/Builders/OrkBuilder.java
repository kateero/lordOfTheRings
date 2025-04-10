package Builders;

import GearFactory.OrkGearFactory;
import com.github.javafaker.Faker;
import java.util.Random;
import mephi.b22901.kateero.laba2.Ork;

public abstract class OrkBuilder {

    protected Ork ork;
    protected OrkGearFactory orkGearFactory;
    protected Random random = new Random();

    public Ork getOrk() {
        return ork;
    }

    public void setOrkGearFactory(OrkGearFactory orkGearFactory) {
        this.orkGearFactory = orkGearFactory;
    }

    public void createNewOrk() {
        ork = new Ork();
    }

    public void buildName() {
        Faker faker = new Faker();
        ork.setName(faker.lordOfTheRings().character());
    }

    public void buildWeapon(boolean scout) {
        if (scout) {
            ork.setWeapon(orkGearFactory.createScoutWeapon());
        } else {
            ork.setWeapon(orkGearFactory.createWeapon());
        }
    }

    public void buildArmor() {
        ork.setArmor(orkGearFactory.createArmor());
    }

    public void buildBanner() {
        ork.setBanner(orkGearFactory.createBanner());
    }

    public abstract void buildStrenght();

    public abstract void buildAgility();

    public abstract void buildIntelligence();

    public abstract void buildHealth();

}
