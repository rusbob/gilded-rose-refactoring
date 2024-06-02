package org.gildedrose.model;

public class ItemQualityUpdateStrategyFactory {

    private ItemQualityUpdateStrategyFactory() {
        throw new IllegalStateException("Factory class. No instance expected");
    }

    public static ItemQualityUpdateStrategy getStrategy(Item item){
        ItemNameEnum itemName = ItemNameEnum.fromString(item.name);
        switch (itemName){
            case AGED_BRIE:
                return new AgedBrieItemUpdateStrategy();
            case BACKSTAGE_PASSES:
                return new BackstageItemUpdateStrategy();
            case SULFURAS:
                return new SulfureItemUpdateStrategy();
            case CONJURED:
                return new ConjuredItemUpdateStrategy();
            default:
                return new RegularItemUpdateStrategy();
        }
    }
}
