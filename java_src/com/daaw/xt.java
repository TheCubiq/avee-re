package com.daaw;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class xt {
    public final Map<hi0, b> a = new HashMap();
    public final c b = new c();

    /* loaded from: classes.dex */
    public static class b {
        public final Lock a;
        public int b;

        public b() {
            this.a = new ReentrantLock();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final Queue<b> a;

        public c() {
            this.a = new ArrayDeque();
        }

        public b a() {
            b poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new b() : poll;
        }

        public void b(b bVar) {
            synchronized (this.a) {
                if (this.a.size() < 10) {
                    this.a.offer(bVar);
                }
            }
        }
    }

    public void a(hi0 hi0Var) {
        b bVar;
        synchronized (this) {
            bVar = this.a.get(hi0Var);
            if (bVar == null) {
                bVar = this.b.a();
                this.a.put(hi0Var, bVar);
            }
            bVar.b++;
        }
        bVar.a.lock();
    }

    public void b(hi0 hi0Var) {
        b bVar;
        int i;
        synchronized (this) {
            bVar = this.a.get(hi0Var);
            if (bVar != null && (i = bVar.b) > 0) {
                int i2 = i - 1;
                bVar.b = i2;
                if (i2 == 0) {
                    b remove = this.a.remove(hi0Var);
                    if (!remove.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + remove + ", key: " + hi0Var);
                    }
                    this.b.b(remove);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot release a lock that is not held, key: ");
            sb.append(hi0Var);
            sb.append(", interestedThreads: ");
            sb.append(bVar == null ? 0 : bVar.b);
            throw new IllegalArgumentException(sb.toString());
        }
        bVar.a.unlock();
    }
}
