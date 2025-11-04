package net.stockpile.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stockpile.StockpileMod;
import net.stockpile.util.ModTiers;
import net.stockpile.item.PaxelItem;
import net.stockpile.item.DyeableToySword;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, StockpileMod.MODID);

    // ========== TIER 0 - TOY SWORD (Fun item!) ========== //
    // Made from wool - does 0 damage but still has sword knockback for fun!
    // DYEABLE - color matches the wool used in crafting
    public static final Supplier<Item> TOY_SWORD = ITEMS.register("toy_sword",
            () -> new DyeableToySword(ModTiers.TOY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.TOY, 3, -2.4F))));

    // ========== TIER 1 - BONE TOOLS ========== //
    public static final Supplier<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new SwordItem(ModTiers.BONE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.BONE, 3, -2.4F))));
    public static final Supplier<Item> BONE_SPEAR = ITEMS.register("bone_spear",
            () -> new SwordItem(ModTiers.BONE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.BONE, 2, -2.0F))));
    public static final Supplier<Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new AxeItem(ModTiers.BONE, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.BONE, 6.0F, -3.2F))));
    public static final Supplier<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe",
            () -> new PickaxeItem(ModTiers.BONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.BONE, 1, -2.8F))));
    public static final Supplier<Item> BONE_SHOVEL = ITEMS.register("bone_shovel",
            () -> new ShovelItem(ModTiers.BONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.BONE, 1.5F, -3.0F))));
    public static final Supplier<Item> BONE_HOE = ITEMS.register("bone_hoe",
            () -> new HoeItem(ModTiers.BONE, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.BONE, 0, -3.0F))));
    public static final Supplier<Item> BONE_SHEARS = ITEMS.register("bone_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.BONE.getUses())));
    public static final Supplier<Item> BONE_FISHING_ROD = ITEMS.register("bone_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.BONE.getUses())));
    public static final Supplier<Item> BONE_PAXEL = ITEMS.register("bone_paxel",
            () -> new PaxelItem(ModTiers.BONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.BONE, 1, -2.8F))));

    // ========== TIER 2 - HARDENED CLAY TOOLS ========== //
    public static final Supplier<Item> HARDENED_CLAY_SWORD = ITEMS.register("hardened_clay_sword",
            () -> new SwordItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.HARDENED_CLAY, 3, -2.4F))));
    public static final Supplier<Item> HARDENED_CLAY_SPEAR = ITEMS.register("hardened_clay_spear",
            () -> new SwordItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.HARDENED_CLAY, 2, -2.0F))));
    public static final Supplier<Item> HARDENED_CLAY_AXE = ITEMS.register("hardened_clay_axe",
            () -> new AxeItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.HARDENED_CLAY, 6.0F, -3.2F))));
    public static final Supplier<Item> HARDENED_CLAY_PICKAXE = ITEMS.register("hardened_clay_pickaxe",
            () -> new PickaxeItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.HARDENED_CLAY, 1, -2.8F))));
    public static final Supplier<Item> HARDENED_CLAY_SHOVEL = ITEMS.register("hardened_clay_shovel",
            () -> new ShovelItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.HARDENED_CLAY, 1.5F, -3.0F))));
    public static final Supplier<Item> HARDENED_CLAY_HOE = ITEMS.register("hardened_clay_hoe",
            () -> new HoeItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.HARDENED_CLAY, 0, -3.0F))));
    public static final Supplier<Item> HARDENED_CLAY_SHEARS = ITEMS.register("hardened_clay_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.HARDENED_CLAY.getUses())));
    public static final Supplier<Item> HARDENED_CLAY_FISHING_ROD = ITEMS.register("hardened_clay_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.HARDENED_CLAY.getUses())));
    public static final Supplier<Item> HARDENED_CLAY_PAXEL = ITEMS.register("hardened_clay_paxel",
            () -> new PaxelItem(ModTiers.HARDENED_CLAY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.HARDENED_CLAY, 1, -2.8F))));

    // ========== TIER 2 - CRYSTAL GLASS TOOLS (High risk/reward) ========== //
    public static final Supplier<Item> CRYSTAL_GLASS_SWORD = ITEMS.register("crystal_glass_sword",
            () -> new SwordItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.CRYSTAL_GLASS, 3, -2.4F))));
    public static final Supplier<Item> CRYSTAL_GLASS_SPEAR = ITEMS.register("crystal_glass_spear",
            () -> new SwordItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.CRYSTAL_GLASS, 2, -2.0F))));
    public static final Supplier<Item> CRYSTAL_GLASS_AXE = ITEMS.register("crystal_glass_axe",
            () -> new AxeItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.CRYSTAL_GLASS, 6.0F, -3.2F))));
    public static final Supplier<Item> CRYSTAL_GLASS_PICKAXE = ITEMS.register("crystal_glass_pickaxe",
            () -> new PickaxeItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.CRYSTAL_GLASS, 1, -2.8F))));
    public static final Supplier<Item> CRYSTAL_GLASS_SHOVEL = ITEMS.register("crystal_glass_shovel",
            () -> new ShovelItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.CRYSTAL_GLASS, 1.5F, -3.0F))));
    public static final Supplier<Item> CRYSTAL_GLASS_HOE = ITEMS.register("crystal_glass_hoe",
            () -> new HoeItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.CRYSTAL_GLASS, 0, -3.0F))));
    public static final Supplier<Item> CRYSTAL_GLASS_SHEARS = ITEMS.register("crystal_glass_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.CRYSTAL_GLASS.getUses())));
    public static final Supplier<Item> CRYSTAL_GLASS_FISHING_ROD = ITEMS.register("crystal_glass_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.CRYSTAL_GLASS.getUses())));
    public static final Supplier<Item> CRYSTAL_GLASS_PAXEL = ITEMS.register("crystal_glass_paxel",
            () -> new PaxelItem(ModTiers.CRYSTAL_GLASS, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.CRYSTAL_GLASS, 1, -2.8F))));


    // ========== TIER 3 - COPPER TOOLS (Balanced) ========== //
    public static final Supplier<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.COPPER, 3, -2.4F))));
    public static final Supplier<Item> COPPER_SPEAR = ITEMS.register("copper_spear",
            () -> new SwordItem(ModTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.COPPER, 2, -2.0F))));
    public static final Supplier<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.COPPER, 6.0F, -3.1F))));
    public static final Supplier<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.COPPER, 1, -2.8F))));
    public static final Supplier<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModTiers.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.COPPER, 1.5F, -3.0F))));
    public static final Supplier<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.COPPER, -1, -2.0F))));
    public static final Supplier<Item> COPPER_SHEARS = ITEMS.register("copper_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.COPPER.getUses())));
    public static final Supplier<Item> COPPER_FISHING_ROD = ITEMS.register("copper_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.COPPER.getUses())));
    public static final Supplier<Item> COPPER_PAXEL = ITEMS.register("copper_paxel",
            () -> new PaxelItem(ModTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.COPPER, 1, -2.8F))));

    // ========== TIER 3 - OBSIDIAN ALLOY TOOLS (High Durability) ========== //
    public static final Supplier<Item> OBSIDIAN_ALLOY_SWORD = ITEMS.register("obsidian_alloy_sword",
            () -> new SwordItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, 3, -2.4F))));
    public static final Supplier<Item> OBSIDIAN_ALLOY_SPEAR = ITEMS.register("obsidian_alloy_spear",
            () -> new SwordItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, 2, -2.0F))));
    public static final Supplier<Item> OBSIDIAN_ALLOY_AXE = ITEMS.register("obsidian_alloy_axe",
            () -> new AxeItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, 6.0F, -3.1F))));
    public static final Supplier<Item> OBSIDIAN_ALLOY_PICKAXE = ITEMS.register("obsidian_alloy_pickaxe",
            () -> new PickaxeItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, 1, -2.8F))));
    public static final Supplier<Item> OBSIDIAN_ALLOY_SHOVEL = ITEMS.register("obsidian_alloy_shovel",
            () -> new ShovelItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, 1.5F, -3.0F))));
    public static final Supplier<Item> OBSIDIAN_ALLOY_HOE = ITEMS.register("obsidian_alloy_hoe",
            () -> new HoeItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, -1, -2.0F))));
    public static final Supplier<Item> OBSIDIAN_ALLOY_SHEARS = ITEMS.register("obsidian_alloy_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.OBSIDIAN_ALLOY.getUses())));
    public static final Supplier<Item> OBSIDIAN_ALLOY_FISHING_ROD = ITEMS.register("obsidian_alloy_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.OBSIDIAN_ALLOY.getUses())));
    public static final Supplier<Item> OBSIDIAN_ALLOY_PAXEL = ITEMS.register("obsidian_alloy_paxel",
            () -> new PaxelItem(ModTiers.OBSIDIAN_ALLOY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.OBSIDIAN_ALLOY, 1, -2.8F))));


    // ========== TIER 4 - ADAMANTINE TOOLS (Emerald-Diamond Fusion) ========== //
    public static final Supplier<Item> ADAMANTINE_SWORD = ITEMS.register("adamantine_sword",
            () -> new SwordItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.ADAMANTINE, 3, -2.4F))));
    public static final Supplier<Item> ADAMANTINE_SPEAR = ITEMS.register("adamantine_spear",
            () -> new SwordItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.ADAMANTINE, 2, -2.0F))));
    public static final Supplier<Item> ADAMANTINE_AXE = ITEMS.register("adamantine_axe",
            () -> new AxeItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.ADAMANTINE, 6.0F, -3.1F))));
    public static final Supplier<Item> ADAMANTINE_PICKAXE = ITEMS.register("adamantine_pickaxe",
            () -> new PickaxeItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.ADAMANTINE, 1, -2.8F))));
    public static final Supplier<Item> ADAMANTINE_SHOVEL = ITEMS.register("adamantine_shovel",
            () -> new ShovelItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.ADAMANTINE, 1.5F, -3.0F))));
    public static final Supplier<Item> ADAMANTINE_HOE = ITEMS.register("adamantine_hoe",
            () -> new HoeItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.ADAMANTINE, -1, -2.0F))));
    public static final Supplier<Item> ADAMANTINE_SHEARS = ITEMS.register("adamantine_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.ADAMANTINE.getUses())));
    public static final Supplier<Item> ADAMANTINE_FISHING_ROD = ITEMS.register("adamantine_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.ADAMANTINE.getUses())));
    public static final Supplier<Item> ADAMANTINE_PAXEL = ITEMS.register("adamantine_paxel",
            () -> new PaxelItem(ModTiers.ADAMANTINE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.ADAMANTINE, 1, -2.8F))));

    // ========== TIER 5 - VOIDSTEEL TOOLS (Balanced) ========== //
    public static final Supplier<Item> VOIDSTEEL_SWORD = ITEMS.register("voidsteel_sword",
            () -> new SwordItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.VOIDSTEEL, 3, -2.4F)).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_SPEAR = ITEMS.register("voidsteel_spear",
            () -> new SwordItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.VOIDSTEEL, 2, -2.0F)).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_AXE = ITEMS.register("voidsteel_axe",
            () -> new AxeItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.VOIDSTEEL, 6.0F, -3.1F)).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_PICKAXE = ITEMS.register("voidsteel_pickaxe",
            () -> new PickaxeItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.VOIDSTEEL, 1, -2.8F)).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_SHOVEL = ITEMS.register("voidsteel_shovel",
            () -> new ShovelItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.VOIDSTEEL, 1.5F, -3.0F)).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_HOE = ITEMS.register("voidsteel_hoe",
            () -> new HoeItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.VOIDSTEEL, -1, -2.0F)).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_SHEARS = ITEMS.register("voidsteel_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.VOIDSTEEL.getUses()).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_FISHING_ROD = ITEMS.register("voidsteel_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.VOIDSTEEL.getUses()).fireResistant()));
    public static final Supplier<Item> VOIDSTEEL_PAXEL = ITEMS.register("voidsteel_paxel",
            () -> new PaxelItem(ModTiers.VOIDSTEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.VOIDSTEEL, 1, -2.8F)).fireResistant()));

    // ========== TIER 5 - STARLIGHT STEEL TOOLS (Speed Focus) ========== //
    public static final Supplier<Item> STARLIGHT_STEEL_SWORD = ITEMS.register("starlight_steel_sword",
            () -> new SwordItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.STARLIGHT_STEEL, 3, -2.4F)).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_SPEAR = ITEMS.register("starlight_steel_spear",
            () -> new SwordItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.STARLIGHT_STEEL, 2, -2.0F)).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_AXE = ITEMS.register("starlight_steel_axe",
            () -> new AxeItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.STARLIGHT_STEEL, 6.0F, -3.1F)).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_PICKAXE = ITEMS.register("starlight_steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.STARLIGHT_STEEL, 1, -2.8F)).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_SHOVEL = ITEMS.register("starlight_steel_shovel",
            () -> new ShovelItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.STARLIGHT_STEEL, 1.5F, -3.0F)).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_HOE = ITEMS.register("starlight_steel_hoe",
            () -> new HoeItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.STARLIGHT_STEEL, -1, -2.0F)).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_SHEARS = ITEMS.register("starlight_steel_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.STARLIGHT_STEEL.getUses()).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_FISHING_ROD = ITEMS.register("starlight_steel_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.STARLIGHT_STEEL.getUses()).fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_PAXEL = ITEMS.register("starlight_steel_paxel",
            () -> new PaxelItem(ModTiers.STARLIGHT_STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.STARLIGHT_STEEL, 1, -2.8F)).fireResistant()));

    // ========== TIER 6 - DRAGONSTEEL TOOLS (Ultimate Tier) ========== //
    public static final Supplier<Item> DRAGONSTEEL_SWORD = ITEMS.register("dragonsteel_sword",
            () -> new SwordItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.DRAGONSTEEL, 3, -2.4F)).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_SPEAR = ITEMS.register("dragonsteel_spear",
            () -> new SwordItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(SwordItem.createAttributes(ModTiers.DRAGONSTEEL, 2, -2.0F)).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_AXE = ITEMS.register("dragonsteel_axe",
            () -> new AxeItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.DRAGONSTEEL, 6.0F, -3.1F)).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_PICKAXE = ITEMS.register("dragonsteel_pickaxe",
            () -> new PickaxeItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.DRAGONSTEEL, 1, -2.8F)).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_SHOVEL = ITEMS.register("dragonsteel_shovel",
            () -> new ShovelItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(ShovelItem.createAttributes(ModTiers.DRAGONSTEEL, 1.5F, -3.0F)).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_HOE = ITEMS.register("dragonsteel_hoe",
            () -> new HoeItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(HoeItem.createAttributes(ModTiers.DRAGONSTEEL, -1, -2.0F)).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_SHEARS = ITEMS.register("dragonsteel_shears",
            () -> new ShearsItem(new Item.Properties().durability(ModTiers.DRAGONSTEEL.getUses()).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_FISHING_ROD = ITEMS.register("dragonsteel_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().durability(ModTiers.DRAGONSTEEL.getUses()).fireResistant()));
    public static final Supplier<Item> DRAGONSTEEL_PAXEL = ITEMS.register("dragonsteel_paxel",
            () -> new PaxelItem(ModTiers.DRAGONSTEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.DRAGONSTEEL, 1, -2.8F)).fireResistant()));

    // ===== MATERIAL ITEMS =====
    // Tier 1: Bone tools use vanilla bone meal (Items.BONE_MEAL) for repairs - no custom material needed!
    
    // Tier 2 Materials
    // NOTE: Hardened Clay tools use vanilla clay_ball (Items.CLAY_BALL) - no custom item needed!
    // NOTE: Crystal Glass tools use vanilla glass_pane as material (no custom item needed)
    // NOTE: Copper tools use vanilla copper_ingot (Items.COPPER_INGOT) - no custom item needed!
    
    // Tier 3 Materials
    public static final Supplier<Item> OBSIDIAN_ALLOY_INGOT = ITEMS.register("obsidian_alloy_ingot",
            () -> new Item(new Item.Properties()));
    
    // Tier 4 Materials
    public static final Supplier<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot",
            () -> new Item(new Item.Properties()));
    
    // Tier 5 Materials
    public static final Supplier<Item> VOIDSTEEL_INGOT = ITEMS.register("voidsteel_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final Supplier<Item> STARLIGHT_STEEL_INGOT = ITEMS.register("starlight_steel_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    
    // Tier 6 Materials
    public static final Supplier<Item> DRAGONSTEEL_INGOT = ITEMS.register("dragonsteel_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}