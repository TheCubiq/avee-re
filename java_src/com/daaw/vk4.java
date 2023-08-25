package com.daaw;

import android.os.Bundle;
import java.util.Map;
/* loaded from: classes2.dex */
public final class vk4 extends de5 {

    /* renamed from: b */
    public final Map f30286b;

    /* renamed from: c */
    public final Map f30287c;

    /* renamed from: d */
    public long f30288d;

    public vk4(dr6 dr6Var) {
        super(dr6Var);
        this.f30287c = new C1370g6();
        this.f30286b = new C1370g6();
    }

    /* renamed from: g */
    public static /* synthetic */ void m7085g(vk4 vk4Var, String str, long j) {
        vk4Var.mo6991f();
        ry0.m10834f(str);
        if (vk4Var.f30287c.isEmpty()) {
            vk4Var.f30288d = j;
        }
        Integer num = (Integer) vk4Var.f30287c.get(str);
        if (num != null) {
            vk4Var.f30287c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (vk4Var.f30287c.size() >= 100) {
            vk4Var.f25143a.mo3895i().m14155w().m20653a("Too many ads visible");
        } else {
            vk4Var.f30287c.put(str, 1);
            vk4Var.f30286b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m7084h(vk4 vk4Var, String str, long j) {
        vk4Var.mo6991f();
        ry0.m10834f(str);
        Integer num = (Integer) vk4Var.f30287c.get(str);
        if (num == null) {
            vk4Var.f25143a.mo3895i().m14160q().m20652b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        t38 m11742s = vk4Var.f25143a.m24048K().m11742s(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            vk4Var.f30287c.put(str, Integer.valueOf(intValue));
            return;
        }
        vk4Var.f30287c.remove(str);
        Long l = (Long) vk4Var.f30286b.get(str);
        if (l == null) {
            vk4Var.f25143a.mo3895i().m14160q().m20653a("First ad unit exposure time was never set");
        } else {
            long longValue = l.longValue();
            vk4Var.f30286b.remove(str);
            vk4Var.m7078o(str, j - longValue, m11742s);
        }
        if (vk4Var.f30287c.isEmpty()) {
            long j2 = vk4Var.f30288d;
            if (j2 == 0) {
                vk4Var.f25143a.mo3895i().m14160q().m20653a("First ad exposure time was never set");
                return;
            }
            vk4Var.m7079n(j - j2, m11742s);
            vk4Var.f30288d = 0L;
        }
    }

    /* renamed from: k */
    public final void m7082k(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f25143a.mo3895i().m14160q().m20653a("Ad unit id must be a non-empty string");
        } else {
            this.f25143a.mo3882r().m6978z(new e32(this, str, j));
        }
    }

    /* renamed from: l */
    public final void m7081l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f25143a.mo3895i().m14160q().m20653a("Ad unit id must be a non-empty string");
        } else {
            this.f25143a.mo3882r().m6978z(new by2(this, str, j));
        }
    }

    /* renamed from: m */
    public final void m7080m(long j) {
        t38 m11742s = this.f25143a.m24048K().m11742s(false);
        for (String str : this.f30286b.keySet()) {
            m7078o(str, j - ((Long) this.f30286b.get(str)).longValue(), m11742s);
        }
        if (!this.f30286b.isEmpty()) {
            m7079n(j - this.f30288d, m11742s);
        }
        m7077p(j);
    }

    /* renamed from: n */
    public final void m7079n(long j, t38 t38Var) {
        if (t38Var == null) {
            this.f25143a.mo3895i().m14156v().m20653a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f25143a.mo3895i().m14156v().m20652b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            dd8.m24455y(t38Var, bundle, true);
            this.f25143a.m24050I().m13683u("am", "_xa", bundle);
        }
    }

    /* renamed from: o */
    public final void m7078o(String str, long j, t38 t38Var) {
        if (t38Var == null) {
            this.f25143a.mo3895i().m14156v().m20653a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f25143a.mo3895i().m14156v().m20652b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            dd8.m24455y(t38Var, bundle, true);
            this.f25143a.m24050I().m13683u("am", "_xu", bundle);
        }
    }

    /* renamed from: p */
    public final void m7077p(long j) {
        for (String str : this.f30286b.keySet()) {
            this.f30286b.put(str, Long.valueOf(j));
        }
        if (this.f30286b.isEmpty()) {
            return;
        }
        this.f30288d = j;
    }
}
