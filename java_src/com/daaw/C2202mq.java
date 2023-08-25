package com.daaw;

import android.os.SystemClock;
/* renamed from: com.daaw.mq */
/* loaded from: classes.dex */
public class C2202mq implements InterfaceC0623ag {

    /* renamed from: a */
    public static final C2202mq f19068a = new C2202mq();

    /* renamed from: d */
    public static InterfaceC0623ag m15857d() {
        return f19068a;
    }

    @Override // com.daaw.InterfaceC0623ag
    /* renamed from: a */
    public final long mo15860a() {
        return System.currentTimeMillis();
    }

    @Override // com.daaw.InterfaceC0623ag
    /* renamed from: b */
    public final long mo15859b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.daaw.InterfaceC0623ag
    /* renamed from: c */
    public final long mo15858c() {
        return System.nanoTime();
    }
}
