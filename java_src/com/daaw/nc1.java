package com.daaw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class nc1 {

    /* renamed from: a */
    public final BlockingQueue<C2283a> f20016a;

    /* renamed from: com.daaw.nc1$a */
    /* loaded from: classes.dex */
    public class C2283a {

        /* renamed from: a */
        public final short[] f20017a;

        public C2283a(short[] sArr) {
            this.f20017a = sArr;
        }

        /* renamed from: a */
        public void m15243a() {
            nc1.this.m15244c(this);
        }
    }

    public nc1(int i) {
        this.f20016a = new ArrayBlockingQueue(i, true);
    }

    /* renamed from: a */
    public C2283a m15246a(int i, long j) {
        try {
            C2283a poll = this.f20016a.poll(j, TimeUnit.MILLISECONDS);
            if (poll != null) {
                if (poll.f20017a.length == i) {
                    return poll;
                }
            }
        } catch (InterruptedException unused) {
        }
        return m15245b(i);
    }

    /* renamed from: b */
    public C2283a m15245b(int i) {
        return new C2283a(new short[i]);
    }

    /* renamed from: c */
    public void m15244c(C2283a c2283a) {
        this.f20016a.offer(c2283a);
    }
}
