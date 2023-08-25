package com.daaw;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class vm6 {
    public final Object a;
    public final String b;
    public final f77 c;
    public final List d;
    public final f77 e;
    public final /* synthetic */ wm6 f;

    public vm6(wm6 wm6Var, Object obj, String str, f77 f77Var, List list, f77 f77Var2) {
        this.f = wm6Var;
        this.a = obj;
        this.b = str;
        this.c = f77Var;
        this.d = list;
        this.e = f77Var2;
    }

    public final gm6 a() {
        xm6 xm6Var;
        Object obj = this.a;
        String str = this.b;
        if (str == null) {
            str = this.f.f(obj);
        }
        final gm6 gm6Var = new gm6(obj, str, this.e);
        xm6Var = this.f.c;
        xm6Var.i0(gm6Var);
        f77 f77Var = this.c;
        Runnable runnable = new Runnable() { // from class: com.daaw.mm6
            @Override // java.lang.Runnable
            public final void run() {
                xm6 xm6Var2;
                vm6 vm6Var = vm6.this;
                gm6 gm6Var2 = gm6Var;
                xm6Var2 = vm6Var.f.c;
                xm6Var2.d0(gm6Var2);
            }
        };
        g77 g77Var = z04.f;
        f77Var.f(runnable, g77Var);
        s67.r(gm6Var, new qm6(this, gm6Var), g77Var);
        return gm6Var;
    }

    public final vm6 b(Object obj) {
        return this.f.b(obj, a());
    }

    public final vm6 c(Class cls, w57 w57Var) {
        g77 g77Var;
        wm6 wm6Var = this.f;
        Object obj = this.a;
        String str = this.b;
        f77 f77Var = this.c;
        List list = this.d;
        f77 f77Var2 = this.e;
        g77Var = wm6Var.a;
        return new vm6(wm6Var, obj, str, f77Var, list, s67.g(f77Var2, cls, w57Var, g77Var));
    }

    public final vm6 d(final f77 f77Var) {
        return g(new w57() { // from class: com.daaw.nm6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return f77.this;
            }
        }, z04.f);
    }

    public final vm6 e(final em6 em6Var) {
        return f(new w57() { // from class: com.daaw.pm6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.i(em6.this.zza(obj));
            }
        });
    }

    public final vm6 f(w57 w57Var) {
        g77 g77Var;
        g77Var = this.f.a;
        return g(w57Var, g77Var);
    }

    public final vm6 g(w57 w57Var, Executor executor) {
        return new vm6(this.f, this.a, this.b, this.c, this.d, s67.n(this.e, w57Var, executor));
    }

    public final vm6 h(String str) {
        return new vm6(this.f, this.a, str, this.c, this.d, this.e);
    }

    public final vm6 i(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        wm6 wm6Var = this.f;
        Object obj = this.a;
        String str = this.b;
        f77 f77Var = this.c;
        List list = this.d;
        f77 f77Var2 = this.e;
        scheduledExecutorService = wm6Var.b;
        return new vm6(wm6Var, obj, str, f77Var, list, s67.o(f77Var2, j, timeUnit, scheduledExecutorService));
    }
}
