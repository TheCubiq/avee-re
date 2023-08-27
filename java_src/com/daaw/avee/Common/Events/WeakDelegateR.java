package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegateR<TResult> {
    WeakReference<Handler<TResult>> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler<TResult> {
        TResult invoke();
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegateR<TResult> subscribeWeak(Handler<TResult> handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler<TResult> handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public TResult invoke(TResult tresult) {
        Handler<TResult> handler = this.listenerWeak.get();
        return handler != null ? handler.invoke() : tresult;
    }
}
