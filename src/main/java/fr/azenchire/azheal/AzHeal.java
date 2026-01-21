package fr.azenchire.azheal;

import fr.azenchire.azheal.Commands.Heal;
import org.bukkit.plugin.java.JavaPlugin;

public final class AzHeal extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getCommand("heal").setExecutor(new Heal(this));
    }
}
