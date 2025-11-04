package net.stockpile.util;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.stockpile.init.ModItems;

public class ModTiers {
    
    // ========== 6-TIER PROGRESSION SYSTEM ========== //
    // Multiple materials can exist at the same tier level with different stat distributions
    
    // ========== TIER 0 - TOY (Fun item - No damage, just knockback!) ========== //
    // Made from wool - purely for fun, does no damage but still has sword knockback
    public static final Tier TOY = new SimpleTier(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            59,                                 // same as wood
            2.0F,                               // same speed as wood sword
            0.0F,                               // NO damage bonus!
            15,                                 // same as wood
            () -> Ingredient.of(net.minecraft.world.level.block.Blocks.WHITE_WOOL)
    );
    
    // ========== TIER 1 - BONE (Wood level - High damage, low durability) ========== //
    // Very accessible early-game material from skeleton drops
    // Uses vanilla bone meal for repairs (3 bone meal per bone = extremely cheap repairs!)
    public static final Tier BONE = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            80,                                 // worse than wood (59 is too low, 80 is reasonable)
            2.5F,                               // slightly faster than wood (2.0)
            1.5F,                               // HIGHER damage than wood (0.0) but less than stone (1.0)
            12,                                 // good enchantability (better than wood's 15)
            () -> Ingredient.of(Items.BONE_MEAL)
    );
    
    // ========== TIER 2 - HARDENED CLAY (Stone level - Balanced) ========== //
    // Clay-based progression using accessible clay balls
    public static final Tier HARDENED_CLAY = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            145,                                // slightly better than stone (131)
            4.2F,                               // slightly faster than stone (4.0)
            1.0F,                               // attack damage bonus
            8,                                  // better enchantability than stone (5)
            () -> Ingredient.of(Items.CLAY_BALL)
    );
    
    // ========== TIER 2 - CRYSTAL GLASS (Stone level - High risk/reward) ========== //
    // Glass-based tools: High damage/speed but very fragile (like gold tools)
    public static final Tier CRYSTAL_GLASS = new SimpleTier(
            BlockTags.INCORRECT_FOR_STONE_TOOL,
            80,                                 // VERY low durability (same as bone but different stats)
            8.0F,                               // VERY fast mining (gold = 12.0, diamond = 8.0)
            2.0F,                               // good damage for tier 2
            22,                                 // excellent enchantability (gold = 22)
            () -> Ingredient.of(Items.GLASS_PANE)
    );
    
    // ========== TIER 3 - COPPER (Iron level - Balanced) ========== //
    public static final Tier COPPER = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            240,                                // decent durability (iron = 250)
            5.8F,                               // decent speed
            1.5F,                               // decent damage
            11,                                 // good enchantability
            () -> Ingredient.of(Items.COPPER_INGOT)  // Use vanilla copper ingot
    );
    
    // ========== TIER 3 - OBSIDIAN ALLOY (Iron level - High Durability) ========== //
    // Obsidian fused with iron - emphasizes durability over speed
    public static final Tier OBSIDIAN_ALLOY = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            420,                                // HIGH durability for tier 3
            5.0F,                               // slower than copper
            1.8F,                               // higher damage than copper
            9,                                  // lower enchantability
            () -> Ingredient.of(ModItems.OBSIDIAN_ALLOY_INGOT.get())
    );
    
    // ========== TIER 4 - ADAMANTINE (Diamond level) ========== //
    // Legendary fusion of emerald's mystic power with diamond's hardness
    public static final Tier ADAMANTINE = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1750,                               // enhanced diamond durability (diamond = 1561)
            8.5F,                               // faster than diamond (8.0)
            3.2F,                               // stronger than diamond (3.0)
            18,                                 // excellent enchantability
            () -> Ingredient.of(ModItems.ADAMANTINE_INGOT.get())
    );
    
    // ========== TIER 5 - VOIDSTEEL (Netherite level - Balanced) ========== //
    // Mysterious void-forged metal with balanced excellent properties
    public static final Tier VOIDSTEEL = new SimpleTier(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2100,                               // superior to basic netherite (2031)
            9.5F,                               // faster than netherite (9.0)
            4.2F,                               // stronger than netherite (4.0)
            20,                                 // excellent enchantability
            () -> Ingredient.of(ModItems.VOIDSTEEL_INGOT.get())
    );
    
    // ========== TIER 5 - STARLIGHT STEEL (Netherite level - Speed Focus) ========== //
    // Netherite fused with gold - emphasizes speed and enchantability
    public static final Tier STARLIGHT_STEEL = new SimpleTier(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            1850,                               // lower durability than voidsteel
            11.0F,                              // VERY fast (emphasizes gold's speed)
            3.8F,                               // slightly lower damage
            25,                                 // VERY high enchantability
            () -> Ingredient.of(ModItems.STARLIGHT_STEEL_INGOT.get())
    );
    
    // ========== TIER 6 - DRAGONSTEEL (ULTIMATE TIER) ========== //
    // Forged with Dragon's Breath and the finest materials - the ultimate weapon
    // Requires multiple boss fights: Ender Dragon + 4 Withers + massive resource investment
    public static final Tier DRAGONSTEEL = new SimpleTier(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            3500,                               // INSANE durability (netherite = 2031)
            15.0F,                              // BLAZING fast mining (netherite = 9.0F)
            6.0F,                               // DEVASTATING damage (netherite = 4.0F)
            35,                                 // ULTIMATE enchantability (netherite = 15)
            () -> Ingredient.of(ModItems.DRAGONSTEEL_INGOT.get())
    );
}