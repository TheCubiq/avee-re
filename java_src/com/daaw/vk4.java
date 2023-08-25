package com.daaw;

import android.os.Bundle;
import java.util.Map;
/* loaded from: classes2.dex */
public final class vk4 extends de5 {
    public final Map b;
    public final Map c;
    public long d;

    public vk4(dr6 dr6Var) {
        super(dr6Var);
        this.c = new g6();
        this.b = new g6();
    }

    public static /* synthetic */ void g(vk4 vk4Var, String str, long j) {
        vk4Var.f();
        ry0.f(str);
        if (vk4Var.c.isEmpty()) {
            vk4Var.d = j;
        }
        Integer num = (Integer) vk4Var.c.get(str);
        if (num != null) {
            vk4Var.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (vk4Var.c.size() >= 100) {
            vk4Var.a.i().w().a("Too many ads visible");
        } else {
            vk4Var.c.put(str, 1);
            vk4Var.b.put(str, Long.valueOf(j));
        }
    }

    public static /* synthetic */ void h(vk4 vk4Var, String str, long j) {
        vk4Var.f();
        ry0.f(str);
        Integer num = (Integer) vk4Var.c.get(str);
        if (num == null) {
            vk4Var.a.i().q().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        t38 s = vk4Var.a.K().s(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            vk4Var.c.put(str, Integer.valueOf(intValue));
            return;
        }
        vk4Var.c.remove(str);
        Long l = (Long) vk4Var.b.get(str);
        if (l == null) {
            vk4Var.a.i().q().a("First ad unit exposure time was never set");
        } else {
            long longValue = l.longValue();
            vk4Var.b.remove(str);
            vk4Var.o(str, j - longValue, s);
        }
        if (vk4Var.c.isEmpty()) {
            long j2 = vk4Var.d;
            if (j2 == 0) {
                vk4Var.a.i().q().a("First ad exposure time was never set");
                return;
            }
            vk4Var.n(j - j2, s);
            vk4Var.d = 0L;
        }
    }

    public final void k(String str, long j) {
        if (str == null || str.length() == 0) {
            this.a.i().q().a("Ad unit id must be a non-empty string");
        } else {
            this.a.r().z(new e32(this, str, j));
        }
    }

    public final void l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.a.i().q().a("Ad unit id must be a non-empty string");
        } else {
            this.a.r().z(new by2(this, str, j));
        }
    }

    public final void m(long j) {
        t38 s = this.a.K().s(false);
        for (String str : this.b.keySet()) {
            o(str, j - ((Long) this.b.get(str)).longValue(), s);
        }
        if (!this.b.isEmpty()) {
            n(j - this.d, s);
        }
        p(j);
    }

    public final void n(long j, t38 t38Var) {
        if (t38Var == null) {
            this.a.i().v().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.a.i().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            dd8.y(t38Var, bundle, true);
            this.a.I().u("am", "_xa", bundle);
        }
    }

    public final void o(String str, long j, t38 t38Var) {
        if (t38Var == null) {
            this.a.i().v().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.a.i().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            dd8.y(t38Var, bundle, true);
            this.a.I().u("am", "_xu", bundle);
        }
    }

    public final void p(long j) {
        for (String str : this.b.keySet()) {
            this.b.put(str, Long.valueOf(j));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j;
    }
}
