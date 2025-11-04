package net.stockpile.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stockpile.StockpileMod;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StockpileMod.MODID);

    public static final Supplier<CreativeModeTab> STOCKPILE_TAB = CREATIVE_MODE_TABS.register("stockpile_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.stockpile"))
                    .icon(() -> new ItemStack(ModItems.BONE_SWORD.get()))
                    .displayItems((parameters, output) -> {
                        // ========== 6-TIER PROGRESSION SYSTEM ========== //
                        
                        // Tier 0 - Toy Sword (Fun item!)
                        output.accept(ModItems.TOY_SWORD.get());
                        
                        // Tier 1 - Bone Tools
                        output.accept(ModItems.BONE_SWORD.get());
                        output.accept(ModItems.BONE_SPEAR.get());
                        output.accept(ModItems.BONE_AXE.get());
                        output.accept(ModItems.BONE_PICKAXE.get());
                        output.accept(ModItems.BONE_SHOVEL.get());
                        output.accept(ModItems.BONE_HOE.get());
                        output.accept(ModItems.BONE_SHEARS.get());
                        output.accept(ModItems.BONE_FISHING_ROD.get());
                        output.accept(ModItems.BONE_PAXEL.get());
                        
                        // Tier 2 - Hardened Clay Tools
                        output.accept(ModItems.HARDENED_CLAY_SWORD.get());
                        output.accept(ModItems.HARDENED_CLAY_SPEAR.get());
                        output.accept(ModItems.HARDENED_CLAY_AXE.get());
                        output.accept(ModItems.HARDENED_CLAY_PICKAXE.get());
                        output.accept(ModItems.HARDENED_CLAY_SHOVEL.get());
                        output.accept(ModItems.HARDENED_CLAY_HOE.get());
                        output.accept(ModItems.HARDENED_CLAY_SHEARS.get());
                        output.accept(ModItems.HARDENED_CLAY_FISHING_ROD.get());
                        output.accept(ModItems.HARDENED_CLAY_PAXEL.get());
                        
                        // Tier 2 - Crystal Glass Tools (High risk/reward)
                        output.accept(ModItems.CRYSTAL_GLASS_SWORD.get());
                        output.accept(ModItems.CRYSTAL_GLASS_SPEAR.get());
                        output.accept(ModItems.CRYSTAL_GLASS_AXE.get());
                        output.accept(ModItems.CRYSTAL_GLASS_PICKAXE.get());
                        output.accept(ModItems.CRYSTAL_GLASS_SHOVEL.get());
                        output.accept(ModItems.CRYSTAL_GLASS_HOE.get());
                        output.accept(ModItems.CRYSTAL_GLASS_SHEARS.get());
                        output.accept(ModItems.CRYSTAL_GLASS_FISHING_ROD.get());
                        output.accept(ModItems.CRYSTAL_GLASS_PAXEL.get());
                        
                        // Tier 3 - Copper Tools (Balanced)
                        output.accept(ModItems.COPPER_SWORD.get());
                        output.accept(ModItems.COPPER_SPEAR.get());
                        output.accept(ModItems.COPPER_AXE.get());
                        output.accept(ModItems.COPPER_PICKAXE.get());
                        output.accept(ModItems.COPPER_SHOVEL.get());
                        output.accept(ModItems.COPPER_HOE.get());
                        output.accept(ModItems.COPPER_SHEARS.get());
                        output.accept(ModItems.COPPER_FISHING_ROD.get());
                        output.accept(ModItems.COPPER_PAXEL.get());
                        
                        // Tier 3 - Obsidian Alloy Tools (High Durability)
                        output.accept(ModItems.OBSIDIAN_ALLOY_SWORD.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_SPEAR.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_AXE.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_PICKAXE.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_SHOVEL.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_HOE.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_SHEARS.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_FISHING_ROD.get());
                        output.accept(ModItems.OBSIDIAN_ALLOY_PAXEL.get());
                        
                        // Tier 4 - Adamantine Tools (Emerald-Diamond Fusion)
                        output.accept(ModItems.ADAMANTINE_SWORD.get());
                        output.accept(ModItems.ADAMANTINE_SPEAR.get());
                        output.accept(ModItems.ADAMANTINE_AXE.get());
                        output.accept(ModItems.ADAMANTINE_PICKAXE.get());
                        output.accept(ModItems.ADAMANTINE_SHOVEL.get());
                        output.accept(ModItems.ADAMANTINE_HOE.get());
                        output.accept(ModItems.ADAMANTINE_SHEARS.get());
                        output.accept(ModItems.ADAMANTINE_FISHING_ROD.get());
                        output.accept(ModItems.ADAMANTINE_PAXEL.get());
                        
                        // Tier 5 - Voidsteel Tools (Balanced)
                        output.accept(ModItems.VOIDSTEEL_SWORD.get());
                        output.accept(ModItems.VOIDSTEEL_SPEAR.get());
                        output.accept(ModItems.VOIDSTEEL_AXE.get());
                        output.accept(ModItems.VOIDSTEEL_PICKAXE.get());
                        output.accept(ModItems.VOIDSTEEL_SHOVEL.get());
                        output.accept(ModItems.VOIDSTEEL_HOE.get());
                        output.accept(ModItems.VOIDSTEEL_SHEARS.get());
                        output.accept(ModItems.VOIDSTEEL_FISHING_ROD.get());
                        output.accept(ModItems.VOIDSTEEL_PAXEL.get());
                        
                        // Tier 5 - Starlight Steel Tools (Speed Focus)
                        output.accept(ModItems.STARLIGHT_STEEL_SWORD.get());
                        output.accept(ModItems.STARLIGHT_STEEL_SPEAR.get());
                        output.accept(ModItems.STARLIGHT_STEEL_AXE.get());
                        output.accept(ModItems.STARLIGHT_STEEL_PICKAXE.get());
                        output.accept(ModItems.STARLIGHT_STEEL_SHOVEL.get());
                        output.accept(ModItems.STARLIGHT_STEEL_HOE.get());
                        output.accept(ModItems.STARLIGHT_STEEL_SHEARS.get());
                        output.accept(ModItems.STARLIGHT_STEEL_FISHING_ROD.get());
                        output.accept(ModItems.STARLIGHT_STEEL_PAXEL.get());
                        
                        // Tier 6 - Dragonsteel Tools (Ultimate Tier)
                        output.accept(ModItems.DRAGONSTEEL_SWORD.get());
                        output.accept(ModItems.DRAGONSTEEL_SPEAR.get());
                        output.accept(ModItems.DRAGONSTEEL_AXE.get());
                        output.accept(ModItems.DRAGONSTEEL_PICKAXE.get());
                        output.accept(ModItems.DRAGONSTEEL_SHOVEL.get());
                        output.accept(ModItems.DRAGONSTEEL_HOE.get());
                        output.accept(ModItems.DRAGONSTEEL_SHEARS.get());
                        output.accept(ModItems.DRAGONSTEEL_FISHING_ROD.get());
                        output.accept(ModItems.DRAGONSTEEL_PAXEL.get());
                        
                        // MATERIALS
                        // Tier 1 uses vanilla bone meal (Items.BONE_MEAL) - no custom material
                        // Tier 2 Hardened Clay uses vanilla clay_ball (Items.CLAY_BALL) - no custom material
                        // Crystal Glass tools use vanilla glass_pane as material
                        // Copper tools use vanilla copper_ingot (Items.COPPER_INGOT) - no custom material
                        output.accept(ModItems.OBSIDIAN_ALLOY_INGOT.get());
                        output.accept(ModItems.ADAMANTINE_INGOT.get());
                        output.accept(ModItems.VOIDSTEEL_INGOT.get());
                        output.accept(ModItems.STARLIGHT_STEEL_INGOT.get());
                        output.accept(ModItems.DRAGONSTEEL_INGOT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}