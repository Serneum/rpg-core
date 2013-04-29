package com.sern.rpg.core.service;

public class ModifierServiceFactory {
    static private ModifierService instance;
    
    protected ModifierServiceFactory() {
    }
    
    public ModifierServiceFactory(ModifierService factory) {
        instance = factory;
    }
    
    static public ModifierService getInstance() {
        return instance;
    }
}
