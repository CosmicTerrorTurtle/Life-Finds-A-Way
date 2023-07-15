package io.github.cosmic_terror_turtle.life_finds_a_way.item;

import io.github.cosmic_terror_turtle.life_finds_a_way.LifeFindsAWay;
import io.github.cosmic_terror_turtle.life_finds_a_way.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SUPER_GROWTH_FERTILIZER = registerItem("super_growth_fertilizer", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LifeFindsAWay.MOD_ID, name), item);
    }

    public static void registerItems() {
        LifeFindsAWay.LOGGER.info("Registering items for: "+LifeFindsAWay.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.SUPER_GROWTH_SOIL_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUPER_GROWTH_FERTILIZER);
        });
    }
}
