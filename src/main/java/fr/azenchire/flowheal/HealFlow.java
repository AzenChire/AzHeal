package fr.azenchire.flowheal;

import fr.azenchire.flowheal.Commands.Heal;
import org.bukkit.plugin.java.JavaPlugin;

public final class HealFlow extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getCommand("heal").setExecutor(new Heal(this));
    }
}
