package com.sern.rpg.core.character.enemy;

public abstract class EnemyFactoryFactory {
    static private EnemyFactory instance;
    
    protected EnemyFactoryFactory() {
    }
    
    public EnemyFactoryFactory(EnemyFactory factory) {
        instance = factory;
    }
    
    static public EnemyFactory getEnemyFactory() {
        return instance;
    }
    
    static public void setEnemyFactory(EnemyFactory factory) {
        instance = factory;
    }
}
