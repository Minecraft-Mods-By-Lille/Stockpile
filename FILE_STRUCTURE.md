# Stockpile Mod - File Structure Overview

## Complete Directory Structure

```
Stockpile/
├── src/main/
│   ├── java/com/yourname/stockpile/
│   │   ├── Stockpile.java                    (Main mod class)
│   │   ├── item/
│   │   │   ├── ModItems.java                 (Item registry - 81+ items)
│   │   │   ├── ModCreativeTabs.java          (Creative tab setup)
│   │   │   ├── custom/
│   │   │   │   ├── PaxelItem.java           (Custom paxel tool)
│   │   │   │   └── DyeableToySword.java     (Colored toy sword)
│   │   └── util/
│   │       └── ModTiers.java                 (Tool tier definitions)
│   │
│   └── resources/
│       ├── assets/stockpile/                 [CLIENT-SIDE]
│       │   ├── lang/
│       │   │   └── en_us.json               ✅ (Translations for items + advancements)
│       │   ├── models/item/
│       │   │   ├── toy_sword.json
│       │   │   ├── bone_sword.json
│       │   │   ├── ... (81+ model files)
│       │   │   └── dragonsteel_paxel.json
│       │   └── textures/item/
│       │       ├── toy_sword.png             ⚠️ (NEEDS REDO)
│       │       ├── bone_sword.png
│       │       ├── ... (81+ texture files)
│       │       └── dragonsteel_paxel.png
│       │
│       └── data/stockpile/                   [SERVER-SIDE]
│           ├── recipe/                       ✅ (All recipes done)
│           │   ├── toy_sword.json
│           │   ├── bone_sword.json
│           │   ├── ... (80+ recipe files)
│           │   └── dragonsteel_paxel.json
│           │
│           ├── loot_table/                   ✅ NEW!
│           │   └── chest/
│           │       ├── village_toolsmith.json
│           │       ├── village_weaponsmith.json
│           │       ├── simple_dungeon.json
│           │       ├── stronghold_library.json
│           │       ├── nether_bridge.json
│           │       └── end_city_treasure.json
│           │
│           └── advancement/                  ✅ NEW!
│               └── recipes/
│                   ├── obsidian_alloy_ingot.json
│                   ├── adamantine_ingot.json
│                   ├── voidsteel_ingot.json
│                   ├── starlight_steel_ingot.json
│                   ├── dragonsteel_ingot.json
│                   ├── craft_obsidian_alloy_pickaxe.json
│                   ├── craft_adamantine_sword.json
│                   ├── craft_voidsteel_pickaxe.json
│                   ├── craft_starlight_steel_sword.json
│                   └── craft_dragonsteel_paxel.json
│
├── build/                                    ⚠️ NEVER EDIT HERE!
│   └── (Gradle-generated temporary files)
│
├── Documentation Files:
│   ├── README.md                            (Project overview)
│   ├── TIER_SYSTEM.md                       (Tier stats and progression)
│   ├── DESIGN_EXPLANATIONS.md               (Design decisions)
│   ├── ASSET_STATUS_REPORT.md               (Asset tracking)
│   ├── LOOT_AND_ADVANCEMENTS.md            ✅ NEW! (Loot/advancement guide)
│   └── TODO.md                              ✅ NEW! (Task tracker)
│
└── Build Configuration:
    ├── build.gradle                         (Build configuration)
    ├── gradle.properties                    (Gradle properties)
    ├── settings.gradle                      (Project settings)
    └── gradlew.bat                          (Gradle wrapper)
```

## Key Locations by Feature

### 🎮 Gameplay Features

**Item Registration**
- Code: `src/main/java/.../item/ModItems.java`
- Models: `src/main/resources/assets/stockpile/models/item/`
- Textures: `src/main/resources/assets/stockpile/textures/item/`
- Translations: `src/main/resources/assets/stockpile/lang/en_us.json`

**Tool Stats & Tiers**
- Code: `src/main/java/.../util/ModTiers.java`
- Documentation: `TIER_SYSTEM.md`

**Crafting Recipes**
- Location: `src/main/resources/data/stockpile/recipe/`
- Format: JSON with shaped/shapeless patterns
- Count: 80+ recipe files

**Loot Tables** ✅ NEW!
- Location: `src/main/resources/data/stockpile/loot_table/chest/`
- Format: JSON with pools, rolls, entries, weights
- Count: 6 chest types (village, dungeon, stronghold, nether, end)

**Advancements** ✅ NEW!
- Location: `src/main/resources/data/stockpile/advancement/recipes/`
- Format: JSON with criteria and triggers
- Count: 10 advancements (5 ingots + 5 tools)
- Chain: Parent-child progression trees

### 📊 Data Organization

**Client-Side Files** (assets/stockpile/)
- Visuals: textures, models
- Language: translations
- User-facing content

**Server-Side Files** (data/stockpile/)
- Mechanics: recipes, loot tables, advancements
- Game logic and progression
- World generation integration

## Current Status Legend

- ✅ = Complete and working
- ⚠️ = In progress / needs work
- 🔄 = Needs testing
- ❌ = Not started
- 🔥 = Critical / High priority

## Quick Navigation Guide

### To add a new item:
1. Register in `ModItems.java`
2. Create model in `assets/stockpile/models/item/`
3. Create texture in `assets/stockpile/textures/item/`
4. Add translation in `assets/stockpile/lang/en_us.json`
5. Create recipe in `data/stockpile/recipe/`

### To add a new loot table:
1. Create JSON in `data/stockpile/loot_table/chest/`
2. Follow pool/roll/entry structure
3. Set appropriate weights for rarity
4. Test in new world/unexplored chunks

### To add a new advancement:
1. Create JSON in `data/stockpile/advancement/recipes/`
2. Set parent advancement (if chained)
3. Define criteria and trigger
4. Add translations in `assets/stockpile/lang/en_us.json`
5. Choose frame type (task/goal/challenge)

### To test changes:
1. Run `./gradlew build` to compile
2. Run `./gradlew runClient` to test
3. Or copy JAR from `build/libs/` to Minecraft mods folder

## Important Reminders

### ⚠️ Build Folder Warning
**NEVER EDIT FILES IN build/ FOLDER!**
- The `build/` folder is TEMPORARY
- Gradle deletes and regenerates it completely
- Any edits here will be LOST FOREVER
- Always edit in `src/` folder only

### 💾 Backup Strategy
1. Keep work-in-progress files OUTSIDE the project
2. Only copy finished work to `src/` folder
3. Use version control (Git) for safety
4. Test frequently to catch issues early

### 🔨 Build Commands
```powershell
# Clean build files
./gradlew clean

# Build the mod
./gradlew build

# Run development client
./gradlew runClient

# Run development server
./gradlew runServer
```

### 🎮 In-Game Testing Commands
```
/locate structure minecraft:village
/locate structure minecraft:stronghold  
/locate structure minecraft:fortress
/locate structure minecraft:end_city
/give @s stockpile:adamantine_sword
/advancement grant @s only stockpile:recipes/adamantine_ingot
```

---

**Last Updated**: After implementing loot tables and advancements  
**Current Status**: Awaiting texture work completion, then testing phase
