package ar.uba.fi.tdd.exercise.Translator;

import ar.uba.fi.tdd.exercise.Item.Item;
import ar.uba.fi.tdd.exercise.Item.ItemFactory;
import ar.uba.fi.tdd.exercise.Maker.Maker;
import ar.uba.fi.tdd.exercise.QualityStrategy.Constant;

public class Interpret {
    private static final String NAME_BRIE = "Aged Brie";
    private static final String NAME_SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String NAME_BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String NAME_CONJURED = "Conjured";

    Maker maker;

    public Interpret(){
        this.maker = new Maker();
    }

    public Item translateItem(ItemFactory itemFactory){
       return itemFactory.getItem();
    }

    public ItemFactory translateItemFactory(Item item){
        if(item.name == NAME_BRIE){
           return maker.buildAgedBrie(item);
       }
        if(item.name == NAME_BACKSTAGE){
           return maker.buildBackstagePasses(item);
       }
        if(item.name == NAME_CONJURED){
           return maker.buildItemConjured(item);
       }
        if(item.name == NAME_SULFURAS){
           return maker.buildSulfure(item);
       }
        return maker.buildItemStandard(item);
    }


}
