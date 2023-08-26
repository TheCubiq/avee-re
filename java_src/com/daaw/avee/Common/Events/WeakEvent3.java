package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEvent3<T1, T2, T3> {
    Map<WeakReference<Handler<T1, T2, T3>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, T3> {
        void invoke(T1 t1, T2 t2, T3 t3);
    }

    public void subscribeWeak(Handler<T1, T2, T3> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, T3> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public void unSubscribeWeak(List<Object> list) {
        for (WeakReference<Handler<T1, T2, T3>> weakReference : this.listeners.keySet()) {
            Handler<T1, T2, T3> handler = weakReference.get();
            if (handler == null || list.remove(handler)) {
                this.listeners.remove(weakReference);
            }
        }
    }

    public void invoke(T1 t1, T2 t2, T3 t3) {
        for (WeakReference<Handler<T1, T2, T3>> weakReference : this.listeners.keySet()) {
            Handler<T1, T2, T3> handler = weakReference.get();
            if (handler != null) {
                handler.invoke(t1, t2, t3);
            } else {
                this.listeners.remove(weakReference);
            }
        }
    }
}
