package com.daaw;

import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class sg4 implements zg3 {

    /* renamed from: a */
    public final /* synthetic */ vg4 f26234a;

    public sg4(vg4 vg4Var) {
        this.f26234a = vg4Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        Executor executor;
        if (vg4.m7182g(this.f26234a, map)) {
            executor = this.f26234a.f30199c;
            executor.execute(new Runnable() { // from class: com.daaw.rg4
                @Override // java.lang.Runnable
                public final void run() {
                    ah4 ah4Var;
                    ah4Var = sg4.this.f26234a.f30200d;
                    ah4Var.m27480b();
                }
            });
        }
    }
}
