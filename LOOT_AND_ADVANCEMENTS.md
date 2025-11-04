# Loot Tables and Advancements Implementation Summary

## Overview
This document summarizes the loot table system and advancement system implemented for the Stockpile mod, inspired by AllTheModium's structure.

## Loot Tables Implemented

### Tier Distribution Strategy
- **Tier 0 (Toy) & Tier 1 (Bone)**: Village chests (common, early game)
- **Tier 2 (Hardened Clay, Crystal Glass) & Tier 3 (Copper)**: Overworld dungeons and strongholds (mid-game)
- **Tier 4 (Obsidian Alloy, Adamantine)**: Nether fortresses and End cities (late game)
- **Tier 5 (Voidsteel, Starlight Steel) & Tier 6 (Dragonsteel)**: NOT LOOTABLE (craft-only, endgame progression)

### Loot Table Files Created

#### 1. **village_toolsmith.json**
- Location: `data/stockpile/loot_table/chest/`
- Contains: Toy and Bone tier tools (swords, axes, pickaxes, shovels, hoes)
- Rolls: 1-3 items per chest
- Weights: Toy tools more common (8-10), Bone tools less common (4-6)

#### 2. **village_weaponsmith.json**
- Location: `data/stockpile/loot_table/chest/`
- Contains: Toy and Bone weapons (swords, spears) + vanilla bones
- Rolls: 1-2 items per chest
- Weights: Toy weapons (10-12), Bone weapons (7-8), Bones (15)

#### 3. **simple_dungeon.json**
- Location: `data/stockpile/loot_table/chest/`
- Contains: Hardened Clay and Crystal Glass tools + crafting materials
- Rolls: 1-4 items per chest
- Weights: Hardened Clay (6-8), Crystal Glass (4-6), Materials (10-12)
- Materials: Clay balls (8-16), Glass blocks (4-12)

#### 4. **stronghold_library.json**
- Location: `data/stockpile/loot_table/chest/`
- Contains: Copper and Crystal Glass tools + copper ingots
- Rolls: 2-5 items per chest
- Weights: Copper tools (7-10), Crystal Glass tools (6-7), Copper ingots (15, quantity 4-12)

#### 5. **nether_bridge.json**
- Location: `data/stockpile/loot_table/chest/`
- Contains: Obsidian Alloy tools + ingots and obsidian
- Rolls: 1-3 items per chest
- Weights: Tools (5-8), Obsidian Alloy Ingots (10, quantity 1-3), Obsidian blocks (12, quantity 4-8)

#### 6. **end_city_treasure.json**
- Location: `data/stockpile/loot_table/chest/`
- Contains: Adamantine tools (including rare Paxel) + ingots
- Rolls: 2-4 items per chest
- Weights: Tools (5-9), Paxel (3 - very rare!), Adamantine Ingots (12, quantity 2-5), Obsidian Alloy Ingots (8, quantity 1-3)

## Advancements Implemented

### Material Advancements (5 total)
Located in: `data/stockpile/advancement/recipes/`

1. **obsidian_alloy_ingot.json**
   - Title: "Hellish Alloy"
   - Frame: Task (normal difficulty)
   - Trigger: Obtain Obsidian Alloy Ingot

2. **adamantine_ingot.json**
   - Title: "Unbreakable Metal"
   - Frame: Task
   - Trigger: Obtain Adamantine Ingot

3. **voidsteel_ingot.json**
   - Title: "Forged from the Void"
   - Frame: Goal (harder difficulty, purple color)
   - Trigger: Obtain Voidsteel Ingot

4. **starlight_steel_ingot.json**
   - Title: "Stellar Craftsmanship"
   - Frame: Goal
   - Trigger: Obtain Starlight Steel Ingot

5. **dragonsteel_ingot.json**
   - Title: "Dragonforged"
   - Frame: Challenge (hardest difficulty, special icon)
   - Trigger: Obtain Dragonsteel Ingot

### Tool Crafting Advancements (5 examples)
Located in: `data/stockpile/advancement/recipes/`

