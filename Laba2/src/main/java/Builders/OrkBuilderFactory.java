package Builders;

import GearFactory.DolGuldurGearFactory;
import GearFactory.MistyMountainsGearFactory;
import GearFactory.MordorGearFactory;

public class OrkBuilderFactory {

    public static OrkBuilder createOrkBuilder(String what) {
        OrkBuilder ob;
        
        switch (what) {
            case "Mordor" -> {
                ob = new MordorOrkBuilder();
                ob.setOrkGearFactory(new MordorGearFactory());
                return ob;
            }
                
            case "Dol Guldur" -> {
                ob = new DolGuldurOrkBuilder();
                ob.setOrkGearFactory(new DolGuldurGearFactory());
                return ob;
            }
                
            case "Misty Mountains" -> {
                ob = new MistyMountainsOrkBuilder();
                ob.setOrkGearFactory(new MistyMountainsGearFactory());
                return ob;
            }
                
            default -> {
                System.out.println("Нет такого племени");
                return null;       
            }
        }
    }
}
