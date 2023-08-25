package com.daaw;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class op6 {

    /* renamed from: a */
    public final Context f21808a;

    /* renamed from: b */
    public final Executor f21809b;

    /* renamed from: c */
    public final p04 f21810c;

    /* renamed from: d */
    public final vo6 f21811d;

    public op6(Context context, Executor executor, p04 p04Var, vo6 vo6Var) {
        this.f21808a = context;
        this.f21809b = executor;
        this.f21810c = p04Var;
        this.f21811d = vo6Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void m14100a(String str) {
        this.f21810c.zza(str);
    }

    /* renamed from: b */
    public final /* synthetic */ void m14099b(String str, to6 to6Var) {
        io6 m20568a = ho6.m20568a(this.f21808a, 14);
        m20568a.zzh();
        m20568a.zzf(this.f21810c.zza(str));
        if (to6Var == null) {
            this.f21811d.m6969b(m20568a.zzl());
            return;
        }
        to6Var.m8902a(m20568a);
        to6Var.m8896g();
    }

    /* renamed from: c */
    public final void m14098c(final String str, final to6 to6Var) {
        if (vo6.m6970a() && ((Boolean) ta3.f27159d.m16137e()).booleanValue()) {
            this.f21809b.execute(new Runnable() { // from class: com.daaw.np6
                @Override // java.lang.Runnable
                public final void run() {
                    op6.this.m14099b(str, to6Var);
                }
            });
        } else {
            this.f21809b.execute(new Runnable() { // from class: com.daaw.mp6
                @Override // java.lang.Runnable
                public final void run() {
                    op6.this.m14100a(str);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m14097d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m14098c((String) it.next(), null);
        }
    }
}
