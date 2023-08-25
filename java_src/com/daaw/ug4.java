package com.daaw;

import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ug4 implements zg3 {
    public final /* synthetic */ vg4 a;

    public ug4(vg4 vg4Var) {
        this.a = vg4Var;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        Executor executor;
        if (vg4.g(this.a, map)) {
            executor = this.a.c;
            executor.execute(new Runnable() { // from class: com.daaw.tg4
                @Override // java.lang.Runnable
                public final void run() {
                    ah4 ah4Var;
                    ah4Var = ug4.this.a.d;
                    ah4Var.k();
                }
            });
        }
    }
}
