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


public class CommandListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(args.length<3){
            commandSender.sendMessage("§cUsage: /RelicalGive [PlayerIGN OR @a] <Item-Number(from 1 to 4) OR @e to get all items> {Tier Lvl(1-2-3)}");
            return false;
        }

        try{
            if(Integer.valueOf(args[2])!=1 && Integer.valueOf(args[2])!=2 && Integer.valueOf(args[2])!=3){
                commandSender.sendMessage("§cTier lvl "+args[2]+" is not right, it should be (1 OR 2 OR 3)");
                return false;
            }
        }catch (Exception e){
            commandSender.sendMessage("§cTier lvl "+args[2]+" is not right, it should be (1 OR 2 OR 3)");
            return false;
        }

        boolean bool=true;
        boolean first=true;
        Player targetPlayer=null;
        while(bool){
            if(args[0].equals("@a")){break;}

            if(!first){
                commandSender.sendMessage("§cCant find the Player: "+args[0]);
                return false;
            }
            for(Player player: Bukkit.getOnlinePlayers()){
                 if(player.getName().equals(args[0])){
                     targetPlayer=player;
                     bool=false;
                     break;
                }
            }
            first=false;}
        try {
            if (!args[1].equals("@e")) {
                if (Integer.parseInt(args[1]) > 4 || Integer.parseInt(args[1]) < 1) {
                    commandSender.sendMessage("§cThe item number: " + args[1] + " is out of boundaries (1-4)");
                    return false;
                }
            }
        }catch (Exception e){
            commandSender.sendMessage(args[1]+" is not a valid Item Number (from 1 to 4 OR @e to get everything).");
            return false;
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
        if(args[1]=="@e"){commandSender.sendMessage("All Custom Items were given to the player: "+args[0]+".");}
        else{commandSender.sendMessage("Custom Item number "+args[1]+" was given to the player: "+args[0]+".");}

        return true;
    }

    private void giveItem(Player player,String arg, int tier) {
        if(arg.equals("@e")){
            player.getInventory().addItem(CustomRelics.getCustomItem1(tier));
            player.getInventory().addItem(CustomRelics.getCustomItem2());
            player.getInventory().addItem(CustomRelics.getCustomItem3());
            player.getInventory().addItem(CustomRelics.getCustomItem4());
            return;
        }

        if(arg.equals("1")){player.getInventory().addItem(CustomRelics.getCustomItem1(tier));}
        if(arg.equals("2")){player.getInventory().addItem(CustomRelics.getCustomItem2());}
        if(arg.equals("3")){player.getInventory().addItem(CustomRelics.getCustomItem3());}
        if(arg.equals("4")){player.getInventory().addItem(CustomRelics.getCustomItem4());}
    }
}
