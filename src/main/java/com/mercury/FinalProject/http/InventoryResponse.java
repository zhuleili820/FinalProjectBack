package com.mercury.FinalProject.http;

import com.mercury.FinalProject.bean.Inventory;

public class InventoryResponse extends Response{

    private Inventory inventory;

    public InventoryResponse(boolean success, Inventory inventory){
        super(success);
        this.inventory = inventory;
    }

    public Inventory getInventory(){return inventory;}

    public void setInventory(Inventory inventory){this.inventory = inventory;}


}
