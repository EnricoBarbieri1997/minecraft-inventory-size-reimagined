package com.enricobarbieri1997.inventorysizereimagined.impl;

import com.enricobarbieri1997.inventorysizereimagined.utils.ExtendableItemStackDefaultedList;
import com.enricobarbieri1997.inventorysizereimagined.utils.SortingType;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.List;

public interface IPlayerInventory {
    ExtendableItemStackDefaultedList getMainExtras();
    void setContentChanged();
    List<ItemStack> getCombinedMainNoHotbar();
    ItemStack removeExtrasStack(int slot);
    void sort(boolean ascending, SortingType sortingType);
    void needsToSync();
    void setServerPlayer(ServerPlayerEntity player);
    ServerPlayerEntity getServerPlayer();
}
