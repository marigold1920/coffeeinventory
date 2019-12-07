package coffee.inventory.service;

import java.util.Collection;

import coffee.inventory.entity.WarehouseItem;

public interface WarehouseItemService {
    Collection<WarehouseItem> findWarehouseItemsById(int warehouseId, Integer... warehouseItemIds);
}