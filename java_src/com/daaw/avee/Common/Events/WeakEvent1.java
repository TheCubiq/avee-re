package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEvent1<T1> {
    Map<WeakReference<Handler<T1>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<T1> {
        void invoke(T1 t1);
    }

    public void subscribeWeak(Handler<T1> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<T1> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public void unSubscribeWeak(List<Object> list) {
        for (WeakReference<Handler<T1>> weakReference : this.listeners.keySet()) {
            Handler<T1> handler = weakReference.get();
            if (handler == null || list.remove(handler)) {
                this.listeners.remove(weakReference);
            }
        }
    }

    public void invoke(T1 t1) {
        for (WeakReference<Handler<T1>> weakReference : this.listeners.keySet()) {
            Handler<T1> handler = weakReference.get();
            if (handler != null) {
                handler.invoke(t1);
            } else {
                this.listeners.remove(weakReference);
            }
        }
    }
}
