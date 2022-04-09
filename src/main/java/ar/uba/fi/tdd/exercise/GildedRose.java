
package ar.uba.fi.tdd.exercise;

import java.util.ArrayList;

class GildedRose {

    ArrayList<Item> items;

    public GildedRose() {
        this.items = new ArrayList<Item> ();
    }

    public void add(Item item){
        items.add(item);
    }

    public void updateQuality() {
        for(Item item: items){
            item.updateQuality();
        }
    }
}
