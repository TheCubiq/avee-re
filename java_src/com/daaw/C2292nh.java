package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: com.daaw.nh */
/* loaded from: classes2.dex */
public class C2292nh {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20117b = AtomicIntegerFieldUpdater.newUpdater(C2292nh.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f20118a;

    public C2292nh(Throwable th, boolean z) {
        this.f20118a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ C2292nh(Throwable th, boolean z, int i, C2575pq c2575pq) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean m15181a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m15180b() {
        return f20117b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C0666aq.m27227a(this) + '[' + this.f20118a + ']';
    }
}
