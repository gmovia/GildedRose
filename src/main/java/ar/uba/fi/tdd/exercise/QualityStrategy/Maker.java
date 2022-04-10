package ar.uba.fi.tdd.exercise.QualityStrategy;

import ar.uba.fi.tdd.exercise.Item;

public class Maker {

    public Item buildItemStandard(String name, int sellIn, int quality){
        return new Item(name, sellIn, quality, new Standard());
    }

    public Item buildAgedBrie(int sellIn, int quality){
        return new Item("Aged brie", sellIn, quality, new Brie());
    }

    public Item buildBackstagePasses(int sellIn, int quality){
        return new Item("Backstage passes", sellIn, quality, new Backstage());
    }
}
