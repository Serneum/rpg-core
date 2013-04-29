package com.sern.rpg.core.character;

import com.sern.rpg.core.character.modifier.Modifier;

public interface Character {

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setModifier(Modifier modifier);

    public abstract Modifier getModifier();

}