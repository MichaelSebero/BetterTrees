package com.ferreusveritas.dynamictrees;

import com.ferreusveritas.dynamictrees.api.BoneMealHelper;
import com.ferreusveritas.dynamictrees.items.DendroPotion;
import com.ferreusveritas.dynamictrees.items.DirtBucket;
import com.ferreusveritas.dynamictrees.items.Staff;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = ModConstants.MODID)
public class ModItems {

	public static DendroPotion dendroPotion;
	public static DirtBucket dirtBucket;
	public static Staff treeStaff;
	
	public static void preInit() {
		dendroPotion = new DendroPotion();//Potions
		dirtBucket = new DirtBucket();//Dirt Bucket
		treeStaff = new Staff();//Creative Mode Staff
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();

		ArrayList<Item> treeItems = new ArrayList<Item>();
		ModTrees.baseFamilies.forEach(tree -> tree.getRegisterableItems(treeItems));
		ModTrees.dynamicCactus.getRegisterableItems(treeItems);

		registry.registerAll(dendroPotion, dirtBucket, treeStaff);
		registry.registerAll(treeItems.toArray(new Item[0]));
		
		BoneMealHelper.addItem(Items.DYE, 15);
	}

}