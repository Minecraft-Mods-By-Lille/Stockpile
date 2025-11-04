package net.stockpile.item;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Paxel - A combination tool that functions as Pickaxe, Axe, and Shovel
 * Based on popular modded implementations like Mekanism's Paxel
 */
public class PaxelItem extends DiggerItem {
    
    public PaxelItem(Tier tier, Properties properties) {
        // Create combined tag for blocks that can be mined with pickaxe, axe, or shovel
        super(tier, BlockTags.MINEABLE_WITH_PICKAXE, properties);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        // Check if it can mine like a pickaxe, axe, or shovel
        return state.is(BlockTags.MINEABLE_WITH_PICKAXE) ||
               state.is(BlockTags.MINEABLE_WITH_AXE) ||
               state.is(BlockTags.MINEABLE_WITH_SHOVEL);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        // Return tool speed if it's an appropriate block, otherwise default
        if (isCorrectToolForDrops(stack, state)) {
            return this.getTier().getSpeed();
        }
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
        if (!level.isClientSide && state.getDestroySpeed(level, pos) != 0.0F) {
            stack.hurtAndBreak(1, entity, EquipmentSlot.MAINHAND);
        }
        return true;
    }
}