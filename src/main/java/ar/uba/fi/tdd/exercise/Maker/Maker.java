package ar.uba.fi.tdd.exercise.Maker;

import ar.uba.fi.tdd.exercise.Item.Item;
import ar.uba.fi.tdd.exercise.Item.ItemFactory;
import ar.uba.fi.tdd.exercise.QualityStrategy.*;
import ar.uba.fi.tdd.exercise.Restriction.MaximumRestriction;
import ar.uba.fi.tdd.exercise.Restriction.MinimumRestriction;
import ar.uba.fi.tdd.exercise.Restriction.NullRestriction;
import ar.uba.fi.tdd.exercise.Restriction.RangeRestriction;

public class Maker { // TO-DO RESTRICTION CREATIONAL

    public ItemFactory buildItemStandard(Item item){
        QualityStrategy strategy = new Adder(-1, new MinimumRestriction(1));

        return new ItemFactory(
                item,
                new inRange(-1, 0, new MinimumRestriction(1),strategy)
        );
    }



    public ItemFactory buildAgedBrie(Item item){
        return new ItemFactory(
                item,
                new Adder(1, new MaximumRestriction(49))
        );
    }




    public ItemFactory buildBackstagePasses(Item item){
        QualityStrategy strategy1 = new Constant(0);
        QualityStrategy strategy2 = new inRange(1, 0, new MaximumRestriction(49), strategy1);
        QualityStrategy strategy3 = new inRange(1, 5, new MaximumRestriction(49), strategy2);

        return new ItemFactory(
                item,
                new inRange(1, 10, new RangeRestriction(0,49), strategy3)
        );
    }




    public ItemFactory buildSulfure(Item item){
        return new ItemFactory(
                item,
                new Adder(0,  new NullRestriction())
        );
    }




    public ItemFactory buildItemConjured(Item item){
        QualityStrategy strategy = new Adder(-2, new MinimumRestriction(2));
        return new ItemFactory(
                item,
                new inRange(-2, 0, new MinimumRestriction(2), strategy)
        );
    }


}
