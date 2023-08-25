package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ln6 {
    public final Executor a;
    public final p04 b;

    public ln6(Executor executor, p04 p04Var) {
        this.a = executor;
        this.b = p04Var;
    }

    public final /* synthetic */ void a(String str) {
        this.b.zza(str);
    }

    public final void b(final String str) {
        this.a.execute(new Runnable() { // from class: com.daaw.kn6
            @Override // java.lang.Runnable
            public final void run() {
                ln6.this.a(str);
            }
        });
    }
}
