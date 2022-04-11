
package ar.uba.fi.tdd.exercise;

import ar.uba.fi.tdd.exercise.Item.Item;
import ar.uba.fi.tdd.exercise.Item.ItemFactory;
import ar.uba.fi.tdd.exercise.Translator.Interpret;

import java.util.ArrayList;

class GildedRose {

    Item[] items;
    Interpret interpret = new Interpret();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(int i = 0; i < items.length; i++){
           ItemFactory itemFactory = interpret.translateItemFactory(items[i]);
           itemFactory.updateQuality();
           items[i] = interpret.translateItem(itemFactory);
        }
    }
}
