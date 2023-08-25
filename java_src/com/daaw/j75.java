package com.daaw;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j75 {
    public final Executor a;
    public final nh4 b;
    public final ny4 c;

    public j75(Executor executor, nh4 nh4Var, ny4 ny4Var) {
        this.a = executor;
        this.c = ny4Var;
        this.b = nh4Var;
    }

    public final void a(final a74 a74Var) {
        if (a74Var == null) {
            return;
        }
        this.c.C0(a74Var.g());
        this.c.n0(new q03() { // from class: com.daaw.f75
            @Override // com.daaw.q03
            public final void e0(p03 p03Var) {
                t84 zzP = a74.this.zzP();
                Rect rect = p03Var.d;
                zzP.G(rect.left, rect.top, false);
            }
        }, this.a);
        this.c.n0(new q03() { // from class: com.daaw.g75
            @Override // com.daaw.q03
            public final void e0(p03 p03Var) {
                a74 a74Var2 = a74.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != p03Var.j ? "0" : "1");
                a74Var2.T("onAdVisibilityChanged", hashMap);
            }
        }, this.a);
        this.c.n0(this.b, this.a);
        this.b.k(a74Var);
        a74Var.y("/trackActiveViewUnit", new zg3() { // from class: com.daaw.h75
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                j75.this.b((a74) obj, map);
            }
        });
        a74Var.y("/untrackActiveViewUnit", new zg3() { // from class: com.daaw.i75
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                j75.this.c((a74) obj, map);
            }
        });
    }

    public final /* synthetic */ void b(a74 a74Var, Map map) {
        this.b.c();
    }

    public final /* synthetic */ void c(a74 a74Var, Map map) {
        this.b.b();
    }
}
