package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegate1<T1> {
    WeakReference<Handler<T1>> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler<T1> {
        void invoke(T1 t1);
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegate1<T1> subscribeWeak(Handler<T1> handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler<T1> handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public void invoke(T1 t1) {
        Handler<T1> handler = this.listenerWeak.get();
        if (handler != null) {
            handler.invoke(t1);
        }
    }
}
