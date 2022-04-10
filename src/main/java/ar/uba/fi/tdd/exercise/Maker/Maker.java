package ar.uba.fi.tdd.exercise.Maker;

import ar.uba.fi.tdd.exercise.Item;
import ar.uba.fi.tdd.exercise.QualityStrategy.*;
import ar.uba.fi.tdd.exercise.Restriction.MaximumRestriction;
import ar.uba.fi.tdd.exercise.Restriction.MinimumRestriction;
import ar.uba.fi.tdd.exercise.Restriction.NullRestriction;
import ar.uba.fi.tdd.exercise.Restriction.RangeRestriction;

public class Maker {

    public Item buildItemStandard(String name, int sellIn, int quality){

        QualityStrategy strategy = new Adder(-1, new MinimumRestriction(1));

        return new Item(
                name,
                sellIn,
                quality,
                new inRange(-1, 0, new MinimumRestriction(1),strategy)
        );
    }

    public Item buildAgedBrie(int sellIn, int quality){

        return new Item(
                "Aged brie",
                sellIn,
                quality,
                new Adder(1, new MaximumRestriction(49))
        );
    }

    public Item buildBackstagePasses(int sellIn, int quality){

        QualityStrategy strategy1 = new Constant(0);
        QualityStrategy strategy2 = new inRange(1, 0, new MaximumRestriction(49), strategy1);
        QualityStrategy strategy3 = new inRange(1, 5, new MaximumRestriction(49), strategy2);

        return new Item(
                "Backstage passes",
                sellIn,
                quality,
                new inRange(1, 10, new RangeRestriction(0,49), strategy3)
        );
    }

    public Item buildSulfure(){

        return new Item(
                "Sulfure",
                0,
                80,
                new Adder(0,  new NullRestriction())
        );
    }

    public Item buildItemConjured(String name, int sellIn, int quality){

        QualityStrategy strategy = new Adder(-2, new MinimumRestriction(2));

        return new Item(
                name,
                sellIn,
                quality,
                new inRange(-2, 0, new MinimumRestriction(2), strategy)
        );
    }


}
