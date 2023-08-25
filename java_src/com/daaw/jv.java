package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class jv implements wv {
    public final List<eo1.a> a;
    public final sm1[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public jv(List<eo1.a> list) {
        this.a = list;
        this.b = new sm1[list.size()];
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        sm1[] sm1VarArr;
        if (this.c) {
            if (this.d != 2 || f(rv0Var, 32)) {
                if (this.d != 1 || f(rv0Var, 0)) {
                    int c = rv0Var.c();
                    int a = rv0Var.a();
                    for (sm1 sm1Var : this.b) {
                        rv0Var.J(c);
                        sm1Var.c(rv0Var, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        this.c = false;
    }

    @Override // com.daaw.wv
    public void c() {
        if (this.c) {
            for (sm1 sm1Var : this.b) {
                sm1Var.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            eo1.a aVar = this.a.get(i);
            dVar.a();
            sm1 a = d00Var.a(dVar.c(), 3);
            a.d(Format.w(dVar.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.c), aVar.a, null));
            this.b[i] = a;
        }
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public final boolean f(rv0 rv0Var, int i) {
        if (rv0Var.a() == 0) {
            return false;
        }
        if (rv0Var.x() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
