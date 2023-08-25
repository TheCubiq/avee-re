package com.daaw;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class vm6 {

    /* renamed from: a */
    public final Object f30332a;

    /* renamed from: b */
    public final String f30333b;

    /* renamed from: c */
    public final f77 f30334c;

    /* renamed from: d */
    public final List f30335d;

    /* renamed from: e */
    public final f77 f30336e;

    /* renamed from: f */
    public final /* synthetic */ wm6 f30337f;

    public vm6(wm6 wm6Var, Object obj, String str, f77 f77Var, List list, f77 f77Var2) {
        this.f30337f = wm6Var;
        this.f30332a = obj;
        this.f30333b = str;
        this.f30334c = f77Var;
        this.f30335d = list;
        this.f30336e = f77Var2;
    }

    /* renamed from: a */
    public final gm6 m7037a() {
        xm6 xm6Var;
        Object obj = this.f30332a;
        String str = this.f30333b;
        if (str == null) {
            str = this.f30337f.mo5971f(obj);
        }
        final gm6 gm6Var = new gm6(obj, str, this.f30336e);
        xm6Var = this.f30337f.f31348c;
        xm6Var.mo4987i0(gm6Var);
        f77 f77Var = this.f30334c;
        Runnable runnable = new Runnable() { // from class: com.daaw.mm6
            @Override // java.lang.Runnable
            public final void run() {
                xm6 xm6Var2;
                vm6 vm6Var = vm6.this;
                gm6 gm6Var2 = gm6Var;
                xm6Var2 = vm6Var.f30337f.f31348c;
                xm6Var2.mo4988d0(gm6Var2);
            }
        };
        g77 g77Var = z04.f34310f;
        f77Var.mo6515f(runnable, g77Var);
        s67.m10625r(gm6Var, new qm6(this, gm6Var), g77Var);
        return gm6Var;
    }

    /* renamed from: b */
    public final vm6 m7036b(Object obj) {
        return this.f30337f.m5975b(obj, m7037a());
    }

    /* renamed from: c */
    public final vm6 m7035c(Class cls, w57 w57Var) {
        g77 g77Var;
        wm6 wm6Var = this.f30337f;
        Object obj = this.f30332a;
        String str = this.f30333b;
        f77 f77Var = this.f30334c;
        List list = this.f30335d;
        f77 f77Var2 = this.f30336e;
        g77Var = wm6Var.f31346a;
        return new vm6(wm6Var, obj, str, f77Var, list, s67.m10636g(f77Var2, cls, w57Var, g77Var));
    }

    /* renamed from: d */
    public final vm6 m7034d(final f77 f77Var) {
        return m7031g(new w57() { // from class: com.daaw.nm6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return f77.this;
            }
        }, z04.f34310f);
    }

    /* renamed from: e */
    public final vm6 m7033e(final em6 em6Var) {
        return m7032f(new w57() { // from class: com.daaw.pm6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.m10634i(em6.this.zza(obj));
            }
        });
    }

    /* renamed from: f */
    public final vm6 m7032f(w57 w57Var) {
        g77 g77Var;
        g77Var = this.f30337f.f31346a;
        return m7031g(w57Var, g77Var);
    }

    /* renamed from: g */
    public final vm6 m7031g(w57 w57Var, Executor executor) {
        return new vm6(this.f30337f, this.f30332a, this.f30333b, this.f30334c, this.f30335d, s67.m10629n(this.f30336e, w57Var, executor));
    }

    /* renamed from: h */
    public final vm6 m7030h(String str) {
        return new vm6(this.f30337f, this.f30332a, str, this.f30334c, this.f30335d, this.f30336e);
    }

    /* renamed from: i */
    public final vm6 m7029i(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        wm6 wm6Var = this.f30337f;
        Object obj = this.f30332a;
        String str = this.f30333b;
        f77 f77Var = this.f30334c;
        List list = this.f30335d;
        f77 f77Var2 = this.f30336e;
        scheduledExecutorService = wm6Var.f31347b;
        return new vm6(wm6Var, obj, str, f77Var, list, s67.m10628o(f77Var2, j, timeUnit, scheduledExecutorService));
    }
}
