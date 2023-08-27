package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegate2<T1, T2> {
    WeakReference<Handler<T1, T2>> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler<T1, T2> {
        void invoke(T1 t1, T2 t2);
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegate2<T1, T2> subscribeWeak(Handler<T1, T2> handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler<T1, T2> handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public void invoke(T1 t1, T2 t2) {
        Handler<T1, T2> handler = this.listenerWeak.get();
        if (handler != null) {
            handler.invoke(t1, t2);
        }
    }
}
