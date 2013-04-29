package com.sern.rpg.core.character.enemy;

import com.sern.rpg.core.character.CharacterImpl;
import com.sern.rpg.core.character.modifier.Modifier;

public abstract class Enemy extends CharacterImpl {

    public Enemy(String name) {
        super(name);
    }
    
    public Enemy(String name, Modifier modifier) {
        super(name, modifier);
    }
    
}
