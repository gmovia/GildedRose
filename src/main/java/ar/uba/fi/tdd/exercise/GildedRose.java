
package ar.uba.fi.tdd.exercise;

import ar.uba.fi.tdd.exercise.Item.ItemFactory;

import java.util.ArrayList;

class GildedRose {

    ArrayList<ItemFactory> itemFactories;

    public GildedRose() {
        this.itemFactories = new ArrayList<ItemFactory> ();
    }

    public void add(ItemFactory itemFactory){
        itemFactories.add(itemFactory);
    }

    public void updateQuality() {
        for(ItemFactory itemFactory : itemFactories){
            itemFactory.updateQuality();
        }
    }
}
