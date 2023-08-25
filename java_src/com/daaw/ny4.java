package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ny4 extends kw4 implements q03 {
    @GuardedBy("this")

    /* renamed from: q */
    public final Map f20853q;

    /* renamed from: r */
    public final Context f20854r;

    /* renamed from: s */
    public final th6 f20855s;

    public ny4(Context context, Set set, th6 th6Var) {
        super(set);
        this.f20853q = new WeakHashMap(1);
        this.f20854r = context;
        this.f20855s = th6Var;
    }

    /* renamed from: C0 */
    public final synchronized void m14720C0(View view) {
        r03 r03Var = (r03) this.f20853q.get(view);
        if (r03Var == null) {
            r03Var = new r03(this.f20854r, view);
            r03Var.m11874c(this);
            this.f20853q.put(view, r03Var);
        }
        if (this.f20855s.f27678Y) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10700h1)).booleanValue()) {
                r03Var.m11870g(((Long) zzba.zzc().m23658b(g93.f10689g1)).longValue());
                return;
            }
        }
        r03Var.m11871f();
    }

    /* renamed from: D0 */
    public final synchronized void m14719D0(View view) {
        if (this.f20853q.containsKey(view)) {
            ((r03) this.f20853q.get(view)).m11872e(this);
            this.f20853q.remove(view);
        }
    }

    @Override // com.daaw.q03
    /* renamed from: e0 */
    public final synchronized void mo6420e0(final p03 p03Var) {
        m17378B0(new jw4() { // from class: com.daaw.my4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((q03) obj).mo6420e0(p03.this);
            }
        });
    }
}
