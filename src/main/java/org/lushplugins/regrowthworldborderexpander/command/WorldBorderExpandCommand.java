package org.lushplugins.regrowthworldborderexpander.command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Optional;
import revxrsal.commands.annotation.Subcommand;
import revxrsal.commands.bukkit.annotation.CommandPermission;

@Command("regrowthworldborder")
@SuppressWarnings("unused")
public class WorldBorderExpandCommand {

    @Subcommand("set")
    @CommandPermission("regrowthworldborder.set")
    public void set(CommandSender sender, World world, int size, @Optional Long seconds) {
        if (seconds != null) {
            world.getWorldBorder().setSize(size, seconds);
        } else {
            world.getWorldBorder().setSize(size);
        }

        sender.sendMessage(Component.text()
            .content("World border size has been updated!")
            .color(TextColor.fromHexString("#b7faa2"))
            .build());
    }

    @Subcommand("expand")
    @CommandPermission("regrowthworldborder.set")
    public void expand(CommandSender sender, World world, int increment, @Optional Long seconds) {
        set(sender, world, (int) (world.getWorldBorder().getSize() + increment), seconds);
    }

    @Subcommand("shrink")
    @CommandPermission("regrowthworldborder.set")
    public void shrink(CommandSender sender, World world, int reduction, @Optional Long seconds) {
        set(sender, world, (int) (world.getWorldBorder().getSize() - reduction), seconds);
    }
}
