package org.gildedrose.model;

public class BackstageItemUpdateStrategy implements ItemQualityUpdateStrategy {

    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) {
            increaseQuality(item);
        }
        if (item.sellIn < 6) {
            increaseQuality(item);
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
