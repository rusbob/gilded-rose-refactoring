package org.gildedrose.model;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateInventory() {
        for (Item item : items) {
            ItemQualityUpdateStrategy strategy = ItemQualityUpdateStrategyFactory.getStrategy(item);
            strategy.updateQuality(item);
        }
    }
}
