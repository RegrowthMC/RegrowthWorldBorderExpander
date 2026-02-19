package org.lushplugins.regrowthworldborderexpander;

import org.bukkit.plugin.java.JavaPlugin;
import org.lushplugins.regrowthworldborderexpander.command.WorldBorderExpandCommand;
import revxrsal.commands.bukkit.BukkitLamp;

public final class RegrowthWorldBorderExpander extends JavaPlugin {

    @Override
    public void onEnable() {
        BukkitLamp.builder(this)
            .build()
            .register(new WorldBorderExpandCommand());
    }
}
