package org.lushplugins.regrowthworldborderexpander;

import org.bukkit.plugin.java.JavaPlugin;

public final class RegrowthWorldBorderExpander extends JavaPlugin {
    private static RegrowthWorldBorderExpander plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static RegrowthWorldBorderExpander getInstance() {
        return plugin;
    }
}
