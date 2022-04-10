package ar.uba.fi.tdd.exercise.Maker;

import ar.uba.fi.tdd.exercise.Item;
import ar.uba.fi.tdd.exercise.QualityStrategy.*;
import ar.uba.fi.tdd.exercise.Restriction.RestrictionRange;

public class Maker {

    public Item buildItemStandard(String name, int sellIn, int quality){

        return new Item(
                name,
                sellIn,
                quality,
                new inRange(-1, 0, new Adder(-1)),
                new RestrictionRange(1,50)
        );
    }

    public Item buildAgedBrie(int sellIn, int quality){

        return new Item(
                "Aged brie",
                sellIn,
                quality,
                new Adder(1),
                new RestrictionRange(0,49)
        );
    }

    public Item buildBackstagePasses(int sellIn, int quality){

        return new Item(
                "Backstage passes",
                sellIn,
                quality,
                new inRange(1, 10, new inRange(1, 5, new inRange(1, 0, new Constant(0)))),
                new RestrictionRange(0,49)
        );
    }

    public Item buildSulfure(){

        return new Item(
                "Sulfure",
                0,
                80,
                new Adder(0),
                new RestrictionRange(0,80)
        );
    }


}
