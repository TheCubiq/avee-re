package com.daaw;

import android.util.SparseArray;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class ff implements d00 {
    public final zz p;
    public final int q;
    public final Format r;
    public final SparseArray<a> s = new SparseArray<>();
    public boolean t;
    public b u;
    public da1 v;
    public Format[] w;

    /* loaded from: classes.dex */
    public static final class a implements sm1 {
        public final int a;
        public final int b;
        public final Format c;
        public Format d;
        public sm1 e;

        public a(int i, int i2, Format format) {
            this.a = i;
            this.b = i2;
            this.c = format;
        }

        @Override // com.daaw.sm1
        public void a(long j, int i, int i2, int i3, sm1.a aVar) {
            this.e.a(j, i, i2, i3, aVar);
        }

        @Override // com.daaw.sm1
        public int b(a00 a00Var, int i, boolean z) {
            return this.e.b(a00Var, i, z);
        }

        @Override // com.daaw.sm1
        public void c(rv0 rv0Var, int i) {
            this.e.c(rv0Var, i);
        }

        @Override // com.daaw.sm1
        public void d(Format format) {
            Format format2 = this.c;
            if (format2 != null) {
                format = format.g(format2);
            }
            this.d = format;
            this.e.d(format);
        }

        public void e(b bVar) {
            if (bVar == null) {
                this.e = new ev();
                return;
            }
            sm1 a = bVar.a(this.a, this.b);
            this.e = a;
            Format format = this.d;
            if (format != null) {
                a.d(format);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        sm1 a(int i, int i2);
    }

    public ff(zz zzVar, int i, Format format) {
        this.p = zzVar;
        this.q = i;
        this.r = format;
    }

    @Override // com.daaw.d00
    public sm1 a(int i, int i2) {
        a aVar = this.s.get(i);
        if (aVar == null) {
            s6.f(this.w == null);
            aVar = new a(i, i2, i2 == this.q ? this.r : null);
            aVar.e(this.u);
            this.s.put(i, aVar);
        }
        return aVar;
    }

    public Format[] b() {
        return this.w;
    }

    public da1 c() {
        return this.v;
    }

    @Override // com.daaw.d00
    public void d(da1 da1Var) {
        this.v = da1Var;
    }

    public void e(b bVar, long j) {
        this.u = bVar;
        if (!this.t) {
            this.p.i(this);
            if (j != -9223372036854775807L) {
                this.p.f(0L, j);
            }
            this.t = true;
            return;
        }
        zz zzVar = this.p;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        zzVar.f(0L, j);
        for (int i = 0; i < this.s.size(); i++) {
            this.s.valueAt(i).e(bVar);
        }
    }

    @Override // com.daaw.d00
    public void n() {
        Format[] formatArr = new Format[this.s.size()];
        for (int i = 0; i < this.s.size(); i++) {
            formatArr[i] = this.s.valueAt(i).d;
        }
        this.w = formatArr;
    }
}
