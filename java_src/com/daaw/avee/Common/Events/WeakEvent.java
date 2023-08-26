package com.daaw.avee.Common.Events;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class WeakEvent {
    public static final boolean debugWkEvent = false;
    Map<WeakReference<Handler>, Object> listeners = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface Handler {
        void invoke();
    }

    public void subscribeWeak(Handler handler, List<Object> list) {
        list.add(handler);
        this.listeners.put(new WeakReference<>(handler), this);
    }

    public Handler subscribeHoldWeak(Handler handler) {
        this.listeners.put(new WeakReference<>(handler), this);
        return handler;
    }

    public void unSubscribeWeak(List<Object> list) {
        for (WeakReference<Handler> weakReference : this.listeners.keySet()) {
            Handler handler = weakReference.get();
            if (handler == null || list.remove(handler)) {
                this.listeners.remove(weakReference);
            }
        }
    }

    public void invoke() {
        for (WeakReference<Handler> weakReference : this.listeners.keySet()) {
            Handler handler = weakReference.get();
            if (handler != null) {
                handler.invoke();
            } else {
                this.listeners.remove(weakReference);
            }
        }
    }
}
