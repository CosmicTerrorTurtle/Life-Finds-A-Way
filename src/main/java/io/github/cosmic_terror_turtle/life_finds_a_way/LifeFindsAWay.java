package io.github.cosmic_terror_turtle.life_finds_a_way;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LifeFindsAWay implements ModInitializer {

	public static final String MOD_ID = "life_finds_a_way";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}