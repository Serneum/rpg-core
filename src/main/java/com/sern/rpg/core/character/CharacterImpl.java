package com.sern.rpg.core.character;

import com.sern.rpg.core.character.modifier.Modifier;

public class CharacterImpl implements Character {
    private String name;
    private Modifier modifier;
    
    public CharacterImpl(String name) {
        this.name = name;
    }
    
    public CharacterImpl(String name, Modifier modifier) {
        this.name = name;
        this.modifier = modifier;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }
    
    @Override
    public Modifier getModifier() {
        return modifier;
    }
}
