/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

 Discord: moonsouhay
 Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.bukkit.plugin.java.JavaPlugin.getProvidingPlugin;


public class CustomRelics {

    private static final String[] skin={
            "http://textures.minecraft.net/texture/a409bd9607f4c1d694f6253c8b671d092f8b16ca7f66ebfd67ef9d864024774b",
            "http://textures.minecraft.net/texture/a409bd9607f4c1d694f6253c8b671d092f8b16ca7f66ebfd67ef9d864024774b",
            "http://textures.minecraft.net/texture/ba7bfa80a85e707eedf945b88905942f5f7795ea5264d692a22e707fc577a88b",
            "http://textures.minecraft.net/texture/ba0a5b510a8d824ff4910ca5b2698aa3d030f837810e8d7f0bbca8cf06ce2023",
            "http://textures.minecraft.net/texture/c9c28da01e012880eacc3ab1d34d9145357d2e2d46d42aa3b59edb91b1f7bd6d",
            "http://textures.minecraft.net/texture/d40f9299508387618cfad6db35c9f6d807c49337d333d6ec3b13d9e87d0d488f",
            "http://textures.minecraft.net/texture/7f50aa3e7229247aa598249c83aec462ab1654865e201e6925f55f5dd3643eca",
            "http://textures.minecraft.net/texture/25d9243c61e2c3e1e0f9931843cadbd0dff4a646225ef54c557979cf39bb2057",
    };


    private static final ItemStack[][] customItem={
            {
                new ItemStack(Material.COMMAND_BLOCK),
                new ItemStack(Material.COMMAND_BLOCK),
                new ItemStack(Material.COMMAND_BLOCK)},
            {
                CustomSkulls.Skull(skin[1]),
                CustomSkulls.Skull(skin[1]),
                CustomSkulls.Skull(skin[1])},
            {
                CustomSkulls.Skull(skin[2]),
                CustomSkulls.Skull(skin[2]),
                CustomSkulls.Skull(skin[2])},
            {
                CustomSkulls.Skull(skin[3]),
                CustomSkulls.Skull(skin[3]),
                CustomSkulls.Skull(skin[3])},
            {
                CustomSkulls.Skull(skin[4]),
                CustomSkulls.Skull(skin[4]),
                CustomSkulls.Skull(skin[4])},
            {
                CustomSkulls.Skull(skin[5]),
                CustomSkulls.Skull(skin[5]),
                CustomSkulls.Skull(skin[5])},
            {
                CustomSkulls.Skull(skin[6]),
                CustomSkulls.Skull(skin[6]),
                CustomSkulls.Skull(skin[6])},
            {
                CustomSkulls.Skull(skin[7]),
                CustomSkulls.Skull(skin[7]),
                CustomSkulls.Skull(skin[7])}
    };


    // This will make the custom items
    public static void makeCustomItems(){
        for(int i=1;i<=7;i++){
            for(int j=0;j<=2;j++){
                ItemMeta meta= customItem[i][j].getItemMeta();
                assert meta != null;
                NamespacedKey key= new NamespacedKey(getProvidingPlugin(Main.class), "customitem");
                meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "true");
                customItem[i][j].setItemMeta(RelicsMaker.getMeta(meta, i, j));
            }
        }
    }


    public static ItemStack getCustomItem(int itemNum, int tier){
        return customItem[itemNum][tier-1];
    }


    public static boolean checkAllItems(ItemStack item){
        for(int i=1;i<=7;i++){
            for(int j=0;j<=2;j++){
                if(item.isSimilar(customItem[i][j])){return true;}
            }
        }
        return false;
    }


    public static ItemStack getRandomCustomItem(int tier){
        int i= new Random().nextInt(7)+1;

        return customItem[i][tier-1];
    }

    public static ItemStack getRandomCustomItem(){
        int i= new Random().nextInt(7)+1;
        int tier= new Random().nextInt(3);

        return customItem[i][tier];
    }

}
