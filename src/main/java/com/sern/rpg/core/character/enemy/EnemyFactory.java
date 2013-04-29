package com.sern.rpg.core.character.enemy;

import com.sern.rpg.core.service.EnemyServiceFactory;

public abstract class EnemyFactory {
    abstract public Enemy generateEnemy();
    
    public Enemy getEnemyByName(String name) {
        return EnemyServiceFactory.getInstance().getEnemy(name);
    }
}
