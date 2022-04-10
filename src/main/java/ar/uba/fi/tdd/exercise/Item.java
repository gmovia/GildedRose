package ar.uba.fi.tdd.exercise;

import ar.uba.fi.tdd.exercise.QualityStrategy.QualityStrategy;
import ar.uba.fi.tdd.exercise.Restriction.Restriction;
import ar.uba.fi.tdd.exercise.Restriction.RestrictionRange;

public class Item {

    private String name;
    private int sellIn;
    private int quality;
    private QualityStrategy strategy;
    private Restriction restriction;

    public Item(String name, int sellIn, int quality, QualityStrategy strategy, Restriction restriction) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.strategy = strategy;
        this.restriction = restriction;
    }

    // for test
    public int getSellIn(){
        return sellIn;
    }

    // for test
    public int getQuality(){
        return quality;
    }

    public void updateQuality() {
        sellIn--;
        quality = strategy.modifyQuality(quality, sellIn, restriction);
    }


 }
