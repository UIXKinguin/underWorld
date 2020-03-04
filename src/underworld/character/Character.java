/*
 * Remove unused code! Trust the process.
 */
package underworld.character;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Jeffrey Oh
 */
//attribute order goes as follows: HP, Mana, str, int, dex
public final class Character {
    private final Map<String,Integer> WAttr;
    private final Map<String,Integer> MAttr;
    private final Map<String,Integer> TAttr;
    private final Warrior w;
    private final Mage m;
    private final Thief t;
    private int charaType;
    private String charaName;

    public Character(){
        
        WAttr = new HashMap<>();
        MAttr = new HashMap<>();
        TAttr = new HashMap<>();
        
        w = new Warrior();
        m = new Mage();
        t = new Thief();
        putValues();
    }
    
    
    /**
     *
     * @return
     */
    public Map<String, Integer> getAttr(){
        
        switch (charaType) {
            case 1:
                return WAttr;
            case 2:
                return MAttr;
            default:
                return TAttr;
        }
      
    }
    
    public void setCharaType(int i){
        charaType = i;
    }
    
    public int getCharaType(){
        return charaType;
    }
    
    public void setCharaName(String name){
        charaName = name;
    }
    
    public String getCharaName(){
        return charaName;
    }
    
    public void putValues(){
        WAttr.put("Class", w.attrArray[0]);
        WAttr.put("Heath", w.attrArray[1]);
        WAttr.put("Mana", w.attrArray[2]);
        WAttr.put("Strength", w.attrArray[3]);
        WAttr.put("Intelligence", w.attrArray[4]);
        WAttr.put("Dexterity", w.attrArray[5]);

        MAttr.put("Class", m.attrArray[0]);
        MAttr.put("Heath", m.attrArray[1]);
        MAttr.put("Mana", m.attrArray[2]);
        MAttr.put("Strength", m.attrArray[3]);
        MAttr.put("Intelligence", m.attrArray[4]);
        MAttr.put("Dexterity", m.attrArray[5]);

        TAttr.put("Class", t.attrArray[0]);
        TAttr.put("Heath", t.attrArray[1]);
        TAttr.put("Mana", t.attrArray[2]);
        TAttr.put("Strength", t.attrArray[3]);
        TAttr.put("Intelligence", t.attrArray[4]);
        TAttr.put("Dexterity", t.attrArray[5]);
        }
    }



