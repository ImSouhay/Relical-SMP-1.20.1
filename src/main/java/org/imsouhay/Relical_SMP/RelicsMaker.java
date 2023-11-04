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
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.plugin.java.JavaPlugin.getProvidingPlugin;


public class RelicsMaker {
    private static final NamespacedKey key= new NamespacedKey(getProvidingPlugin(Main.class), "customitem");
    
    public static ItemMeta getMeta(ItemMeta meta, int itemNum, int tier){
        return switch (itemNum){
            case 1 -> getMeta1(meta, tier);
            case 2 -> getMeta2(meta, tier);
            case 3 -> getMeta3(meta, tier);
            case 4 -> getMeta4(meta, tier);
            case 5 -> getMeta5(meta, tier);
            case 6 -> getMeta6(meta, tier);
            default -> getMeta7(meta, tier);
        };
    }
    
    private static ItemMeta getMeta1(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§4§lThe Strength Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§4Relic Ability:");
            lore.add("§cDreadful Gaze §e§lRIGHT CLICK");
            lore.add("§7Gives §fBlindness §7to Players in §a5 blocks §7radius.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§8§mLocked Ability: Life Steal");
            lore.add("§r");
            lore.add("§r");
            lore.add("§4Passive Effects:");
            lore.add("§7Strength §8§l1");
            lore.add("§7Slowness §8§l1");
        }
        if(tier==2){
            meta.setDisplayName("§4§lThe Strength Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§4Relic Ability:");
            lore.add("§cDreadful Gaze §e§lRIGHT CLICK");
            lore.add("§7Gives §fBlindness §7to Players in §a10 blocks §7radius.");
            lore.add("§a25s §8CoolDown.");
            lore.add("§r");
            lore.add("§8§mLocked Ability: Life Steal");
            lore.add("§r");
            lore.add("§r");
            lore.add("§4Passive Effects:");
            lore.add("§7Strength §8§l2");
            lore.add("§7Slowness §8§l1");
        }
        if(tier==3){
            meta.setDisplayName("§4§lThe Strength Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§4Relic Abilities:");
            lore.add("§cDreadful Gaze §e§lRIGHT CLICK");
            lore.add("§7Gives §fBlindness §7to Players in §a5 blocks §7radius.");
            lore.add("§a25s §8CoolDown.");
            lore.add("§r");
            lore.add("§cLife Steal §e§lLEFT CLICK §r§con enemy");
            lore.add("§7Steals 5 of the enemy's hearts for §a5 seconds§7.");
            lore.add("§a1mn §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§4Passive Effects:");
            lore.add("§7Strength §8§l3");
            lore.add("§7Slowness §8§l2");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Strength-"+tier);

        meta.setLore(lore);
        return meta;
    }
    private static ItemMeta getMeta2(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§a§lThe Wealth Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§2Relic Ability:");
            lore.add("§aVenomous Fortune §e§lRIGHT CLICK");
            lore.add("§7Gives §fPoison 2 §7to Players in §a5 blocks §7radius for §a5 seconds§7.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§2Passive Effects:");
            lore.add("§7Hero Of The Village §8§l1");
            lore.add("§8§l8 §r§7Hearts only");
        }
        if(tier==2){
            meta.setDisplayName("§a§lThe Wealth Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§2Relic Ability:");
            lore.add("§aVenomous Fortune §e§lRIGHT CLICK");
            lore.add("§7Gives §fPoison 2 §7to Players in §a10 blocks §7radius for §a10 seconds§7.");
            lore.add("§a25s §8CoolDown.");
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
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§2Relic Ability:");
            lore.add("§aVenomous Fortune §e§lRIGHT CLICK");
            lore.add("§7Gives §fPoison 3 §7to Players in §a10 blocks §7radius for §a10 seconds§7.");
            lore.add("§a20s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§2Passive Effects:");
            lore.add("§7Hero Of The Village §8§l5");
            lore.add("§7Luck §8§l1");
            lore.add("§8§l9 §r§7Hearts only");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Wealth-"+tier);

        meta.setLore(lore);
        return meta;
    }
    private static ItemMeta getMeta3(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§f§lThe Speed Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fFatigue Aura §e§lRIGHT CLICK");
            lore.add("§7Gives §fMining Fatigue §7to Players in §a5 blocks §7radius.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Speed §8§l2");
            lore.add("§7Weakness §8§l1");
        }
        if(tier==2){
            meta.setDisplayName("§f§lThe Speed Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fFatigue Aura §e§lRIGHT CLICK");
            lore.add("§7Gives §fMining Fatigue §7to Players in §a10 blocks §7radius.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Speed §8§l3");
            lore.add("§7Weakness §8§l1");
        }
        if(tier==3){
            meta.setDisplayName("§f§lThe Speed Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fFatigue Aura §e§lRIGHT CLICK");
            lore.add("§7Gives §fMining Fatigue §7to Players in §a10 blocks §7radius.");
            lore.add("§a25s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Speed §8§l3");
            lore.add("§7Weakness §8§l1");
            lore.add("§7Haste §8§l3");
            lore.add("§a+§7Attack Speed");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Speed-"+tier);

        meta.setLore(lore);
        return meta;
    }
    private static ItemMeta getMeta4(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§d§lThe Regeneration Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§5Relic Ability:");
            lore.add("§dReversed Healing Technique §e§lRIGHT CLICK");
            lore.add("§7Gives §fThe Withering Effect 1 §7to Players in §a5 blocks §7radius for §a5 seconds§7.");
            lore.add("§a50s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7Regeneration §8§l1");
            lore.add("§7Glowing");

        }
        if(tier==2){
            meta.setDisplayName("§d§lThe Regeneration Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§5Relic Ability:");
            lore.add("§dReversed Healing Technique §e§lRIGHT CLICK");
            lore.add("§7Gives §fThe Withering Effect 3 §7to Players in §a10 blocks §7radius for §a5 seconds§7.");
            lore.add("§a45s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7Regeneration §8§l2");
            lore.add("§7Glowing");
        }
        if(tier==3){
            meta.setDisplayName("§d§lThe Regeneration Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dReversed Healing Technique §e§lRIGHT CLICK");
            lore.add("§7Gives §fThe Withering Effect 4 §7to Players in §a10 blocks §7radius for §a5 seconds§7.");
            lore.add("§a35s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7Regeneration §8§l3");
            lore.add("§7Glowing");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Regeneration-"+tier);

        meta.setLore(lore);
        return meta;
    }
    private static ItemMeta getMeta5(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§8§lThe Phantom Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fSummoner §e§lRIGHT CLICK");
            lore.add("§7Summons §f4 Phantoms §7that attack other players and despawn after 2 minutes.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Slow Falling");
            lore.add("§7Invisibility");
        }
        if(tier==2){
            meta.setDisplayName("§8§lThe Phantom Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fSummoner §e§lRIGHT CLICK");
            lore.add("§7Summons §f6 Phantoms §7that attack other players and despawn after 3 minutes.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Slow Falling");
            lore.add("§7Invisibility");
        }
        if(tier==3){
            meta.setDisplayName("§8§lThe Phantom Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§8Relic Ability:");
            lore.add("§fSummoner §e§lRIGHT CLICK");
            lore.add("§7Summons §f9 Phantoms §7that attack other players and despawn after 5 minutes.");
            lore.add("§a25s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§8Passive Effects:");
            lore.add("§7Slow Falling");
            lore.add("§7Invisibility");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Phantom-"+tier);

        meta.setLore(lore);
        return meta;
    }
    private static ItemMeta getMeta6(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§b§lThe Ice Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§3Relic Ability:");
            lore.add("§bIcicles Bolt §e§lRIGHT CLICK");
            lore.add("§7Shoots deadly Icicles that freeze enemies, for the cost of §c-1 heart §7.");
            lore.add("§a50s §8CoolDown.");
            lore.add("§r");
            lore.add("§bIce Chunk §e§lLEFT CLICK");
            lore.add("§7Summons a §b§lChunk Of Ice §r§7that seals Players inside of it.");
            lore.add("§a40s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§3Passive Effects:");
            lore.add("§c-§7Attack Speed");
        }
        if(tier==2){
            meta.setDisplayName("§b§lThe Ice Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§3Relic Ability:");
            lore.add("§bIcicles Bolt §e§lRIGHT CLICK");
            lore.add("§7Shoots deadly Icicles that freeze enemies, for the cost of §c-1 heart§7.");
            lore.add("§a40s §8CoolDown.");
            lore.add("§r");
            lore.add("§bIce Chunk §e§lLEFT CLICK");
            lore.add("§7Summons a §b§lChunk Of Ice §r§7that seals Players inside of it.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§3Passive Effects:");
            lore.add("§c-§7Attack Speed");
        }

