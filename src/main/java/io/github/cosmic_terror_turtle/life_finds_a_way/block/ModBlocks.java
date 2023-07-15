package io.github.cosmic_terror_turtle.life_finds_a_way.block;

import io.github.cosmic_terror_turtle.life_finds_a_way.LifeFindsAWay;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SUPER_GROWTH_SOIL_BLOCK = registerBlock(
            "super_growth_soil_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK))
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                new Identifier(LifeFindsAWay.MOD_ID, name),
                block
        );
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(LifeFindsAWay.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings())
        );
    }

    public static void registerBlocks() {
        LifeFindsAWay.LOGGER.info("Registering blocks for: "+LifeFindsAWay.MOD_ID);
    }
}
