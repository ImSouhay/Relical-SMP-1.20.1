/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

Discord: moonsouhay
Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[Relical-SMP-plugin] Thanks for using my plugin!");
        System.out.println("[Relical-SMP-plugin] Made By: Minecraft IGN: ImSouhay, Discord: moonsouhay, Github: https://github.com/ImSouhay .");
        CustomRelics.makeCustomItems();
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getCommand("RelicalGive").setExecutor(new CommandListener());
    }

    @Override
    public void onDisable() {
        System.out.println("Relical-SMP-plugin Made By: Minecraft IGN: ImSouhay, Discord: moonsouhay, Github: https://github.com/ImSouhay .");
    }
}
