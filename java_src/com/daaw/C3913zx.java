package com.daaw;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* renamed from: com.daaw.zx */
/* loaded from: classes2.dex */
public class C3913zx implements sh1, e01 {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<InterfaceC0780ay<Object>, Executor>> f35624a = new HashMap();

    /* renamed from: b */
    public Queue<C3478wx<?>> f35625b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f35626c;

    public C3913zx(Executor executor) {
        this.f35626c = executor;
    }

    /* renamed from: e */
    public static /* synthetic */ void m1813e(Map.Entry entry, C3478wx c3478wx) {
        ((InterfaceC0780ay) entry.getKey()).mo24882a(c3478wx);
    }

    @Override // com.daaw.sh1
    /* renamed from: a */
    public synchronized <T> void mo1817a(Class<T> cls, Executor executor, InterfaceC0780ay<? super T> interfaceC0780ay) {
        sy0.m9734b(cls);
        sy0.m9734b(interfaceC0780ay);
        sy0.m9734b(executor);
        if (!this.f35624a.containsKey(cls)) {
            this.f35624a.put(cls, new ConcurrentHashMap<>());
        }
        this.f35624a.get(cls).put(interfaceC0780ay, executor);
    }

    /* renamed from: c */
    public void m1815c() {
        Queue<C3478wx<?>> queue;
        synchronized (this) {
            queue = this.f35625b;
            if (queue != null) {
                this.f35625b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C3478wx<?> c3478wx : queue) {
                m1812f(c3478wx);
            }
        }
    }

    /* renamed from: d */
    public final synchronized Set<Map.Entry<InterfaceC0780ay<Object>, Executor>> m1814d(C3478wx<?> c3478wx) {
        ConcurrentHashMap<InterfaceC0780ay<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f35624a.get(c3478wx.m5740b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* renamed from: f */
    public void m1812f(final C3478wx<?> c3478wx) {
        sy0.m9734b(c3478wx);
        synchronized (this) {
            Queue<C3478wx<?>> queue = this.f35625b;
            if (queue != null) {
                queue.add(c3478wx);
                return;
            }
            for (final Map.Entry<InterfaceC0780ay<Object>, Executor> entry : m1814d(c3478wx)) {
                entry.getValue().execute(new Runnable() { // from class: com.daaw.yx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3913zx.m1813e(entry, c3478wx);
                    }
                });
            }
        }
    }
}
