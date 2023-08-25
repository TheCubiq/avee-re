package com.daaw;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class zx implements sh1, e01 {
    public final Map<Class<?>, ConcurrentHashMap<ay<Object>, Executor>> a = new HashMap();
    public Queue<wx<?>> b = new ArrayDeque();
    public final Executor c;

    public zx(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void e(Map.Entry entry, wx wxVar) {
        ((ay) entry.getKey()).a(wxVar);
    }

    @Override // com.daaw.sh1
    public synchronized <T> void a(Class<T> cls, Executor executor, ay<? super T> ayVar) {
        sy0.b(cls);
        sy0.b(ayVar);
        sy0.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(ayVar, executor);
    }

    public void c() {
        Queue<wx<?>> queue;
        synchronized (this) {
            queue = this.b;
            if (queue != null) {
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (wx<?> wxVar : queue) {
                f(wxVar);
            }
        }
    }

    public final synchronized Set<Map.Entry<ay<Object>, Executor>> d(wx<?> wxVar) {
        ConcurrentHashMap<ay<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(wxVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public void f(final wx<?> wxVar) {
        sy0.b(wxVar);
        synchronized (this) {
            Queue<wx<?>> queue = this.b;
            if (queue != null) {
                queue.add(wxVar);
                return;
            }
            for (final Map.Entry<ay<Object>, Executor> entry : d(wxVar)) {
                entry.getValue().execute(new Runnable() { // from class: com.daaw.yx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zx.e(entry, wxVar);
                    }
                });
            }
        }
    }
}
