package GearFactory;

import Armor.DolGuldurArmor;
import Banner.DolGuldurBanner;
import Weapon.DolGuldurWeapon;

public class DolGuldurGearFactory implements OrkGearFactory {

    @Override
    public String createWeapon() {
        return (new DolGuldurWeapon()).basicWeapon();
    }

    @Override
    public String createArmor() {
        return (new DolGuldurArmor()).armor();
    }

    @Override
    public String createBanner() {
        return (new DolGuldurBanner()).banner();
    }

    @Override
    public String createScoutWeapon() {
        return (new DolGuldurWeapon()).scoutWeapon();
    }

}
