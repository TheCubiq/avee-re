package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ln6 {

    /* renamed from: a */
    public final Executor f17565a;

    /* renamed from: b */
    public final p04 f17566b;

    public ln6(Executor executor, p04 p04Var) {
        this.f17565a = executor;
        this.f17566b = p04Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void m16714a(String str) {
        this.f17566b.zza(str);
    }

    /* renamed from: b */
    public final void m16713b(final String str) {
        this.f17565a.execute(new Runnable() { // from class: com.daaw.kn6
            @Override // java.lang.Runnable
            public final void run() {
                ln6.this.m16714a(str);
            }
        });
    }
}
