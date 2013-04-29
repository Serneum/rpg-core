package com.sern.rpg.core.service;

public class EnemyServiceFactory {
    static private EnemyService instance;
    
    protected EnemyServiceFactory() {
    }
    
    public EnemyServiceFactory(EnemyService factory) {
        instance = factory;
    }
    
    static public EnemyService getInstance() {
        return instance;
    }
}
