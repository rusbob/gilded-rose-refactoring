package org.gildedrose.model;

public class AgedBrieItemUpdateStrategy implements ItemQualityUpdateStrategy {

    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}
