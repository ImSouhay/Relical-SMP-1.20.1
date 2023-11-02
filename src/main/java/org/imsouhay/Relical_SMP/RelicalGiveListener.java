/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

Discord: moonsouhay
Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class RelicalGiveListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(args.length<3){
            commandSender.sendMessage("§cUsage: /RelicalGive [PlayerIGN OR @a] <Item-Number(from 1 to 7) OR @e to get all items> {Tier Lvl(1-2-3)}");
            return true;
        }

        try{
            if(Integer.valueOf(args[2])!=1 && Integer.valueOf(args[2])!=2 && Integer.valueOf(args[2])!=3){
                commandSender.sendMessage("§cTier lvl "+args[2]+" is not right, it should be (1 OR 2 OR 3)");
                return true;
            }
        }catch (Exception e){
            commandSender.sendMessage("§cTier lvl "+args[2]+" is not right, it should be (1 OR 2 OR 3)");
            return true;
        }

        boolean bool=true;
        boolean first=true;
        Player targetPlayer=null;
        while(bool){
            if(args[0].equals("@a")){break;}

            if(!first){
                commandSender.sendMessage("§cCant find the Player: "+args[0]);
                return true;
            }
            for(Player player: Bukkit.getOnlinePlayers()){
                 if(player.getName().equals(args[0])){
                     targetPlayer=player;
                     bool=false;
                     break;
                }
            }
            first=false;
        }

        try {
            if (!args[1].equals("@e")) {
                if (Integer.parseInt(args[1]) > 7 || Integer.parseInt(args[1]) < 1) {
                    commandSender.sendMessage("§cThe item number: " + args[1] + " is out of boundaries (1-7)");
                    return true;
                }
            }
        }catch (Exception e){
            commandSender.sendMessage("§c"+args[1]+" is not a valid Item Number (from 1 to 4 OR @e to get everything).");
            return true;
        }

        int PLAYERS_COUNT=0;
        if(args[0].equals("@a")){
            for(Player player:Bukkit.getOnlinePlayers()){
                giveItem(player, args[1], Integer.valueOf(args[2]));
                PLAYERS_COUNT++;
            }
            if(args[1].equals("@e")){
                if(PLAYERS_COUNT==1){commandSender.sendMessage("All Custom Items were given to everyone online! (A single Player)");}else{
                    commandSender.sendMessage("All Custom Items were given to everyone online! ("+PLAYERS_COUNT+" Players)");
                }
            }
            else{
                if(PLAYERS_COUNT==1) {
                    commandSender.sendMessage("Custom Item number " + args[1] + " was given to everyone online! (A single Player)");}else{
                    commandSender.sendMessage("Custom Item number " + args[1] + " was given to everyone online! ("+PLAYERS_COUNT+" Players)");
                }
            }
            return true;
        }


        giveItem(targetPlayer, args[1], Integer.valueOf(args[2]));
        if(args[1].equals("@e")){commandSender.sendMessage("All Custom Items were given to the player: "+args[0]+".");}
        else{commandSender.sendMessage("Custom Item number "+args[1]+" was given to the player: "+args[0]+".");}

        return true;
    }

    private void giveItem(Player player,String arg, int tier) {
        if(arg.equals("@e")){
            for(int i=1;i<=7;i++){
                player.getInventory().addItem(CustomRelics.getCustomItem(i, tier));
            }
            return;
        }
        player.getInventory().addItem(CustomRelics.getCustomItem(Integer.valueOf(arg), tier));
    }
}
