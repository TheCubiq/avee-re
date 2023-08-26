package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* loaded from: classes2.dex */
public class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> handlerMap = new HashMap();
    private Queue<Event<?>> pendingEvents = new ArrayDeque();

    public EventBus(Executor executor) {
        this.defaultExecutor = executor;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            if (this.pendingEvents != null) {
                this.pendingEvents.add(event);
                return;
            }
            for (Map.Entry<EventHandler<Object>, Executor> entry : getHandlers(event)) {
                entry.getValue().execute(EventBus$$Lambda$1.lambdaFactory$(entry, event));
            }
        }
    }

    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> getHandlers(Event<?> event) {
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.handlerMap.get(event.getType());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        Preconditions.checkNotNull(executor);
        if (!this.handlerMap.containsKey(cls)) {
            this.handlerMap.put(cls, new ConcurrentHashMap<>());
        }
        this.handlerMap.get(cls).put(eventHandler, executor);
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.defaultExecutor, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (this.handlerMap.containsKey(cls)) {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.handlerMap.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.handlerMap.remove(cls);
            }
        }
    }

    public void enablePublishingAndFlushPending() {
        Queue<Event<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.pendingEvents != null) {
                Queue<Event<?>> queue2 = this.pendingEvents;
                this.pendingEvents = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                publish(event);
            }
        }
    }
}
