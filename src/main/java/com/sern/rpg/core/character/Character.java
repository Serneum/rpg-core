package com.sern.rpg.core.character;

import java.util.Set;

import com.sern.rpg.core.character.modifier.Modifier;
import com.sern.rpg.core.character.special.Special;

public interface Character {

    public void setName(String name);

    public String getName();

    public void addModifier(Modifier modifier);

    public Set<Modifier> getModifiers();
    
    public void setHealth(int health);
    
    public int getHealth();
    
    public void adjustHealth(int amount);
    
    public void setBonus(int bonus);
    
    public int getBonus();
    
    public void setSpecial(Special special);
    
    public Special getSpecial();
    
    public boolean hasSpecial();

}