package GearFactory;

import Armor.MordorArmor;
import Banner.MordorBanner;
import Weapon.MordorWeapon;

public class MordorGearFactory implements OrkGearFactory {

    @Override
    public String createWeapon() {
        return (new MordorWeapon()).weapon();
    }

    @Override
    public String createArmor() {
        return (new MordorArmor()).armor();
    }

    @Override
    public String createBanner() {
        return (new MordorBanner()).banner();
    }

}
