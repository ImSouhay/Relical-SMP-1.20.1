/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

Discord: moonsouhay
Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class EventListener implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player player= event.getPlayer();
        player.getInventory().addItem(CustomRelics.getRandomCustomItem());
    }


}
