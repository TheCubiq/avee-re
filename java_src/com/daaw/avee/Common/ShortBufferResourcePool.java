package com.daaw.avee.Common;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ShortBufferResourcePool {
    private final BlockingQueue<ShortBufferResource> pool;

    /* loaded from: classes.dex */
    public class ShortBufferResource {
        public final short[] obj;

        ShortBufferResource(short[] sArr) {
            this.obj = sArr;
        }

        public void recycle() {
            ShortBufferResourcePool.this.recycle(this);
        }
    }

    public ShortBufferResourcePool(int i) {
        this.pool = new ArrayBlockingQueue(i, true);
    }

    protected ShortBufferResource createObject(int i) {
        return new ShortBufferResource(new short[i]);
    }

    public void recycle(ShortBufferResource shortBufferResource) {
        this.pool.offer(shortBufferResource);
    }

    public ShortBufferResource acquire(int i, long j) {
        try {
            ShortBufferResource poll = this.pool.poll(j, TimeUnit.MILLISECONDS);
            if (poll != null) {
                if (poll.obj.length == i) {
                    return poll;
                }
            }
        } catch (InterruptedException unused) {
        }
        return createObject(i);
    }
}