1. **craft_obsidian_alloy_pickaxe.json**
   - Title: "Mining the Nether"
   - Parent: Obsidian Alloy Ingot advancement
   - Trigger: Craft Obsidian Alloy Pickaxe

2. **craft_adamantine_sword.json**
   - Title: "Endgame Warrior"
   - Parent: Adamantine Ingot advancement
   - Trigger: Craft Adamantine Sword

3. **craft_voidsteel_pickaxe.json**
   - Title: "Void Excavator"
   - Parent: Voidsteel Ingot advancement
   - Frame: Goal
   - Trigger: Craft Voidsteel Pickaxe

4. **craft_starlight_steel_sword.json**
   - Title: "Starborne Blade"
   - Parent: Starlight Steel Ingot advancement
   - Frame: Goal
   - Trigger: Craft Starlight Steel Sword

5. **craft_dragonsteel_paxel.json**
   - Title: "Ultimate Multitool"
   - Parent: Dragonsteel Ingot advancement
   - Frame: Challenge
   - Trigger: Craft Dragonsteel Paxel

## Language File Updates

Added 15 new translation entries to `assets/stockpile/lang/en_us.json`:
- 5 ingot advancement titles and descriptions
- 5 tool crafting advancement titles and descriptions

## Advancement Progression Chain

The advancement system creates a logical progression:
```
minecraft:story/root
  └─> stockpile:recipes/obsidian_alloy_ingot
      └─> stockpile:recipes/craft_obsidian_alloy_pickaxe
  └─> stockpile:recipes/adamantine_ingot
      └─> stockpile:recipes/craft_adamantine_sword
  └─> stockpile:recipes/voidsteel_ingot (GOAL)
      └─> stockpile:recipes/craft_voidsteel_pickaxe
  └─> stockpile:recipes/starlight_steel_ingot (GOAL)
      └─> stockpile:recipes/craft_starlight_steel_sword
  └─> stockpile:recipes/dragonsteel_ingot (CHALLENGE)
      └─> stockpile:recipes/craft_dragonsteel_paxel
```

## Weight System Explanation

Weights control how likely an item is to appear in a chest:
- **Higher weight = More common** (e.g., basic materials: 12-15)
- **Medium weight = Uncommon** (e.g., lower tier tools: 6-8)
- **Lower weight = Rare** (e.g., higher tier tools: 3-5)
- **Very low weight = Very rare** (e.g., Adamantine Paxel: 3)

## How to Add More

### To add a new loot table:
1. Create a new JSON file in `data/stockpile/loot_table/chest/`
2. Follow the structure with pools, rolls, entries, and weights
3. The loot table will automatically inject into the corresponding vanilla chest type

### To add more tool advancements:
1. Create a new JSON file in `data/stockpile/advancement/recipes/`
2. Set the parent to the appropriate ingot advancement
3. Add translations to `en_us.json`
4. Use appropriate frame types:
   - `"task"`: Normal (brown icon)
   - `"goal"`: Important (purple icon)
   - `"challenge"`: Ultimate (gold icon with special border)

## Testing Recommendations

1. **Build the mod**: Run `./gradlew build`
2. **Start development environment**: Run `./gradlew runClient`
3. **Test loot tables**:
   - Use `/locate structure minecraft:village` to find villages
   - Use `/locate structure minecraft:stronghold` for strongholds
   - Use `/locate structure minecraft:fortress` for nether fortresses
   - Use `/locate structure minecraft:end_city` for end cities
   - Open chests and check for Stockpile items
4. **Test advancements**:
   - Use `/give @s stockpile:obsidian_alloy_ingot` (or any ingot)
   - Check if advancement unlocks (top-right notification)
   - Press 'L' key to open advancement menu
   - Craft tools and verify tool advancements unlock

## Notes

- Loot tables will NOT work in already-generated chunks; you need to explore new areas or create a new world
- Advancement triggers are "inventory_changed", meaning they activate as soon as you pick up the item
- The parent chain ensures players must get the ingot before the tool advancement shows up
- Frame types (task/goal/challenge) affect the icon appearance and should match difficulty
