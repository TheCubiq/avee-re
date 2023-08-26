package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegateR2<T1, T2, TResult> {
    WeakReference<Handler<T1, T2, TResult>> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, TResult> {
        TResult invoke(T1 t1, T2 t2);
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegateR2<T1, T2, TResult> subscribeWeak(Handler<T1, T2, TResult> handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, TResult> handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public TResult invoke(T1 t1, T2 t2, TResult tresult) {
        Handler<T1, T2, TResult> handler = this.listenerWeak.get();
        return handler != null ? handler.invoke(t1, t2) : tresult;
    }
}
