package com.daaw;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
@SuppressLint({"RestrictedApi"})
/* renamed from: com.daaw.vs */
/* loaded from: classes2.dex */
public class ScheduledFutureC3366vs<V> extends AbstractC2377o<V> implements ScheduledFuture<V> {

    /* renamed from: w */
    public final ScheduledFuture<?> f30545w;

    /* renamed from: com.daaw.vs$a */
    /* loaded from: classes2.dex */
    public class C3367a implements InterfaceC3368b<V> {
        public C3367a() {
        }

        @Override // com.daaw.ScheduledFutureC3366vs.InterfaceC3368b
        /* renamed from: a */
        public void mo6827a(Throwable th) {
            ScheduledFutureC3366vs.this.m14681r(th);
        }

        @Override // com.daaw.ScheduledFutureC3366vs.InterfaceC3368b
        public void set(V v) {
            ScheduledFutureC3366vs.this.m14682q(v);
        }
    }

    /* renamed from: com.daaw.vs$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3368b<T> {
        /* renamed from: a */
        void mo6827a(Throwable th);

        void set(T t);
    }

    /* renamed from: com.daaw.vs$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC3369c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo6826a(InterfaceC3368b<T> interfaceC3368b);
    }

    public ScheduledFutureC3366vs(InterfaceC3369c<V> interfaceC3369c) {
        this.f30545w = interfaceC3369c.mo6826a(new C3367a());
    }

    @Override // com.daaw.AbstractC2377o
    /* renamed from: b */
    public void mo6831b() {
        this.f30545w.cancel(m14679t());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f30545w.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: w */
    public int compareTo(Delayed delayed) {
        return this.f30545w.compareTo(delayed);
    }
}
