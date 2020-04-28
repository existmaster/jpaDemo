package com.example.demo;

public class LogicSelector {
    public static SellLogic getLogic(PrintItem printItem){
        switch (printItem){
            case PRODUCT_NAME:
                return new ProductNameSellLogic();
            case PRODUCT_ID:
        }
        throw new RuntimeException();
    }
}
