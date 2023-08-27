package com.daaw.avee.Common;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public abstract class ResourcePool<T> {
    private int createdObjects;
    private final ReentrantLock lock;
    private final BlockingQueue<T> pool;
    private int size;

    protected abstract T createObject();

    protected ResourcePool(int i) {
        this(i, false);
    }

    protected ResourcePool(int i, Boolean bool) {
        this.lock = new ReentrantLock();
        this.createdObjects = 0;
        this.pool = new ArrayBlockingQueue(i, true);
        this.size = i;
        if (bool.booleanValue()) {
            return;
        }
        this.lock.lock();
    }

    public T acquire() throws Exception {
        if (!this.lock.isLocked() && this.lock.tryLock()) {
            try {
                this.createdObjects++;
                return createObject();
            } finally {
                if (this.createdObjects < this.size) {
                    this.lock.unlock();
                }
            }
        }
        return this.pool.take();
    }

    public void recycle(T t) throws Exception {
        this.pool.add(t);
    }

    public void createPool() {
        if (this.lock.isLocked()) {
            for (int i = 0; i < this.size; i++) {
                this.pool.add(createObject());
                this.createdObjects++;
            }
        }
    }
}
