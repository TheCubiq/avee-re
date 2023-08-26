package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEventR1<T1, TResult> {
    Map<WeakReference<Handler<T1, TResult>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<T1, TResult> {
        TResult invoke(T1 t1);
    }

    public void subscribeWeak(Handler<T1, TResult> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<T1, TResult> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public TResult invoke(T1 t1, TResult tresult) {
        for (WeakReference<Handler<T1, TResult>> weakReference : this.listeners.keySet()) {
            Handler<T1, TResult> handler = weakReference.get();
            if (handler != null) {
                tresult = handler.invoke(t1);
            } else {
                this.listeners.remove(weakReference);
            }
        }
        return tresult;
    }
}
