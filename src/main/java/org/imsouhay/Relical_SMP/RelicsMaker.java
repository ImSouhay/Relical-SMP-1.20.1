/*
 Hey there!

 This Plugin was made by Souhay.

 If you have any questions or want to chat about this code, feel free to reach out!

 Discord: moonsouhay
 Minecraft IGN: ImSouhay
 GitHub: https://github.com/ImSouhay
*/


package org.imsouhay.Relical_SMP;


import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class RelicsMaker {
    public static ItemMeta getMeta1(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§4§lThe Strength Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§4Relic Ability:");
            lore.add("§cDreadful Gaze §4§lRIGHT CLICK");
            lore.add("§7Gives §8Blindness §7to Players in §a5 blocks §7radius.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§m§8Locked Ability: Life Steal");
            lore.add("§r");
            lore.add("§r");
            lore.add("§4Passive Effects:");
            lore.add("§7Strength §8§l1");
            lore.add("§7Slowness §8§l1");

        }
        if(tier==2){
            meta.setDisplayName("§4§lThe Strength Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§4Relic Ability:");
            lore.add("§cDreadful Gaze §4§lRIGHT CLICK");
            lore.add("§7Gives §8Blindness §7to Players in §a10 blocks §7radius.");
            lore.add("§8Cool Down: 25s");
            lore.add("§r");
            lore.add("§m§8Locked Ability: Life Steal");
            lore.add("§r");
            lore.add("§r");
            lore.add("§4Passive Effects:");
            lore.add("§7Strength §8§l2");
            lore.add("§7Slowness §8§l1");
        }
        if(tier==3){
            meta.setDisplayName("§4§lThe Strength Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§4Relic Abilities:");
            lore.add("§cDreadful Gaze §4§lRIGHT CLICK");
            lore.add("§7Gives §8Blindness §7to Players in §a5 blocks §7radius and also gives §8Strength 3 §7for §a5 seconds§7.");
            lore.add("§8Cool Down: 25s");
            lore.add("§r");
            lore.add("§cLife Steal §4§lLEFT CLICK §r§con enemy");
            lore.add("§cSteals 5 of the enemy's hearts for §a5 seconds§7.");
            lore.add("§8Cool Down: 1mn");
            lore.add("§r");
            lore.add("§r");
            lore.add("§4Passive Effects:");
            lore.add("§7Strength §8§l3");
            lore.add("§7Slowness §8§l2");
        }

        meta.setLore(lore);
        return meta;
    }
    public static ItemMeta getMeta2(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§a§lThe Wealth Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§2Relic Ability:");
            lore.add("§aVenomous Fortune §e§lRIGHT CLICK");
            lore.add("§7Gives §8Poison 2 §7to Players in §a5 blocks §7radius for §a5 seconds.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§2Passive Effects:");
            lore.add("§7Hero Of The Village §8§l1");
            lore.add("§8§l8 §r§7Hearts only");
        }
        if(tier==2){
            meta.setDisplayName("§a§lThe Wealth Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§2Relic Ability:");
            lore.add("§aVenomous Fortune §e§lRIGHT CLICK");
            lore.add("§7Gives §8Poison 2 §7to Players in §a10 blocks §7radius for §a10 seconds.");
            lore.add("§8Cool Down: 25s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§2Passive Effects:");
            lore.add("§7Hero Of The Village §8§l3");
            lore.add("§7Luck §8§l1");
            lore.add("§8§l8 §r§7Hearts only");
        }
        if(tier==3){
            meta.setDisplayName("§a§lThe Wealth Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§2Relic Ability:");
            lore.add("§aVenomous Fortune §e§lRIGHT CLICK");
            lore.add("§7Gives §8Poison 3 §7to Players in §a10 blocks §7radius for §a10 seconds.");
            lore.add("§8Cool Down: 20s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§2Passive Effects:");
            lore.add("§7Hero Of The Village §8§l5");
            lore.add("§7Luck §8§l1");
            lore.add("§8§l9 §r§7Hearts only");
        }

        meta.setLore(lore);
        return meta;
    }
    public static ItemMeta getMeta3(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§f§lThe Speed Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fFatigue Aura §e§lRIGHT CLICK");
            lore.add("§7Gives §8Mining Fatigue §7to Players in §a5 blocks §7radius.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Speed §8§l2");
            lore.add("§7Weakness §8§l1");
        }
        if(tier==2){
            meta.setDisplayName("§f§lThe Speed Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fFatigue Aura §e§lRIGHT CLICK");
            lore.add("§7Gives §8Mining Fatigue §7to Players in §a10 blocks §7radius.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Speed §8§l3");
            lore.add("§7Weakness §8§l1");
        }
        if(tier==3){
            meta.setDisplayName("§f§lThe Speed Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fFatigue Aura §e§lRIGHT CLICK");
            lore.add("§7Gives §8Mining Fatigue §7to Players in §a10 blocks §7radius.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Speed §8§l3");
            lore.add("§7Weakness §8§l1");
            lore.add("§7Haste §8§l3");
            lore.add("§7++Attack Speed");
        }

        meta.setLore(lore);
        return meta;
    }
    public static ItemMeta getMeta4(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§d§lThe Regeneration Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§dRelic Ability:");
            lore.add("§cReversed Healing Technique §c§lRIGHT CLICK");
            lore.add("§7Gives §8The Withering Effect 1 §7to Players in §a5 blocks §7 radius for §a5 seconds.");
            lore.add("§8Cool Down: 50s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7Regeneration §8§l1");
            lore.add("§7Glowing");

        }
        if(tier==2){
            meta.setDisplayName("§d§lThe Regeneration Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§dRelic Ability:");
            lore.add("§cReversed Healing Technique §c§lRIGHT CLICK");
            lore.add("§7Gives §8The Withering Effect 3 §7to Players in §a10 blocks §7 radius for §a5 seconds.");
            lore.add("§8Cool Down: 45s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7Regeneration §8§l2");
            lore.add("§7Glowing");
        }
        if(tier==3){
            meta.setDisplayName("§d§lThe Regeneration Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§dRelic Abilities:");
            lore.add("§cReversed Healing Technique §c§lRIGHT CLICK");
            lore.add("§7Gives §8The Withering Effect 4 §7to Players in §a10 blocks §7 radius for §a5 seconds.");
            lore.add("§8Cool Down: 35s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7Regeneration §8§l3");
            lore.add("§7Glowing");
        }

        meta.setLore(lore);
        return meta;
    }
    public static ItemMeta getMeta5(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§8§lThe Phantom Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fSummoner §8§lRIGHT CLICK");
            lore.add("§7Summons §84 Phantoms §7that attack other players, despawns after 2 minutes.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Slow Falling");
            lore.add("§7Invisibility");
        }
        if(tier==2){
            meta.setDisplayName("§8§lThe Phantom Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§cSummoner §4§lRIGHT CLICK");
            lore.add("§7Summons §86 Phantoms §7that attack other players, despawns after 3 minutes.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Slow Falling");
            lore.add("§7Invisibility");
        }
        if(tier==3){
            meta.setDisplayName("§8§lThe Phantom Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§cSummoner §4§lRIGHT CLICK");
            lore.add("§7Summons §89 Phantoms §7that attack other players, despawns after 5 minutes.");
            lore.add("§8Cool Down: 25s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Slow Falling");
            lore.add("§7Invisibility");
        }

        meta.setLore(lore);
        return meta;
    }
    public static ItemMeta getMeta6(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§b§lThe Ice Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§3Relic Ability:");
            lore.add("§bIcicles Bolt §3§lRIGHT CLICK");
            lore.add("§7Shoots deadly Icicles that freeze enemies, for the cost of §c-1 heart§7.");
            lore.add("§8Cool Down: 50s");
            lore.add("§r");
            lore.add("§bIce Chunk §3§lLEFT CLICK");
            lore.add("§7Summons a §b§lChunk Of Ice §r§7 thats seals Players inside of it.");
            lore.add("§8Cool Down: 40s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§3Passive Effects:");
            lore.add("§7--Attack Speed");
        }
        if(tier==2){
            meta.setDisplayName("§4§lThe Strength Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eRIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§3Relic Ability:");
            lore.add("§bIcicles Bolt §3§lRIGHT CLICK");
            lore.add("§7Shoots deadly Icicles that freeze enemies, for the cost of §c-1 heart§7.");
            lore.add("§8Cool Down: 45s");
            lore.add("§r");
            lore.add("§bIce Chunk §3§lLEFT CLICK");
            lore.add("§7Summons a §b§lChunk Of Ice §r§7 thats seals Players inside of it.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§3Passive Effects:");
            lore.add("§7--Attack Speed");
        }

        if(tier==3){
            meta.setDisplayName("§4§lThe Strength Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§3Relic Ability:");
            lore.add("§bIcicles Bolt §3§lRIGHT CLICK");
            lore.add("§7Shoots deadly Icicles that freeze enemies, for the cost of §c-1 heart§7.");
            lore.add("§8Cool Down: 40s");
            lore.add("§r");
            lore.add("§bIce Chunk §3§lLEFT CLICK");
            lore.add("§7Summons a §b§lChunk Of Ice §r§7 thats seals Players inside of it.");
            lore.add("§8Cool Down: 25s");
            lore.add("§r");
            lore.add("§r");
            lore.add("§3Passive Effects:");
            lore.add("§7--Attack Speed");
        }


        meta.setLore(lore);
        return meta;
    }
    public static ItemMeta getMeta7(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§5§lThe BlackMagic Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dInvisible Double Jump §5§lRIGHT CLICK");
            lore.add("§7Not just a normal double jump, it's a §l§oBlackMagic §r§7Double Jump.");
            lore.add("§8Cool Down: 15s");
            lore.add("§r");
            lore.add("§dLightning Bolt §5§lLEFT CLICK");
            lore.add("Summons a Lightning Bolt that freezes other players for §a6 seconds.");
            lore.add("§8Cool Down: 40s");
            lore.add("§r");
            lore.add("§m§8Locked Ability: Brute Potion");
            lore.add("§8Cool Down: 40s");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§8§mLocked Effect: VooDoo Morph");

        }
        if(tier==2){
            meta.setDisplayName("§5§lThe BlackMagic Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2 §r§l§eSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dInvisible Double Jump §5§lRIGHT CLICK");
            lore.add("§7Not just a normal double jump, it's a §l§oBlackMagic §r§7Double Jump.");
            lore.add("§8Cool Down: 15s");
            lore.add("§r");
            lore.add("§dLightning Bolt §5§lLEFT CLICK");
            lore.add("§7Summons a Lightning Bolt that freezes other players for §a6 seconds.");
            lore.add("§8Cool Down: 40s");
            lore.add("§r");
            lore.add("§dBrute Potion §5§lSHIFT LEFT CLICK");
            lore.add("§7Gives you §8Strength 3 §7for §a5 seconds.");
            lore.add("§8Cool Down: 35s");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§8§mLocked Effect: VooDoo Morph");
        }
        if(tier==3){
            meta.setDisplayName("§5§lThe BlackMagic Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §k§600 §r§l§6MAX TIER §r§k§600");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dInvisible Double Jump §5§lRIGHT CLICK");
            lore.add("§7Not just a normal double jump, it's a §l§oBlackMagic §r§7Double Jump.");
            lore.add("§8Cool Down: 15s");
            lore.add("§r");
            lore.add("§dLightning Bolt §5§lLEFT CLICK");
            lore.add("§7Summons a Lightning Bolt that freezes other players for §a6 seconds.");
            lore.add("§8Cool Down: 40s");
            lore.add("§r");
            lore.add("§dBrute Potion §5§lSHIFT LEFT CLICK");
            lore.add("§7Gives you §8Strength 3 §7for §a5 seconds.");
            lore.add("§8Cool Down: 30s");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7VooDo Morph:");
            lore.add("§8Gives you the ability to morph into any player you attack for 1 hour");
            lore.add("§8Cool Down: 30mn");
        }

        meta.setLore(lore);
        return meta;

    }
}
