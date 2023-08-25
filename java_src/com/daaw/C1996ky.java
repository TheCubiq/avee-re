package com.daaw;

import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.ky */
/* loaded from: classes.dex */
public final class C1996ky implements d81 {

    /* renamed from: p */
    public final Format f16836p;

    /* renamed from: r */
    public long[] f16838r;

    /* renamed from: s */
    public boolean f16839s;

    /* renamed from: t */
    public C2989sy f16840t;

    /* renamed from: u */
    public boolean f16841u;

    /* renamed from: v */
    public int f16842v;

    /* renamed from: q */
    public final C1888jy f16837q = new C1888jy();

    /* renamed from: w */
    public long f16843w = -9223372036854775807L;

    public C1996ky(C2989sy c2989sy, Format format, boolean z) {
        this.f16836p = format;
        this.f16840t = c2989sy;
        this.f16838r = c2989sy.f26785b;
        m17351e(c2989sy, z);
    }

    @Override // com.daaw.d81
    /* renamed from: a */
    public void mo3789a() {
    }

    /* renamed from: b */
    public String m17353b() {
        return this.f16840t.m9736a();
    }

    /* renamed from: c */
    public void m17352c(long j) {
        boolean z = true;
        int m10014c = sq1.m10014c(this.f16838r, j, true, false);
        this.f16842v = m10014c;
        if (!((this.f16839s && m10014c == this.f16838r.length) ? false : false)) {
            j = -9223372036854775807L;
        }
        this.f16843w = j;
    }

    @Override // com.daaw.d81
    /* renamed from: d */
    public boolean mo3787d() {
        return true;
    }

    /* renamed from: e */
    public void m17351e(C2989sy c2989sy, boolean z) {
        int i = this.f16842v;
        long j = i == 0 ? -9223372036854775807L : this.f16838r[i - 1];
        this.f16839s = z;
        this.f16840t = c2989sy;
        long[] jArr = c2989sy.f26785b;
        this.f16838r = jArr;
        long j2 = this.f16843w;
        if (j2 != -9223372036854775807L) {
            m17352c(j2);
        } else if (j != -9223372036854775807L) {
            this.f16842v = sq1.m10014c(jArr, j, false, false);
        }
    }

    @Override // com.daaw.d81
    /* renamed from: j */
    public int mo3786j(k30 k30Var, C1454gq c1454gq, boolean z) {
        if (z || !this.f16841u) {
            k30Var.f15633a = this.f16836p;
            this.f16841u = true;
            return -5;
        }
        int i = this.f16842v;
        if (i == this.f16838r.length) {
            if (this.f16839s) {
                return -3;
            }
            c1454gq.m11435l(4);
            return -4;
        }
        this.f16842v = i + 1;
        C1888jy c1888jy = this.f16837q;
        C2989sy c2989sy = this.f16840t;
        byte[] m18173a = c1888jy.m18173a(c2989sy.f26784a[i], c2989sy.f26788e);
        if (m18173a != null) {
            c1454gq.m21351n(m18173a.length);
            c1454gq.m11435l(1);
            c1454gq.f11565r.put(m18173a);
            c1454gq.f11566s = this.f16838r[i];
            return -4;
        }
        return -3;
    }

    @Override // com.daaw.d81
    /* renamed from: n */
    public int mo3785n(long j) {
        int max = Math.max(this.f16842v, sq1.m10014c(this.f16838r, j, true, false));
        int i = max - this.f16842v;
        this.f16842v = max;
        return i;
    }
}
