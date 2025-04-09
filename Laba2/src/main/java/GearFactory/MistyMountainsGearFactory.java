package GearFactory;

import Armor.MistyMountainsArmor;
import Banner.MistyMountainsBanner;
import Weapon.MistyMountainsWeapon;

public class MistyMountainsGearFactory implements OrkGearFactory{

    @Override
    public String createWeapon() {
        return (new MistyMountainsWeapon()).weapon();
    }

    @Override
    public String createArmor() {
        return (new MistyMountainsArmor()).armor();
    }

    @Override
    public String createBanner() {
        return (new MistyMountainsBanner()).banner();
    }
    
}
