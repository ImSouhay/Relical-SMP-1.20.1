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
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CustomRelics {

    // Ignore the chaos down here :-)

    public static final ItemStack customItem1_1=new ItemStack(Material.RED_DYE);
    public static final ItemStack customItem1_2=new ItemStack(Material.RED_DYE);
    public static final ItemStack customItem1_3=new ItemStack(Material.RED_DYE);


    public static final ItemStack customItem2_1=new ItemStack(Material.LIME_DYE);
    public static final ItemStack customItem2_2=new ItemStack(Material.LIME_DYE);
    public static final ItemStack customItem2_3=new ItemStack(Material.LIME_DYE);


    public static final ItemStack customItem3_1=new ItemStack(Material.GREEN_DYE);
    public static final ItemStack customItem3_2=new ItemStack(Material.GREEN_DYE);
    public static final ItemStack customItem3_3=new ItemStack(Material.GREEN_DYE);


    public static final ItemStack customItem4_1=new ItemStack(Material.PINK_DYE);
    public static final ItemStack customItem4_2=new ItemStack(Material.PINK_DYE);
    public static final ItemStack customItem4_3=new ItemStack(Material.PINK_DYE);


    public static final ItemStack customItem5_1=new ItemStack(Material.BLACK_DYE);
    public static final ItemStack customItem5_2=new ItemStack(Material.BLACK_DYE);
    public static final ItemStack customItem5_3=new ItemStack(Material.BLACK_DYE);


    public static final ItemStack customItem6_1=new ItemStack(Material.LIGHT_BLUE_DYE);
    public static final ItemStack customItem6_2=new ItemStack(Material.LIGHT_BLUE_DYE);
    public static final ItemStack customItem6_3=new ItemStack(Material.LIGHT_BLUE_DYE);


    public static final ItemStack customItem7_1=new ItemStack(Material.PURPLE_DYE);
    public static final ItemStack customItem7_2=new ItemStack(Material.PURPLE_DYE);
    public static final ItemStack customItem7_3=new ItemStack(Material.PURPLE_DYE);


    // This will make the custom items

    private static void makeItem1_1(){
        ItemMeta meta = customItem1_1.getItemMeta();
        customItem1_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem1_1.setItemMeta(RelicsMaker.getMeta1(meta, 1));
    }
    private static void makeItem1_2(){
        ItemMeta meta = customItem1_2.getItemMeta();
        customItem1_2.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem1_2.setItemMeta(RelicsMaker.getMeta1(meta, 2));
    }
    private static void makeItem1_3(){
        ItemMeta meta = customItem1_1.getItemMeta();
        customItem1_3.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem1_3.setItemMeta(RelicsMaker.getMeta1(meta, 3));
    }


    private static void makeItem2_1(){
        ItemMeta meta = customItem2_1.getItemMeta();
        customItem2_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem2_1.setItemMeta(RelicsMaker.getMeta2(meta, 1));
    }
    private static void makeItem2_2(){
        ItemMeta meta = customItem2_2.getItemMeta();
        customItem2_2.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem2_2.setItemMeta(RelicsMaker.getMeta2(meta, 2));
    }
    private static void makeItem2_3(){
        ItemMeta meta = customItem2_3.getItemMeta();
        customItem2_3.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem2_3.setItemMeta(RelicsMaker.getMeta2(meta, 3));
    }


    private static void makeItem3_1(){
        ItemMeta meta = customItem3_1.getItemMeta();
        customItem3_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem3_1.setItemMeta(RelicsMaker.getMeta3(meta, 1));
    }
    private static void makeItem3_2(){
        ItemMeta meta = customItem3_2.getItemMeta();
        customItem3_2.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem3_2.setItemMeta(RelicsMaker.getMeta3(meta, 2));
    }
    private static void makeItem3_3(){
        ItemMeta meta = customItem3_3.getItemMeta();
        customItem3_3.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem3_3.setItemMeta(RelicsMaker.getMeta3(meta, 3));
    }


    private static void makeItem4_1(){
        ItemMeta meta = customItem4_1.getItemMeta();
        customItem4_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem4_1.setItemMeta(RelicsMaker.getMeta4(meta, 1));
    }
    private static void makeItem4_2(){
        ItemMeta meta = customItem4_2.getItemMeta();
        customItem4_2.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem4_2.setItemMeta(RelicsMaker.getMeta4(meta, 2));
    }
    private static void makeItem4_3(){
        ItemMeta meta = customItem4_3.getItemMeta();
        customItem4_3.addUnsafeEnchantment(Enchantment.VANISHING_CURSE,1);
        assert meta != null;

        customItem4_3.setItemMeta(RelicsMaker.getMeta4(meta, 3));
    }


    private static void makeItem5_1(){
        ItemMeta meta=customItem5_1.getItemMeta();
        customItem5_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem5_1.setItemMeta(RelicsMaker.getMeta5(meta, 1));
    }
    private static void makeItem5_2(){
        ItemMeta meta=customItem5_2.getItemMeta();
        customItem5_2.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem5_2.setItemMeta(RelicsMaker.getMeta5(meta, 2));
    }
    private static void makeItem5_3(){
        ItemMeta meta=customItem5_3.getItemMeta();
        customItem5_3.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem5_3.setItemMeta(RelicsMaker.getMeta5(meta, 3));
    }

    private static void makeItem6_1(){
        ItemMeta meta=customItem6_1.getItemMeta();
        customItem6_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem6_1.setItemMeta(RelicsMaker.getMeta6(meta, 1));
    }


    private static void makeItem7_1(){
        ItemMeta meta=customItem7_1.getItemMeta();
        customItem7_1.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem7_1.setItemMeta(RelicsMaker.getMeta7(meta, 1));
    }
    private static void makeItem7_2(){
        ItemMeta meta=customItem7_2.getItemMeta();
        customItem7_2.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem7_2.setItemMeta(RelicsMaker.getMeta7(meta, 2));
    }
    private static void makeItem7_3(){
        ItemMeta meta=customItem7_3.getItemMeta();
        customItem7_3.addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
        assert meta != null;

        customItem7_3.setItemMeta(RelicsMaker.getMeta7(meta, 3));
    }


    public static void makeCustomItems(){


    }

    public static ItemStack getCustomItem1(int tier){
        return switch (tier) {
            case 1 -> customItem1_1;
            case 2 -> customItem1_2;
            default -> customItem1_3;
        };
    }
    public static ItemStack getCustomItem2(){
        return customItem2_3;
    }
    public static ItemStack getCustomItem3(){
        return customItem3_3;
    }
    public static ItemStack getCustomItem4(){
        return customItem4;
    }

    public static ItemStack getRandomCustomItem(){
        int i= new Random().nextInt(4)+1;
        if(i==1){return customItem1_3;}
        if(i==2){return customItem2_3;}
        if(i==3){return customItem3_3;}
        return customItem4;

    }




}
