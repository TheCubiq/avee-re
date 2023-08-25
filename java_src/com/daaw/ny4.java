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
    public final Map q;
    public final Context r;
    public final th6 s;

    public ny4(Context context, Set set, th6 th6Var) {
        super(set);
        this.q = new WeakHashMap(1);
        this.r = context;
        this.s = th6Var;
    }

    public final synchronized void C0(View view) {
        r03 r03Var = (r03) this.q.get(view);
        if (r03Var == null) {
            r03Var = new r03(this.r, view);
            r03Var.c(this);
            this.q.put(view, r03Var);
        }
        if (this.s.Y) {
            if (((Boolean) zzba.zzc().b(g93.h1)).booleanValue()) {
                r03Var.g(((Long) zzba.zzc().b(g93.g1)).longValue());
                return;
            }
        }
        r03Var.f();
    }

    public final synchronized void D0(View view) {
        if (this.q.containsKey(view)) {
            ((r03) this.q.get(view)).e(this);
            this.q.remove(view);
        }
    }

    @Override // com.daaw.q03
    public final synchronized void e0(final p03 p03Var) {
        B0(new jw4() { // from class: com.daaw.my4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((q03) obj).e0(p03.this);
            }
        });
    }
}
