package mephi.b22901.kateero.laba2;

import mephi.b22901.kateero.laba2.Builders.MordorOrkBuilder;
import mephi.b22901.kateero.laba2.Builders.OrkBuilder;

public class Laba2 {

    public static void main(String[] args) {
        OrkBuilder ob = new MordorOrkBuilder();
        ob.createNewOrk();
        ob.buildStrenght();
        System.out.println(ob.getOrk().getStrenght());
    }
}
