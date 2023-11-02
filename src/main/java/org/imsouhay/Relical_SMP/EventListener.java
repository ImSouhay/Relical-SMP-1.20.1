/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

 Discord: moonsouhay
 Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import org.bukkit.NamespacedKey;
import org.bukkit.craftbukkit.v1_20_R2.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.Iterator;
import java.util.Objects;

import static org.bukkit.plugin.java.JavaPlugin.getProvidingPlugin;


public class EventListener implements Listener {

    private static final NamespacedKey key=new NamespacedKey(getProvidingPlugin(Main.class), "customItem");


    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player player= event.getPlayer();
        player.getInventory().addItem(CustomRelics.getRandomCustomItem(1));
    }


    @EventHandler
    public static void onDropItem(PlayerDropItemEvent event){
        if(hasCustomTag(event.getItemDrop().getItemStack())){
            event.getPlayer().sendMessage("§cYou are not allowed to drop your §4§lRelic§r§c.");
            event.setCancelled(true);
        }
    }


//    @EventHandler
//    public static void onPlayerInteraction(PlayerInteractEvent event){
//
//    }


    @EventHandler
    public static void onDeath(PlayerDeathEvent event) {
        event.getDrops().removeIf(EventListener::hasCustomTag);
    }


    private static boolean hasCustomTag(ItemStack item){
        return Objects.requireNonNull(item.getItemMeta()).getPersistentDataContainer().get(key, PersistentDataType.STRING).equals("true");
    }

}
