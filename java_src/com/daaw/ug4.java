package com.daaw;

import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ug4 implements zg3 {

    /* renamed from: a */
    public final /* synthetic */ vg4 f29042a;

    public ug4(vg4 vg4Var) {
        this.f29042a = vg4Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        Executor executor;
        if (vg4.m7182g(this.f29042a, map)) {
            executor = this.f29042a.f30199c;
            executor.execute(new Runnable() { // from class: com.daaw.tg4
                @Override // java.lang.Runnable
                public final void run() {
                    ah4 ah4Var;
                    ah4Var = ug4.this.f29042a.f30200d;
                    ah4Var.m27477k();
                }
            });
        }
    }
}
