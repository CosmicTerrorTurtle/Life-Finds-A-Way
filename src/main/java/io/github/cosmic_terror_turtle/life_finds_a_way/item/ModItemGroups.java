package io.github.cosmic_terror_turtle.life_finds_a_way.item;

import io.github.cosmic_terror_turtle.life_finds_a_way.LifeFindsAWay;
import io.github.cosmic_terror_turtle.life_finds_a_way.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup LIFE_FINDS_A_WAY = registerGroup(
            "life_finds_a_way",
            ModBlocks.SUPER_GROWTH_SOIL_BLOCK,
            (displayContext, entries) -> {
                entries.add(ModBlocks.SUPER_GROWTH_SOIL_BLOCK);
                entries.add(ModItems.SUPER_GROWTH_FERTILIZER);
            }
    );

    private static ItemGroup registerGroup(String name, ItemConvertible icon, ItemGroup.EntryCollector entryCollector) {
        return Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(LifeFindsAWay.MOD_ID, name),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemgroup."+name))
                        .icon(() -> new ItemStack(icon))
                        .entries(entryCollector)
                        .build()
        );
    }

    public static void registerItemGroups() {
        LifeFindsAWay.LOGGER.info("Registering item groups for: "+LifeFindsAWay.MOD_ID);
    }
}
