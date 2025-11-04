# Stockpile Mod - TODO List

## ✅ Completed Tasks

### Project Setup & Structure
- [x] Set up NeoForge 1.21.1 mod project
- [x] Register all 9 tiers of items (81+ items total)
- [x] Configure ModTiers with appropriate stats
- [x] Set up creative mode tabs
- [x] Create recipe files for all tools
- [x] Set up language file (en_us.json)
- [x] Gradle build system working

### Recent Changes
- [x] Remove hardened_clay_shard (replaced with vanilla clay_ball)
- [x] Update all hardened clay recipes to use minecraft:clay_ball
- [x] Clean up duplicate files (en_us_new.json, empty armor folders)
- [x] Mod successfully builds and loads in-game

### Loot System & Progression
- [x] Create loot table directory structure
- [x] Implement 6 loot table files:
  - [x] village_toolsmith.json (Tier 0-1)
  - [x] village_weaponsmith.json (Tier 0-1)
  - [x] simple_dungeon.json (Tier 2)
  - [x] stronghold_library.json (Tier 2-3)
  - [x] nether_bridge.json (Tier 4)
  - [x] end_city_treasure.json (Tier 4)
- [x] Create advancement directory structure
- [x] Implement 5 ingot advancements (obsidian_alloy, adamantine, voidsteel, starlight_steel, dragonsteel)
- [x] Implement ALL tool crafting advancements (80+ advancements total!)
  - [x] Tier 0 (Toy): First toy tool advancement
  - [x] Tier 1 (Bone): All bone tools (9 types)
  - [x] Tier 2 (Hardened Clay): All hardened clay tools (9 types)
  - [x] Tier 2 (Crystal Glass): All crystal glass tools (9 types)
  - [x] Tier 3 (Copper): All copper tools (9 types)
  - [x] Tier 4 (Obsidian Alloy): All obsidian alloy tools (9 types)
  - [x] Tier 4 (Adamantine): All adamantine tools (9 types)
  - [x] Tier 5 (Voidsteel): All voidsteel tools (9 types)
  - [x] Tier 5 (Starlight Steel): All starlight steel tools (9 types)
  - [x] Tier 6 (Dragonsteel): All dragonsteel tools (8 types)
- [x] Add ALL advancement translations to language file (200+ entries!)
- [x] Add witty and fitting titles/descriptions for every advancement
- [x] Create LOOT_AND_ADVANCEMENTS.md documentation

## 🚧 In Progress Tasks

### Textures & Assets
- [ ] **REDO ALL TEXTURE WORK**
  - Lost 15 hours of work due to editing in build/ folder
  - User implementing backup strategy:
    - Keep work files in separate backup location
    - Only copy finished work to src/main/resources/
  - Textures needed for:
    - All 81+ items across 9 tiers
    - Tool icons (swords, axes, pickaxes, shovels, hoes, spears, shears, fishing rods, paxels)
    - Material ingots (6 types)

### Bug Fixes
- [ ] Fix recipe format errors for material ingots
  - Error: "No key id in MapLike" for:
    - adamantine_ingot.json
    - dragonsteel_ingot.json
    - starlight_steel_ingot.json
    - voidsteel_ingot.json
    - obsidian_alloy_ingot.json
    - adamantine_paxel.json
  - Need to update JSON format to include proper "id" field in result

## 📋 Upcoming Tasks

### Testing & Validation
- [ ] Consider additional loot table locations:
  - [ ] Mineshaft chests (Tier 1-2?)
  - [ ] Desert temple (Tier 2?)
  - [ ] Jungle temple (Tier 2?)
  - [ ] Underwater ruins (Tier 2-3?)
  - [ ] Bastion remnants (Tier 4?)
  - [ ] Woodland mansion (Tier 3-4?)

### Integration & Compatibility
- [ ] **FTB Quests Mod Integration** (HIGH PRIORITY AFTER TEXTURES)
  - Research FTB Quests API/structure
  - Create quest lines for each tier
  - Design progression path:
    - Starter quests (Tier 0-1)
    - Early game quests (Tier 2-3)
    - Mid game quests (Tier 3-4)
    - Late game quests (Tier 4-5)
    - Endgame quests (Tier 5-6)
  - Link quests to advancements
  - Add quest rewards (materials, XP, etc.)
  - Test quest progression flow

### Testing & Validation
- [ ] Test all loot tables in-game
  - [ ] Generate new world
  - [ ] Visit each structure type
  - [ ] Verify items appear in chests with correct weights
  - [ ] Adjust weights if necessary based on playtesting
- [ ] Test all advancements
  - [ ] Verify ingot advancements unlock on pickup
  - [ ] Verify tool advancements unlock on craft
  - [ ] Check advancement tree display in-game
  - [ ] Test parent-child relationships work correctly
- [ ] Full mod playthrough testing
  - [ ] Tier 0-1: Early game balance
  - [ ] Tier 2-3: Mid game progression
  - [ ] Tier 4: Late game power
  - [ ] Tier 5-6: Endgame satisfaction

### Future Enhancements (Low Priority)
- [ ] Custom crafting recipes for higher tier ingots
  - How to obtain Voidsteel Ingot?
  - How to obtain Starlight Steel Ingot?
  - How to obtain Dragonsteel Ingot?
- [ ] Tool durability balancing
- [ ] Enchantability tweaking
- [ ] Sound effects for tools
- [ ] Particle effects for higher tier tools
- [ ] Tool abilities/special powers (right-click abilities?)
- [ ] Armor sets for each tier
- [ ] Block variants (ore blocks, storage blocks)

## 📝 Notes & Reminders

### File Structure
```
src/main/resources/
  ├── assets/stockpile/          (Client-side: textures, models, lang)
  │   ├── lang/en_us.json
  │   ├── models/item/
  │   └── textures/item/
  └── data/stockpile/            (Server-side: recipes, loot, advancements)
      ├── recipe/
      ├── loot_table/chest/
      └── advancement/recipes/
```

### Testing Commands
- Build mod: `./gradlew build`
- Run dev client: `./gradlew runClient`
- Locate structures: `/locate structure minecraft:village` (etc.)
- Give items: `/give @s stockpile:item_name`
- Open advancements: Press 'L' key in-game

### Next Session Goals
1. User completes texture work (with proper backup strategy)
2. Fix recipe format errors for material ingots
3. Test loot tables and advancements in-game
4. Begin FTB Quests integration research
5. Expand advancement system to cover all tools

---

**Last Updated**: Initial creation after implementing loot tables and advancements  
**Current Focus**: Waiting for user to redo texture work, then continue with testing and FTB Quests integration
