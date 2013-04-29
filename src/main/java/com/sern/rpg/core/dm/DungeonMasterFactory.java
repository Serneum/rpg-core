package com.sern.rpg.core.dm;

public class DungeonMasterFactory {
    static private DungeonMaster instance;
    
    protected DungeonMasterFactory() {
    }
    
    public DungeonMasterFactory(DungeonMaster dm) {
        instance = dm;
    }
    
    static public DungeonMaster getInstance() {
        return instance;
    }
    
    static public void setDungeonMaster(DungeonMaster dm) {
        instance = dm;
    }
}
