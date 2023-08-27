package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class WeakDelegate {
    WeakReference<Handler> listenerWeak = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface Handler {
        void invoke();
    }

    public void clear() {
        this.listenerWeak = new WeakReference<>(null);
    }

    public WeakDelegate subscribeWeak(Handler handler, List<Object> list) {
        list.add(handler);
        this.listenerWeak = new WeakReference<>(handler);
        return this;
    }

    public Handler subscribeHoldWeak(Handler handler) {
        this.listenerWeak = new WeakReference<>(handler);
        return handler;
    }

    public void invoke() {
        Handler handler = this.listenerWeak.get();
        if (handler != null) {
            handler.invoke();
        }
    }
}
