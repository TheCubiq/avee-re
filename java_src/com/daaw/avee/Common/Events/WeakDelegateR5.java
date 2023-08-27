package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegateR5<T1, T2, T3, T4, T5, TResult> {
    WeakReference<Handler<T1, T2, T3, T4, T5, TResult>> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler<T1, T2, T3, T4, T5, TResult> {
        TResult invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegateR5<T1, T2, T3, T4, T5, TResult> subscribeWeak(Handler<T1, T2, T3, T4, T5, TResult> handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler<T1, T2, T3, T4, T5, TResult> handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public TResult invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, TResult tresult) {
        Handler<T1, T2, T3, T4, T5, TResult> handler = this.listenerWeak.get();
        return handler != null ? handler.invoke(t1, t2, t3, t4, t5) : tresult;
    }
}
