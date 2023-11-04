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
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
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

        if(!hasCustomTag(event.getItemDrop().getItemStack())){return;}

        event.getPlayer().sendMessage("§cYou are not allowed to drop your §4§lRelic§r§c.");
        event.setCancelled(true);
        
    }



    @EventHandler
    public static void onDeath(PlayerDeathEvent event) {
        for(ItemStack item:event.getDrops()){
            if(!hasCustomTag(item)){continue;}
            event.getDrops().remove(item);
        }
    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public static void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        PlayerInventory inventory = player.getInventory();

        if (event.getClick().isShiftClick()) {
            if (event.getClickedInventory().getType() == inventory.getType()) {
                for(ItemStack item:event.getInventory().getStorageContents()){
                    if(hasCustomTag(item)){return;}
                }
                event.setCancelled(true);
                player.sendMessage("§cYou can't store your §4§lRelic §r§chere.");
            }
        }

        if(event.getCurrentItem()==null){return;}
        if(hasCustomTag(event.getCurrentItem())) {
            if (event.getClick().isLeftClick() || event.getClick().isRightClick() || event.getClick().isMouseClick()) {
                if (Objects.requireNonNull(event.getClickedInventory()).getType() != inventory.getType()) {
                    event.setCancelled(true);
                    player.sendMessage("§cYou can't store your §4§lRelic §r§chere.");
                }
            }
        }
    }


    private static boolean hasCustomTag(ItemStack item){
        return Objects.requireNonNull(item.getItemMeta()).getPersistentDataContainer().has(key, PersistentDataType.STRING);
    }

}
