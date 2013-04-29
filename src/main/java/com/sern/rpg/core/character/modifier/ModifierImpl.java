package com.sern.rpg.core.character.modifier;

public class ModifierImpl implements Modifier {
    private String name;
    
    protected ModifierImpl() {
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
