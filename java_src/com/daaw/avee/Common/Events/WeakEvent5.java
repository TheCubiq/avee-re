package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEvent5<T1, T2, T3, T4, T5> {
    Map<WeakReference<Handler<T1, T2, T3, T4, T5>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, T3, T4, T5> {
        void invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    public void subscribeWeak(Handler<T1, T2, T3, T4, T5> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, T3, T4, T5> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public void invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        for (WeakReference<Handler<T1, T2, T3, T4, T5>> weakReference : this.listeners.keySet()) {
            Handler<T1, T2, T3, T4, T5> handler = weakReference.get();
            if (handler != null) {
                handler.invoke(t1, t2, t3, t4, t5);
            } else {
                this.listeners.remove(weakReference);
            }
        }
    }
}
