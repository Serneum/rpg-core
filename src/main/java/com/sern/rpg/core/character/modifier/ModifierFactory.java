package com.sern.rpg.core.character.modifier;

import com.sern.rpg.core.service.ModifierServiceFactory;

public abstract class ModifierFactory {
    abstract public Modifier generateModifier();
    
    public Modifier getModifierByName(String name) {
        return ModifierServiceFactory.getInstance().getModifier(name);
    }
}
