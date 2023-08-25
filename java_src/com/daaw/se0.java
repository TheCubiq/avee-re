package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class se0 implements wv {
    public final rv0 a = new rv0(10);
    public sm1 b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        if (this.c) {
            int a = rv0Var.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(rv0Var.a, rv0Var.c(), this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.J(0);
                    if (73 != this.a.x() || 68 != this.a.x() || 51 != this.a.x()) {
                        this.c = false;
                        return;
                    } else {
                        this.a.K(3);
                        this.e = this.a.w() + 10;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.c(rv0Var, min2);
            this.f += min2;
        }
    }

    @Override // com.daaw.wv
    public void b() {
        this.c = false;
    }

    @Override // com.daaw.wv
    public void c() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.a(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        sm1 a = d00Var.a(dVar.c(), 4);
        this.b = a;
        a.d(Format.y(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }
}
