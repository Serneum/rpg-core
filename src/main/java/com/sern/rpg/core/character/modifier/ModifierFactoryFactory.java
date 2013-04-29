package com.sern.rpg.core.character.modifier;

public abstract class ModifierFactoryFactory {
    static private ModifierFactory instance;
    
    protected ModifierFactoryFactory() {
    }
    
    public ModifierFactoryFactory(ModifierFactory factory) {
        instance = factory;
    }
    
    static public ModifierFactory getEnemyFactory() {
        return instance;
    }
    
    static public void setModifierFactory(ModifierFactory factory) {
        instance = factory;
    }
}
