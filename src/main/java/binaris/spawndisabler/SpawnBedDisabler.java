package binaris.spawndisabler;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpawnBedDisabler implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("spawnbeddisabler");

	@Override
	public void onInitialize() {
		EntitySleepEvents.ALLOW_SETTING_SPAWN.register((player, sleepingPos) -> false);
	}
}