package com.daaw;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public class vs<V> extends o<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> w;

    /* loaded from: classes2.dex */
    public class a implements b<V> {
        public a() {
        }

        @Override // com.daaw.vs.b
        public void a(Throwable th) {
            vs.this.r(th);
        }

        @Override // com.daaw.vs.b
        public void set(V v) {
            vs.this.q(v);
        }
    }

    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(Throwable th);

        void set(T t);
    }

    /* loaded from: classes2.dex */
    public interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    public vs(c<V> cVar) {
        this.w = cVar.a(new a());
    }

    @Override // com.daaw.o
    public void b() {
        this.w.cancel(t());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.w.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: w */
    public int compareTo(Delayed delayed) {
        return this.w.compareTo(delayed);
    }
}
