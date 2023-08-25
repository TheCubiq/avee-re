package com.daaw;

import com.daaw.ay0;
import java.util.Queue;
/* renamed from: com.daaw.ra */
/* loaded from: classes.dex */
public abstract class AbstractC2840ra<T extends ay0> {

    /* renamed from: a */
    public final Queue<T> f24995a = tq1.m8867d(20);

    /* renamed from: a */
    public abstract T mo11398a();

    /* renamed from: b */
    public T m11548b() {
        T poll = this.f24995a.poll();
        return poll == null ? mo11398a() : poll;
    }

    /* renamed from: c */
    public void m11547c(T t) {
        if (this.f24995a.size() < 20) {
            this.f24995a.offer(t);
        }
    }
}
