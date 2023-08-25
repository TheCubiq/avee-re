package com.daaw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class nc1 {
    public final BlockingQueue<a> a;

    /* loaded from: classes.dex */
    public class a {
        public final short[] a;

        public a(short[] sArr) {
            this.a = sArr;
        }

        public void a() {
            nc1.this.c(this);
        }
    }

    public nc1(int i) {
        this.a = new ArrayBlockingQueue(i, true);
    }

    public a a(int i, long j) {
        try {
            a poll = this.a.poll(j, TimeUnit.MILLISECONDS);
            if (poll != null) {
                if (poll.a.length == i) {
                    return poll;
                }
            }
        } catch (InterruptedException unused) {
        }
        return b(i);
    }

    public a b(int i) {
        return new a(new short[i]);
    }

    public void c(a aVar) {
        this.a.offer(aVar);
    }
}
