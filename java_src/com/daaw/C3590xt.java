package com.daaw;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.daaw.xt */
/* loaded from: classes.dex */
public final class C3590xt {

    /* renamed from: a */
    public final Map<hi0, C3592b> f32938a = new HashMap();

    /* renamed from: b */
    public final C3593c f32939b = new C3593c();

    /* renamed from: com.daaw.xt$b */
    /* loaded from: classes.dex */
    public static class C3592b {

        /* renamed from: a */
        public final Lock f32940a;

        /* renamed from: b */
        public int f32941b;

        public C3592b() {
            this.f32940a = new ReentrantLock();
        }
    }

    /* renamed from: com.daaw.xt$c */
    /* loaded from: classes.dex */
    public static class C3593c {

        /* renamed from: a */
        public final Queue<C3592b> f32942a;

        public C3593c() {
            this.f32942a = new ArrayDeque();
        }

        /* renamed from: a */
        public C3592b m4529a() {
            C3592b poll;
            synchronized (this.f32942a) {
                poll = this.f32942a.poll();
            }
            return poll == null ? new C3592b() : poll;
        }

        /* renamed from: b */
        public void m4528b(C3592b c3592b) {
            synchronized (this.f32942a) {
                if (this.f32942a.size() < 10) {
                    this.f32942a.offer(c3592b);
                }
            }
        }
    }

    /* renamed from: a */
    public void m4531a(hi0 hi0Var) {
        C3592b c3592b;
        synchronized (this) {
            c3592b = this.f32938a.get(hi0Var);
            if (c3592b == null) {
                c3592b = this.f32939b.m4529a();
                this.f32938a.put(hi0Var, c3592b);
            }
            c3592b.f32941b++;
        }
        c3592b.f32940a.lock();
    }

    /* renamed from: b */
    public void m4530b(hi0 hi0Var) {
        C3592b c3592b;
        int i;
        synchronized (this) {
            c3592b = this.f32938a.get(hi0Var);
            if (c3592b != null && (i = c3592b.f32941b) > 0) {
                int i2 = i - 1;
                c3592b.f32941b = i2;
                if (i2 == 0) {
                    C3592b remove = this.f32938a.remove(hi0Var);
                    if (!remove.equals(c3592b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c3592b + ", but actually removed: " + remove + ", key: " + hi0Var);
                    }
                    this.f32939b.m4528b(remove);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot release a lock that is not held, key: ");
            sb.append(hi0Var);
            sb.append(", interestedThreads: ");
            sb.append(c3592b == null ? 0 : c3592b.f32941b);
            throw new IllegalArgumentException(sb.toString());
        }
        c3592b.f32940a.unlock();
    }
}
