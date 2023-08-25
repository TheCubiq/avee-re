package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.daaw.p2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class q2 implements p2 {
    public static volatile p2 c;
    public final g5 a;
    public final Map b;

    /* loaded from: classes2.dex */
    public class a implements p2.a {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }
    }

    public q2(g5 g5Var) {
        ry0.j(g5Var);
        this.a = g5Var;
        this.b = new ConcurrentHashMap();
    }

    public static p2 c(s10 s10Var, Context context, sh1 sh1Var) {
        ry0.j(s10Var);
        ry0.j(context);
        ry0.j(sh1Var);
        ry0.j(context.getApplicationContext());
        if (c == null) {
            synchronized (q2.class) {
                if (c == null) {
                    Bundle bundle = new Bundle(1);
                    if (s10Var.t()) {
                        sh1Var.a(gp.class, new Executor() { // from class: com.daaw.f32
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new ay() { // from class: com.daaw.cy2
                            @Override // com.daaw.ay
                            public final void a(wx wxVar) {
                                q2.d(wxVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", s10Var.s());
                    }
                    c = new q2(gk5.u(context, null, null, null, bundle).r());
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void d(wx wxVar) {
        boolean z = ((gp) wxVar.a()).a;
        synchronized (q2.class) {
            ((q2) ry0.j(c)).a.v(z);
        }
    }

    @Override // com.daaw.p2
    public p2.a a(String str, p2.b bVar) {
        ry0.j(bVar);
        if (yr3.f(str) && !e(str)) {
            g5 g5Var = this.a;
            Object fe5Var = "fiam".equals(str) ? new fe5(g5Var, bVar) : "clx".equals(str) ? new z07(g5Var, bVar) : null;
            if (fe5Var != null) {
                this.b.put(str, fe5Var);
                return new a(str);
            }
            return null;
        }
        return null;
    }

    @Override // com.daaw.p2
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (yr3.f(str) && yr3.d(str2, bundle) && yr3.c(str, str2, bundle)) {
            yr3.b(str, str2, bundle);
            this.a.n(str, str2, bundle);
        }
    }

    public final boolean e(String str) {
        return (str.isEmpty() || !this.b.containsKey(str) || this.b.get(str) == null) ? false : true;
    }
}
