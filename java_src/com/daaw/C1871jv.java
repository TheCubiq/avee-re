package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.jv */
/* loaded from: classes.dex */
public final class C1871jv implements InterfaceC3467wv {

    /* renamed from: a */
    public final List<eo1.C1205a> f15433a;

    /* renamed from: b */
    public final sm1[] f15434b;

    /* renamed from: c */
    public boolean f15435c;

    /* renamed from: d */
    public int f15436d;

    /* renamed from: e */
    public int f15437e;

    /* renamed from: f */
    public long f15438f;

    public C1871jv(List<eo1.C1205a> list) {
        this.f15433a = list;
        this.f15434b = new sm1[list.size()];
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        sm1[] sm1VarArr;
        if (this.f15435c) {
            if (this.f15436d != 2 || m18235f(rv0Var, 32)) {
                if (this.f15436d != 1 || m18235f(rv0Var, 0)) {
                    int m10917c = rv0Var.m10917c();
                    int m10919a = rv0Var.m10919a();
                    for (sm1 sm1Var : this.f15434b) {
                        rv0Var.m10921J(m10917c);
                        sm1Var.mo10157c(rv0Var, m10919a);
                    }
                    this.f15437e += m10919a;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        this.f15435c = false;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
        if (this.f15435c) {
            for (sm1 sm1Var : this.f15434b) {
                sm1Var.mo10159a(this.f15438f, 1, this.f15437e, 0, null);
            }
            this.f15435c = false;
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        for (int i = 0; i < this.f15434b.length; i++) {
            eo1.C1205a c1205a = this.f15433a.get(i);
            c1208d.m23336a();
            sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 3);
            mo11478a.mo10156d(Format.m1720w(c1208d.m23335b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(c1205a.f8613c), c1205a.f8611a, null));
            this.f15434b[i] = mo11478a;
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        if (z) {
            this.f15435c = true;
            this.f15438f = j;
            this.f15437e = 0;
            this.f15436d = 2;
        }
    }

    /* renamed from: f */
    public final boolean m18235f(rv0 rv0Var, int i) {
        if (rv0Var.m10919a() == 0) {
            return false;
        }
        if (rv0Var.m10896x() != i) {
            this.f15435c = false;
        }
        this.f15436d--;
        return this.f15435c;
    }
}
