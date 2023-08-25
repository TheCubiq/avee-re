package com.daaw;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class op6 {
    public final Context a;
    public final Executor b;
    public final p04 c;
    public final vo6 d;

    public op6(Context context, Executor executor, p04 p04Var, vo6 vo6Var) {
        this.a = context;
        this.b = executor;
        this.c = p04Var;
        this.d = vo6Var;
    }

    public final /* synthetic */ void a(String str) {
        this.c.zza(str);
    }

    public final /* synthetic */ void b(String str, to6 to6Var) {
        io6 a = ho6.a(this.a, 14);
        a.zzh();
        a.zzf(this.c.zza(str));
        if (to6Var == null) {
            this.d.b(a.zzl());
            return;
        }
        to6Var.a(a);
        to6Var.g();
    }

    public final void c(final String str, final to6 to6Var) {
        if (vo6.a() && ((Boolean) ta3.d.e()).booleanValue()) {
            this.b.execute(new Runnable() { // from class: com.daaw.np6
                @Override // java.lang.Runnable
                public final void run() {
                    op6.this.b(str, to6Var);
                }
            });
        } else {
            this.b.execute(new Runnable() { // from class: com.daaw.mp6
                @Override // java.lang.Runnable
                public final void run() {
                    op6.this.a(str);
                }
            });
        }
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((String) it.next(), null);
        }
    }
}
