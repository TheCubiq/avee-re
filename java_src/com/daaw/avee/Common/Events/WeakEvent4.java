package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEvent4<T1, T2, T3, T4> {
    Map<WeakReference<Handler<T1, T2, T3, T4>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, T3, T4> {
        void invoke(T1 t1, T2 t2, T3 t3, T4 t4);
    }

    public void subscribeWeak(Handler<T1, T2, T3, T4> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, T3, T4> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public void invoke(T1 t1, T2 t2, T3 t3, T4 t4) {
        for (WeakReference<Handler<T1, T2, T3, T4>> weakReference : this.listeners.keySet()) {
            Handler<T1, T2, T3, T4> handler = weakReference.get();
            if (handler != null) {
                handler.invoke(t1, t2, t3, t4);
            } else {
                this.listeners.remove(weakReference);
            }
        }
    }
}
