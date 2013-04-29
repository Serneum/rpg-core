package com.sern.rpg.core.character.enemy;

import com.sern.rpg.core.character.CharacterImpl;

public abstract class Enemy extends CharacterImpl {

    public Enemy(String name, int health) {
        super(name, health);
    }
    
}
