package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEventR<TResult> {
    Map<WeakReference<Handler<TResult>>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler<TResult> {
        TResult invoke();
    }

    public void subscribeWeak(Handler<TResult> handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler<TResult> handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public TResult invoke(TResult tresult) {
        for (WeakReference<Handler<TResult>> weakReference : this.listeners.keySet()) {
            Handler<TResult> handler = weakReference.get();
            if (handler != null) {
                tresult = handler.invoke();
            } else {
                this.listeners.remove(weakReference);
            }
        }
        return tresult;
    }
}
