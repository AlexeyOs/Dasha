package com.lessons.lesson3;

abstract class StorageSystem {
    protected int[] buffer;  // Это вся память, участки которой используются.
    public final int NULL = -1;

    public StorageSystem(int[] storage) {
        buffer = storage;
    }

    // запрос на участок памяти длиной в amount слов.
    public abstract int get(int amount);

    // освобождение ранее выданного участка памяти.
    public abstract void free(int block);
}

