/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

 Discord: moonsouhay
 Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerTextures;
import org.bukkit.profile.PlayerProfile;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.IllegalFormatException;
import java.util.UUID;


public class CustomSkulls {
    private static UUID id;
    private static String Modification;

    public static ItemStack Skull(String skinLink){
        URL[] skin =new URL[1];
        try{
            skin[0]=new URL(skinLink);
        }catch (MalformedURLException e){
            Bukkit.getServer().getConsoleSender().sendMessage("§cSomething went wrong turning the String into URL.");
        }

        ItemStack item=new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta=(SkullMeta) item.getItemMeta();

        PlayerProfile playerProfile= Bukkit.getServer().createPlayerProfile(UUID.randomUUID(),null);

        PlayerTextures textures=playerProfile.getTextures();
        textures.setSkin(skin[0]);

        playerProfile.setTextures(textures);
        assert meta != null;
        meta.setOwnerProfile(playerProfile);

        item.setItemMeta(meta);
        return item;
    }
}
