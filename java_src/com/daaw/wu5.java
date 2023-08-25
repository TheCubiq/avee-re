package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbye;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class wu5 {
    public final gj6 a;
    public final sa5 b;
    public final kd5 c;
    public final on6 d;

    public wu5(gj6 gj6Var, sa5 sa5Var, kd5 kd5Var, on6 on6Var) {
        this.a = gj6Var;
        this.b = sa5Var;
        this.c = kd5Var;
        this.d = on6Var;
    }

    public final void a(wh6 wh6Var, th6 th6Var, int i, @Nullable uq5 uq5Var, long j) {
        if (((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
            nn6 b = nn6.b("adapter_status");
            b.g(wh6Var);
            b.f(th6Var);
            b.a("adapter_l", String.valueOf(j));
            b.a("sc", Integer.toString(i));
            if (uq5Var != null) {
                b.a("arec", Integer.toString(uq5Var.b().zza));
                String a = this.a.a(uq5Var.getMessage());
                if (a != null) {
                    b.a("areec", a);
                }
            }
            ra5 b2 = this.b.b(th6Var.u);
            if (b2 != null) {
                b.a("ancn", b2.a);
                zzbye zzbyeVar = b2.b;
                if (zzbyeVar != null) {
                    b.a("adapter_v", zzbyeVar.toString());
                }
                zzbye zzbyeVar2 = b2.c;
                if (zzbyeVar2 != null) {
                    b.a("adapter_sv", zzbyeVar2.toString());
                }
            }
            this.d.a(b);
            return;
        }
        jd5 a2 = this.c.a();
        a2.e(wh6Var);
        a2.d(th6Var);
        a2.b("action", "adapter_status");
        a2.b("adapter_l", String.valueOf(j));
        a2.b("sc", Integer.toString(i));
        if (uq5Var != null) {
            a2.b("arec", Integer.toString(uq5Var.b().zza));
            String a3 = this.a.a(uq5Var.getMessage());
            if (a3 != null) {
                a2.b("areec", a3);
            }
        }
        ra5 b3 = this.b.b(th6Var.u);
        if (b3 != null) {
            a2.b("ancn", b3.a);
            zzbye zzbyeVar3 = b3.b;
            if (zzbyeVar3 != null) {
                a2.b("adapter_v", zzbyeVar3.toString());
            }
            zzbye zzbyeVar4 = b3.c;
            if (zzbyeVar4 != null) {
                a2.b("adapter_sv", zzbyeVar4.toString());
            }
        }
        a2.g();
    }
}
