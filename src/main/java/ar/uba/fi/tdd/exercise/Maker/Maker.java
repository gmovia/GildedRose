package ar.uba.fi.tdd.exercise.Maker;

import ar.uba.fi.tdd.exercise.Item;
import ar.uba.fi.tdd.exercise.QualityStrategy.*;

public class Maker {

    public Item buildItemStandard(String name, int sellIn, int quality){
        return new Item(name, sellIn, quality, new inRange(-1, 0, new Adder(-1)));
    }

    public Item buildAgedBrie(int sellIn, int quality){
        return new Item("Aged brie", sellIn, quality, new Adder(1));
    }

    public Item buildBackstagePasses(int sellIn, int quality){
        QualityStrategy strategy = new inRange(1, 10, new inRange(1, 5, new inRange(1, 0, new Constant(0))));
        return new Item("Backstage passes", sellIn, quality, strategy);
    }

    public Item buildSulfure(){
        return new Item("Sulfure", 0, 80, new Adder(0));
    }


}
