package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class se0 implements InterfaceC3467wv {

    /* renamed from: a */
    public final rv0 f26190a = new rv0(10);

    /* renamed from: b */
    public sm1 f26191b;

    /* renamed from: c */
    public boolean f26192c;

    /* renamed from: d */
    public long f26193d;

    /* renamed from: e */
    public int f26194e;

    /* renamed from: f */
    public int f26195f;

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        if (this.f26192c) {
            int m10919a = rv0Var.m10919a();
            int i = this.f26195f;
            if (i < 10) {
                int min = Math.min(m10919a, 10 - i);
                System.arraycopy(rv0Var.f25637a, rv0Var.m10917c(), this.f26190a.f25637a, this.f26195f, min);
                if (this.f26195f + min == 10) {
                    this.f26190a.m10921J(0);
                    if (73 != this.f26190a.m10896x() || 68 != this.f26190a.m10896x() || 51 != this.f26190a.m10896x()) {
                        this.f26192c = false;
                        return;
                    } else {
                        this.f26190a.m10920K(3);
                        this.f26194e = this.f26190a.m10897w() + 10;
                    }
                }
            }
            int min2 = Math.min(m10919a, this.f26194e - this.f26195f);
            this.f26191b.mo10157c(rv0Var, min2);
            this.f26195f += min2;
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        this.f26192c = false;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
        int i;
        if (this.f26192c && (i = this.f26194e) != 0 && this.f26195f == i) {
            this.f26191b.mo10159a(this.f26193d, 1, i, 0, null);
            this.f26192c = false;
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 4);
        this.f26191b = mo11478a;
        mo11478a.mo10156d(Format.m1718y(c1208d.m23335b(), "application/id3", null, -1, null));
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        if (z) {
            this.f26192c = true;
            this.f26193d = j;
            this.f26194e = 0;
            this.f26195f = 0;
        }
    }
}
