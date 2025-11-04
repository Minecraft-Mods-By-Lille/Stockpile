package net.stockpile.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.core.component.DataComponents;

/**
 * A dyeable toy sword that can be colored based on the wool used in crafting.
 * Uses the modern data component system for dyeable items (like leather armor).
 */
public class DyeableToySword extends SwordItem {
    
    public DyeableToySword(Tier tier, Item.Properties properties) {
        super(tier, properties);
    }
    
    /**
     * Returns true to indicate this item can be dyed like leather armor.
     */
    public boolean isDyeable(ItemStack stack) {
        return true;
    }
    
    /**
     * Gets the color of this dyeable item, defaulting to light gray if no dye is applied.
     */
    public int getColor(ItemStack stack) {
        DyedItemColor dyeditemcolor = stack.get(DataComponents.DYED_COLOR);
        return dyeditemcolor != null ? dyeditemcolor.rgb() : 0xA0A0A0; // Light gray default
    }
    
    /**
     * Sets the color of this dyeable item.
     */
    public void setColor(ItemStack stack, int color) {
        stack.set(DataComponents.DYED_COLOR, new DyedItemColor(color, false));
    }
    
    /**
     * Clears the color from this dyeable item, reverting to default.
     */
    public void clearColor(ItemStack stack) {
        stack.remove(DataComponents.DYED_COLOR);
    }
}