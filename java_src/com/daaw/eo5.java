package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class eo5 implements yx4 {
    public final String r;
    public final on6 s;
    public boolean p = false;
    public boolean q = false;
    public final zzg t = zzt.zzo().h();

    public eo5(String str, on6 on6Var) {
        this.r = str;
        this.s = on6Var;
    }

    public final nn6 a(String str) {
        String str2 = this.t.zzP() ? "" : this.r;
        nn6 b = nn6.b(str);
        b.a("tms", Long.toString(zzt.zzB().b(), 10));
        b.a("tid", str2);
        return b;
    }

    @Override // com.daaw.yx4
    public final void c(String str, String str2) {
        on6 on6Var = this.s;
        nn6 a = a("adapter_init_finished");
        a.a("ancn", str);
        a.a("rqe", str2);
        on6Var.a(a);
    }

    @Override // com.daaw.yx4
    public final void l(String str) {
        on6 on6Var = this.s;
        nn6 a = a("adapter_init_finished");
        a.a("ancn", str);
        on6Var.a(a);
    }

    @Override // com.daaw.yx4
    public final void m(String str) {
        on6 on6Var = this.s;
        nn6 a = a("adapter_init_started");
        a.a("ancn", str);
        on6Var.a(a);
    }

    @Override // com.daaw.yx4
    public final void zza(String str) {
        on6 on6Var = this.s;
        nn6 a = a("aaia");
        a.a("aair", "MalformedJson");
        on6Var.a(a);
    }

    @Override // com.daaw.yx4
    public final synchronized void zze() {
        if (this.q) {
            return;
        }
        this.s.a(a("init_finished"));
        this.q = true;
    }

    @Override // com.daaw.yx4
    public final synchronized void zzf() {
        if (this.p) {
            return;
        }
        this.s.a(a("init_started"));
        this.p = true;
    }
}
