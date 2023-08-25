package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class eo5 implements yx4 {

    /* renamed from: r */
    public final String f8635r;

    /* renamed from: s */
    public final on6 f8636s;

    /* renamed from: p */
    public boolean f8633p = false;

    /* renamed from: q */
    public boolean f8634q = false;

    /* renamed from: t */
    public final zzg f8637t = zzt.zzo().m11915h();

    public eo5(String str, on6 on6Var) {
        this.f8635r = str;
        this.f8636s = on6Var;
    }

    /* renamed from: a */
    public final nn6 m23331a(String str) {
        String str2 = this.f8637t.zzP() ? "" : this.f8635r;
        nn6 m14953b = nn6.m14953b(str);
        m14953b.m14954a("tms", Long.toString(zzt.zzB().mo15859b(), 10));
        m14953b.m14954a("tid", str2);
        return m14953b;
    }

    @Override // com.daaw.yx4
    /* renamed from: c */
    public final void mo3090c(String str, String str2) {
        on6 on6Var = this.f8636s;
        nn6 m23331a = m23331a("adapter_init_finished");
        m23331a.m14954a("ancn", str);
        m23331a.m14954a("rqe", str2);
        on6Var.mo7889a(m23331a);
    }

    @Override // com.daaw.yx4
    /* renamed from: l */
    public final void mo3089l(String str) {
        on6 on6Var = this.f8636s;
        nn6 m23331a = m23331a("adapter_init_finished");
        m23331a.m14954a("ancn", str);
        on6Var.mo7889a(m23331a);
    }

    @Override // com.daaw.yx4
    /* renamed from: m */
    public final void mo3088m(String str) {
        on6 on6Var = this.f8636s;
        nn6 m23331a = m23331a("adapter_init_started");
        m23331a.m14954a("ancn", str);
        on6Var.mo7889a(m23331a);
    }

    @Override // com.daaw.yx4
    public final void zza(String str) {
        on6 on6Var = this.f8636s;
        nn6 m23331a = m23331a("aaia");
        m23331a.m14954a("aair", "MalformedJson");
        on6Var.mo7889a(m23331a);
    }

    @Override // com.daaw.yx4
    public final synchronized void zze() {
        if (this.f8634q) {
            return;
        }
        this.f8636s.mo7889a(m23331a("init_finished"));
        this.f8634q = true;
    }

    @Override // com.daaw.yx4
    public final synchronized void zzf() {
        if (this.f8633p) {
            return;
        }
        this.f8636s.mo7889a(m23331a("init_started"));
        this.f8633p = true;
    }
}
