package com.sern.rpg.core.dm;

import com.sern.rpg.core.character.enemy.Enemy;
import com.sern.rpg.core.character.enemy.EnemyFactoryFactory;

public abstract class DungeonMaster {
    
    public Enemy generateEnemy() {
        Enemy enemy = null;
        enemy = EnemyFactoryFactory.getEnemyFactory().generateEnemy();
        return enemy;
    }
}
