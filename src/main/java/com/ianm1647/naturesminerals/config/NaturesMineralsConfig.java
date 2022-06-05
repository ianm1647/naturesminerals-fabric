package com.ianm1647.naturesminerals.config;


import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;

public class NaturesMineralsConfig implements Config {
    @Comment(value = "Hammer and Excavator durability multiplier")
    public int durabilityMultiplier = 5;

    @Comment(value = "Spawn rates for Uvarovite ore")
    public int uvaroviteMaxHeight = 20;
    public int uvaroviteMinHeight = -20;
    public int uvaroviteVeinSize = 5;
    public int uvaroviteVeinsPerChunk = 8;

    @Comment(value = "Spawn rates for Kunzite ore")
    public int kunziteMaxHeight = -20;
    public int kunziteMinHeight = -60;
    public int kunziteVeinSize = 4;
    public int kunziteVeinsPerChunk = 5;

    @Comment(value = "Spawn rates for Stibnite ore")
    public int stibniteMaxHeight = 256;
    public int stibniteMinHeight = 0;
    public int stibniteVeinSize = 3;
    public int stibniteVeinsPerChunk = 4;

    @Comment(value = "Spawn rates for Astrite ore")
    public int astriteMaxHeight = 256;
    public int astriteMinHeight = 0;
    public int astriteVeinSize = 3;
    public int astriteVeinsPerChunk = 4;

    @Override
    public String getName() {
        return "natures-minerals";
    }
}
