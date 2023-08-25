package com.daaw;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j75 {

    /* renamed from: a */
    public final Executor f14495a;

    /* renamed from: b */
    public final nh4 f14496b;

    /* renamed from: c */
    public final ny4 f14497c;

    public j75(Executor executor, nh4 nh4Var, ny4 ny4Var) {
        this.f14495a = executor;
        this.f14497c = ny4Var;
        this.f14496b = nh4Var;
    }

    /* renamed from: a */
    public final void m18762a(final a74 a74Var) {
        if (a74Var == null) {
            return;
        }
        this.f14497c.m14720C0(a74Var.mo6418g());
        this.f14497c.m17376n0(new q03() { // from class: com.daaw.f75
            @Override // com.daaw.q03
            /* renamed from: e0 */
            public final void mo6420e0(p03 p03Var) {
                t84 zzP = a74.this.zzP();
                Rect rect = p03Var.f22179d;
                zzP.mo9453G(rect.left, rect.top, false);
            }
        }, this.f14495a);
        this.f14497c.m17376n0(new q03() { // from class: com.daaw.g75
            @Override // com.daaw.q03
            /* renamed from: e0 */
            public final void mo6420e0(p03 p03Var) {
                a74 a74Var2 = a74.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != p03Var.f22185j ? "0" : "1");
                a74Var2.mo6434T("onAdVisibilityChanged", hashMap);
            }
        }, this.f14495a);
        this.f14497c.m17376n0(this.f14496b, this.f14495a);
        this.f14496b.m15170k(a74Var);
        a74Var.mo6392y("/trackActiveViewUnit", new zg3() { // from class: com.daaw.h75
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                j75.this.m18761b((a74) obj, map);
            }
        });
        a74Var.mo6392y("/untrackActiveViewUnit", new zg3() { // from class: com.daaw.i75
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                j75.this.m18760c((a74) obj, map);
            }
        });
    }

    /* renamed from: b */
    public final /* synthetic */ void m18761b(a74 a74Var, Map map) {
        this.f14496b.m15173c();
    }

    /* renamed from: c */
    public final /* synthetic */ void m18760c(a74 a74Var, Map map) {
        this.f14496b.m15174b();
    }
}
