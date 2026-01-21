package fr.azenchire.flowheal.Commands;

import com.cryptomorin.xseries.XSound;
import fr.azenchire.flowheal.HealFlow;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    private final HealFlow main;

    public Heal(HealFlow healFlow) {
        this.main = healFlow;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(main.getConfig().getString("Messages.Console").replace("&", "§"));
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            if (player.hasPermission("flowheal.use")) {
                healPlayer(player);
                player.sendMessage(main.getConfig().getString("Messages.Heal").replace("&", "§"));
            }
            else {
                player.sendMessage(main.getConfig().getString("Messages.NoPerms").replace("&", "§"));
            }
        }

        else if (args.length == 1) {

            Player target = Bukkit.getPlayerExact(args[0]);

            if (player.hasPermission("flowheal.target")) {
                if (target != null) {
                    healPlayer(target);
                    player.sendMessage(main.getConfig().getString("Messages.HealedTarget")
                            .replace("&", "§").replace("[target]", target.getDisplayName()));
                    target.sendMessage(main.getConfig().getString("Messages.GotHealed")
                            .replace("&", "§").replace("[player]", player.getDisplayName()));
                }
                else {
                    player.sendMessage(main.getConfig().getString("Messages.OfflinePlayer").replace("&", "§"));
                }
            }
            else {
                player.sendMessage(main.getConfig().getString("Messages.NoPerms").replace("&", "§"));
            }
        }
        return true;
    }

    private void healPlayer(Player player) {
        player.setHealth(20);
        if (main.getConfig().getBoolean("Options.AutoFeed")) {
            player.setFoodLevel(20);
        }
        if (main.getConfig().getBoolean("Options.PlaySound")){
            XSound.ENTITY_PLAYER_LEVELUP.play(player);
        }
    }
}