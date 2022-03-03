package com.lessons.lesson3;

/**
public class MyStorageSystem extends StorageSystem{
    public MyStorageSystem(int[] storage) {
        super(storage);
    }

    @Override
    public int get(int amount) {
        int prev = NULL, block = free;
        for (; block != NULL && buffer[block] < amount + 1;
             prev = block, block = buffer[block + 1])
            ;
        if (block == NULL) return NULL;
        if (buffer[block] < amount + 3) {
            if (prev == NULL) free = buffer[block + 1];
            else buffer[prev + 1] = buffer[block + 1];
            return block + 1;} else {buffer[block] -= amount + 1;
            buffer[block + buffer[block]] = amount + 1;
            return block + buffer[block] + 1;
        }
    }


    @Override
    public void free(int block) {
        buffer[block] = free;
        free = block-1;
    }

}
 */