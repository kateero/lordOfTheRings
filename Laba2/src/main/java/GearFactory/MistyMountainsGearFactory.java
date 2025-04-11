package GearFactory;

import Armor.MistyMountainsArmor;
import Banner.MistyMountainsBanner;
import Weapon.MistyMountainsWeapon;

public class MistyMountainsGearFactory implements OrkGearFactory{

    @Override
    public String createWeapon() {
        return (new MistyMountainsWeapon()).basicWeapon();
    }

    @Override
    public String createArmor() {
        return (new MistyMountainsArmor()).armor();
    }

    @Override
    public String createBanner() {
        return (new MistyMountainsBanner()).banner();
    }

    @Override
    public String createScoutWeapon() {
        return (new MistyMountainsWeapon()).scoutWeapon();
    }
    
}