        if(tier==3){
            meta.setDisplayName("§b§lThe Ice Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§3Relic Ability:");
            lore.add("§bIcicles Bolt §e§lRIGHT CLICK");
            lore.add("§7Shoots deadly Icicles that freeze enemies, for the cost of §c-1 heart§7.");
            lore.add("§a40s §8CoolDown.");
            lore.add("§r");
            lore.add("§bIce Chunk §e§lLEFT CLICK");
            lore.add("§7Summons a §b§lChunk Of Ice §r§7that seals Players inside of it.");
            lore.add("§a25s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§3Passive Effects:");
            lore.add("§c-§7Attack Speed");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Ice-"+tier);


        meta.setLore(lore);
        return meta;
    }
    private static ItemMeta getMeta7(ItemMeta meta, int tier){
        meta.setLore(null);

        List<String> lore=new ArrayList<>();
        if(tier==1) {
            meta.setDisplayName("§5§lThe BlackMagic Relic I");
            lore.add("§r");
            lore.add("§7Relic tier 1");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dInvisible Double Jump §e§lRIGHT CLICK");
            lore.add("§7Not just a normal Double Jump, it's a §f§l§oBlackMagic §r§7Double Jump.");
            lore.add("§a15s §8CoolDown.");
            lore.add("§r");
            lore.add("§dLightning Bolt §e§lLEFT CLICK");
            lore.add("§7Summons a Lightning Bolt that freezes other players for §a6 seconds§7.");
            lore.add("§a40s §8CoolDown.");
            lore.add("§r");
            lore.add("§8§mLocked Ability: Brute Potion");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§8§mLocked Effect: VooDoo Morph");

        }
        if(tier==2){
            meta.setDisplayName("§5§lThe BlackMagic Relic II");
            lore.add("§r");
            lore.add("§7Relic tier 2");
            lore.add("§e§lSHIFT RIGHT CLICK §r§7to view upgrading recipe.");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dInvisible Double Jump §e§lRIGHT CLICK");
            lore.add("§7Not just a normal double jump, it's a §f§l§oBlackMagic §r§7Double Jump.");
            lore.add("§a15s §8CoolDown.");
            lore.add("§r");
            lore.add("§dLightning Bolt §e§lLEFT CLICK");
            lore.add("§7Summons a Lightning Bolt that freezes other players for §a6 seconds§7.");
            lore.add("§a40s §8CoolDown.");
            lore.add("§r");
            lore.add("§dBrute Potion §e§lSHIFT LEFT CLICK");
            lore.add("§7Gives you §fStrength 3 §7for §a5 seconds§7.");
            lore.add("§a35s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§8§mLocked Effect: VooDoo Morph");
        }
        if(tier==3){
            meta.setDisplayName("§5§lThe BlackMagic Relic III");
            lore.add("§r");
            lore.add("§7Relic tier 3. §6§k00 §r§l§6MAX TIER §r§6§k00");
            lore.add("§r");
            lore.add("§5Relic Abilities:");
            lore.add("§dInvisible Double Jump §e§lRIGHT CLICK");
            lore.add("§7Not just a normal double jump, it's a §f§l§oBlackMagic §r§7Double Jump.");
            lore.add("§a10s §8CoolDown.");
            lore.add("§r");
            lore.add("§dLightning Bolt §e§lLEFT CLICK");
            lore.add("§7Summons a Lightning Bolt that freezes other players for §a6 seconds§7.");
            lore.add("§a40s §8CoolDown.");
            lore.add("§r");
            lore.add("§dBrute Potion §e§lSHIFT LEFT CLICK");
            lore.add("§7Gives you §fStrength 3 §7for §a5 seconds§7.");
            lore.add("§a30s §8CoolDown.");
            lore.add("§r");
            lore.add("§r");
            lore.add("§5Passive Effects:");
            lore.add("§7VooDo Morph:");
            lore.add("§8§oGives you the ability to morph into any player you attack for 1 hour.");
            lore.add("§a30mn §8CoolDown.");
        }
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "BlackMagic-"+tier);

        meta.setLore(lore);
        return meta;

    }
}
