package dev.nevah5.zorkgame.misc.items;

import dev.nevah5.zorkgame.misc.Item;

public class BoneItem extends Item {
    public BoneItem(){
        super("Bone", 2.4);
    }

    @Override
    public void inspect(){
        System.out.println("Can be used for fighting.");
    }
}
