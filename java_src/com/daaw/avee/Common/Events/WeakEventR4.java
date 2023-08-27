package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEventR4<T1, T2, T3, T4, TResult> {
    Map<WeakReference<Handler<T1, T2, T3, T4, TResult>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, T3, T4, TResult> {
        TResult invoke(T1 t1, T2 t2, T3 t3, T4 t4);
    }

    public void subscribeWeak(Handler<T1, T2, T3, T4, TResult> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, T3, T4, TResult> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public TResult invoke(T1 t1, T2 t2, T3 t3, T4 t4, TResult tresult) {
        for (WeakReference<Handler<T1, T2, T3, T4, TResult>> weakReference : this.listeners.keySet()) {
            Handler<T1, T2, T3, T4, TResult> handler = weakReference.get();
            if (handler != null) {
                tresult = handler.invoke(t1, t2, t3, t4);
            } else {
                this.listeners.remove(weakReference);
            }
        }
        return tresult;
    }
}
