package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbye;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class wu5 {

    /* renamed from: a */
    public final gj6 f31524a;

    /* renamed from: b */
    public final sa5 f31525b;

    /* renamed from: c */
    public final kd5 f31526c;

    /* renamed from: d */
    public final on6 f31527d;

    public wu5(gj6 gj6Var, sa5 sa5Var, kd5 kd5Var, on6 on6Var) {
        this.f31524a = gj6Var;
        this.f31525b = sa5Var;
        this.f31526c = kd5Var;
        this.f31527d = on6Var;
    }

    /* renamed from: a */
    public final void m5781a(wh6 wh6Var, th6 th6Var, int i, @Nullable uq5 uq5Var, long j) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
            nn6 m14953b = nn6.m14953b("adapter_status");
            m14953b.m14948g(wh6Var);
            m14953b.m14949f(th6Var);
            m14953b.m14954a("adapter_l", String.valueOf(j));
            m14953b.m14954a("sc", Integer.toString(i));
            if (uq5Var != null) {
                m14953b.m14954a("arec", Integer.toString(uq5Var.m7803b().zza));
                String m21558a = this.f31524a.m21558a(uq5Var.getMessage());
                if (m21558a != null) {
                    m14953b.m14954a("areec", m21558a);
                }
            }
            ra5 m10479b = this.f31525b.m10479b(th6Var.f27716u);
            if (m10479b != null) {
                m14953b.m14954a("ancn", m10479b.f25006a);
                zzbye zzbyeVar = m10479b.f25007b;
                if (zzbyeVar != null) {
                    m14953b.m14954a("adapter_v", zzbyeVar.toString());
                }
                zzbye zzbyeVar2 = m10479b.f25008c;
                if (zzbyeVar2 != null) {
                    m14953b.m14954a("adapter_sv", zzbyeVar2.toString());
                }
            }
            this.f31527d.mo7889a(m14953b);
            return;
        }
        jd5 m17776a = this.f31526c.m17776a();
        m17776a.m18587e(wh6Var);
        m17776a.m18588d(th6Var);
        m17776a.m18590b("action", "adapter_status");
        m17776a.m18590b("adapter_l", String.valueOf(j));
        m17776a.m18590b("sc", Integer.toString(i));
        if (uq5Var != null) {
            m17776a.m18590b("arec", Integer.toString(uq5Var.m7803b().zza));
            String m21558a2 = this.f31524a.m21558a(uq5Var.getMessage());
            if (m21558a2 != null) {
                m17776a.m18590b("areec", m21558a2);
            }
        }
        ra5 m10479b2 = this.f31525b.m10479b(th6Var.f27716u);
        if (m10479b2 != null) {
            m17776a.m18590b("ancn", m10479b2.f25006a);
            zzbye zzbyeVar3 = m10479b2.f25007b;
            if (zzbyeVar3 != null) {
                m17776a.m18590b("adapter_v", zzbyeVar3.toString());
            }
            zzbye zzbyeVar4 = m10479b2.f25008c;
            if (zzbyeVar4 != null) {
                m17776a.m18590b("adapter_sv", zzbyeVar4.toString());
            }
        }
        m17776a.m18585g();
    }
}
