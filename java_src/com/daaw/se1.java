package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class se1 implements z91 {

    /* renamed from: a */
    public ol1 f26196a;

    /* renamed from: b */
    public sm1 f26197b;

    /* renamed from: c */
    public boolean f26198c;

    @Override // com.daaw.z91
    /* renamed from: a */
    public void mo2590a(rv0 rv0Var) {
        if (!this.f26198c) {
            if (this.f26196a.m14184e() == -9223372036854775807L) {
                return;
            }
            this.f26197b.mo10156d(Format.m1719x(null, "application/x-scte35", this.f26196a.m14184e()));
            this.f26198c = true;
        }
        int m10919a = rv0Var.m10919a();
        this.f26197b.mo10157c(rv0Var, m10919a);
        this.f26197b.mo10159a(this.f26196a.m14185d(), 1, m10919a, 0, null);
    }

    @Override // com.daaw.z91
    /* renamed from: c */
    public void mo2589c(ol1 ol1Var, d00 d00Var, eo1.C1208d c1208d) {
        this.f26196a = ol1Var;
        c1208d.m23336a();
        sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 4);
        this.f26197b = mo11478a;
        mo11478a.mo10156d(Format.m1718y(c1208d.m23335b(), "application/x-scte35", null, -1, null));
    }
}
