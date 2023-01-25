package dev.nevah5.zorkgame.misc.items;

import dev.nevah5.zorkgame.misc.Item;

public class ScrewItem extends Item {
    public ScrewItem(){
        super("Screw", 0.05);
    }

    @Override
    public void inspect(){
        System.out.println("It looks like you can do something with it.");
    }
}
