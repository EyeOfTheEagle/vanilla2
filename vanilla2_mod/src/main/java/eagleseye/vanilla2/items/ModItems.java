package eagleseye.vanilla2.items;

import eagleseye.vanilla2.VanillaII;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    //Register Custom Item Group
    public static final RegistryKey<ItemGroup> VANILLAII_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
            Identifier.of(VanillaII.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.AETERNIUM_SMITHING_TEMPLATE))
            .displayName(Text.translatable("itemGroup.vanilla2"))
            .build();

    //----------Register Items----------
    //Smithing Templates
    public static final Item AETERNIUM_SMITHING_TEMPLATE = registerItem("aeternium_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.vanilla2.smithing_template.aeternium_upgrade.applies_to").formatted(Formatting.BLUE),
                    Text.translatable("item.vanilla2.smithing_template.aeternium_upgrade.ingredients").formatted(Formatting.BLUE),
                    Text.translatable("item.vanilla2.aeternium_upgrade").formatted(Formatting.GRAY),
                    Text.translatable("item.smithing_template.aeternium_upgrade.base_slot_description"),
                    Text.translatable("item.vanilla2.smithing_template.aeternium_upgrade.additions_slot_description"),
                    List.of(Identifier.of("item/empty_armor_slot_helmet"), Identifier.of("item/empty_armor_slot_chestplate"), Identifier.of("item/empty_armor_slot_leggings"), Identifier.of("item/empty_armor_slot_boots"), Identifier.of("item/empty_slot_pickaxe"), Identifier.of("item/empty_slot_shovel"), Identifier.of("item/empty_slot_axe"), Identifier.of("item/empty_slot_hoe"), Identifier.of("item/empty_slot_sword")),
                    List.of(Identifier.of("vanilla2:item/empty_aeternium_upgrade_slot"))));

    //func to easily register items
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(VanillaII.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaII.LOGGER.info("Registering Mod Items for: " + VanillaII.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, VANILLAII_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(VANILLAII_GROUP_KEY).register(itemGroup -> {

            itemGroup.add(ModItems.AETERNIUM_SMITHING_TEMPLATE);
        });
    }
}
