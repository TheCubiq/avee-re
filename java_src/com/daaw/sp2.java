package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class sp2 {

    /* renamed from: a */
    public final wv2 f26480a;

    /* renamed from: b */
    public final Object f26481b;

    /* renamed from: c */
    public final int f26482c;

    /* renamed from: d */
    public final iw2[] f26483d;

    /* renamed from: e */
    public final boolean[] f26484e;

    /* renamed from: f */
    public final long f26485f;

    /* renamed from: g */
    public int f26486g;

    /* renamed from: h */
    public long f26487h;

    /* renamed from: i */
    public boolean f26488i;

    /* renamed from: j */
    public boolean f26489j;

    /* renamed from: k */
    public boolean f26490k;

    /* renamed from: l */
    public sp2 f26491l;

    /* renamed from: m */
    public gx2 f26492m;

    /* renamed from: n */
    public final gq2[] f26493n;

    /* renamed from: o */
    public final hq2[] f26494o;

    /* renamed from: p */
    public final fx2 f26495p;

    /* renamed from: q */
    public final yv2 f26496q;

    /* renamed from: r */
    public gx2 f26497r;

    /* renamed from: s */
    public final y34 f26498s;

    public sp2(gq2[] gq2VarArr, hq2[] hq2VarArr, long j, fx2 fx2Var, y34 y34Var, yv2 yv2Var, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.f26493n = gq2VarArr;
        this.f26494o = hq2VarArr;
        this.f26485f = j;
        this.f26495p = fx2Var;
        this.f26498s = y34Var;
        this.f26496q = yv2Var;
        Objects.requireNonNull(obj);
        this.f26481b = obj;
        this.f26482c = i;
        this.f26486g = i2;
        this.f26488i = z;
        this.f26487h = j2;
        this.f26483d = new iw2[2];
        this.f26484e = new boolean[2];
        this.f26480a = yv2Var.mo3167c(i2, y34Var.m4147l());
    }

    /* renamed from: a */
    public final long m10093a(long j, boolean z) {
        return m10092b(j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long m10092b(long j, boolean z, boolean[] zArr) {
        dx2 dx2Var = this.f26492m.f11832b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f26484e;
            if (z || !this.f26492m.m21146a(this.f26497r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long mo1843g = this.f26480a.mo1843g(dx2Var.m23829b(), this.f26484e, this.f26483d, zArr, j);
        this.f26497r = this.f26492m;
        this.f26490k = false;
        int i2 = 0;
        while (true) {
            iw2[] iw2VarArr = this.f26483d;
            if (i2 >= 2) {
                this.f26498s.m4155d(this.f26493n, this.f26492m.f11831a, dx2Var);
                return mo1843g;
            }
            if (iw2VarArr[i2] != null) {
                az2.m26583e(dx2Var.m23830a(i2) != null);
                this.f26490k = true;
            } else {
                az2.m26583e(dx2Var.m23830a(i2) == null);
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m10091c() {
        try {
            this.f26496q.mo3169a(this.f26480a);
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: d */
    public final boolean m10090d() {
        return this.f26489j && (!this.f26490k || this.f26480a.zzg() == Long.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean m10089e() {
        gx2 mo22150a = this.f26495p.mo22150a(this.f26494o, this.f26480a.zzn());
        gx2 gx2Var = this.f26497r;
        if (gx2Var != null) {
            for (int i = 0; i < 2; i++) {
                if (mo22150a.m21146a(gx2Var, i)) {
                }
            }
            return false;
        }
        this.f26492m = mo22150a;
        return true;
    }
}
