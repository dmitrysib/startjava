package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setName("Cherno Alpha");
        chernoAlpha.setEnergyCore("Stun Core 08");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2412);

        //Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Stun Core 08", 85.34f, 2412);

        chernoAlpha.moveToLocation("Russia");

        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setName("Gipsy Danger");
        gipsyDanger.setEnergyCore("Arc-9 reactor");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1980);

        //Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Arc-9 reactor", 1980);

        gipsyDanger.moveToLocation("Kodiak Island");

        System.out.println(chernoAlpha);
        System.out.println(gipsyDanger);

        chernoAlpha.moveToLocation("Hong Kong, China");

        System.out.println(chernoAlpha);

        gipsyDanger.chargeEnergyCore();
    }
}
