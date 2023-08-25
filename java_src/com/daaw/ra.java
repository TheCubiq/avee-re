package com.daaw;

import com.daaw.ay0;
import java.util.Queue;
/* loaded from: classes.dex */
public abstract class ra<T extends ay0> {
    public final Queue<T> a = tq1.d(20);

    public abstract T a();

    public T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
