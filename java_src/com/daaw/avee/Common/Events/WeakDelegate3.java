package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegate3<T1, T2, T3> {
    WeakReference<Handler<T1, T2, T3>> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, T3> {
        void invoke(T1 t1, T2 t2, T3 t3);
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegate3<T1, T2, T3> subscribeWeak(Handler<T1, T2, T3> handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, T3> handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public void invoke(T1 t1, T2 t2, T3 t3) {
        Handler<T1, T2, T3> handler = this.listenerWeak.get();
        if (handler != null) {
            handler.invoke(t1, t2, t3);
        }
    }
}
