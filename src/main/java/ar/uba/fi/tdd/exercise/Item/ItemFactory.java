package ar.uba.fi.tdd.exercise.Item;

import ar.uba.fi.tdd.exercise.QualityStrategy.QualityStrategy;

public class ItemFactory {

    private QualityStrategy strategy;
    Item item;

    public ItemFactory(Item item, QualityStrategy strategy) {
        this.item = item;
        this.strategy = strategy;
    }

    public Item getItem(){
        return this.item;
    }
    public void updateQuality() {
        this.item.sellIn --;
        this.item.quality = strategy.modifyQuality(this.item.quality, this.item.sellIn);
    }

}
