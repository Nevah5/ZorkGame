package dev.nevah5.zorkgame.misc.items;

import dev.nevah5.zorkgame.misc.Item;

public class KeyItem extends Item {
    public KeyItem(){
        super(1, "Key", 0.02);
    }

    public void inspect(){
        System.out.println("This key can be used to open something. Who would've thought.");
    }
}
