package com.daaw;
/* loaded from: classes.dex */
public final class j78 {

    /* renamed from: a */
    public final nr8 f14502a;

    /* renamed from: b */
    public final Object f14503b;

    /* renamed from: c */
    public final mt8[] f14504c;

    /* renamed from: d */
    public boolean f14505d;

    /* renamed from: e */
    public boolean f14506e;

    /* renamed from: f */
    public m78 f14507f;

    /* renamed from: g */
    public boolean f14508g;

    /* renamed from: h */
    public final boolean[] f14509h;

    /* renamed from: i */
    public final l98[] f14510i;

    /* renamed from: j */
    public final zv8 f14511j;

    /* renamed from: k */
    public final n88 f14512k;

    /* renamed from: l */
    public j78 f14513l;

    /* renamed from: m */
    public au8 f14514m;

    /* renamed from: n */
    public fw8 f14515n;

    /* renamed from: o */
    public long f14516o;

    public j78(l98[] l98VarArr, long j, zv8 zv8Var, nw8 nw8Var, n88 n88Var, m78 m78Var, fw8 fw8Var, byte[] bArr) {
        this.f14510i = l98VarArr;
        this.f14516o = j;
        this.f14511j = zv8Var;
        this.f14512k = n88Var;
        pr8 pr8Var = m78Var.f18573a;
        this.f14503b = pr8Var.f18805a;
        this.f14507f = m78Var;
        this.f14514m = au8.f3666d;
        this.f14515n = fw8Var;
        this.f14504c = new mt8[2];
        this.f14509h = new boolean[2];
        long j2 = m78Var.f18574b;
        long j3 = m78Var.f18576d;
        nr8 m15398o = n88Var.m15398o(pr8Var, nw8Var, j2);
        this.f14502a = j3 != -9223372036854775807L ? new oq8(m15398o, true, 0L, j3) : m15398o;
    }

    /* renamed from: a */
    public final long m18759a(fw8 fw8Var, long j, boolean z) {
        return m18758b(fw8Var, j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long m18758b(fw8 fw8Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= fw8Var.f10040a) {
                break;
            }
            boolean[] zArr2 = this.f14509h;
            if (z || !fw8Var.m22182a(this.f14515n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            l98[] l98VarArr = this.f14510i;
            if (i2 >= 2) {
                break;
            }
            l98VarArr[i2].zzb();
            i2++;
        }
        m18741s();
        this.f14515n = fw8Var;
        m18740t();
        long mo3295k = this.f14502a.mo3295k(fw8Var.f10042c, this.f14509h, this.f14504c, zArr, j);
        int i3 = 0;
        while (true) {
            l98[] l98VarArr2 = this.f14510i;
            if (i3 >= 2) {
                break;
            }
            l98VarArr2[i3].zzb();
            i3++;
        }
        this.f14506e = false;
        int i4 = 0;
        while (true) {
            mt8[] mt8VarArr = this.f14504c;
            if (i4 >= 2) {
                return mo3295k;
            }
            if (mt8VarArr[i4] != null) {
                uo4.m7872f(fw8Var.m22181b(i4));
                this.f14510i[i4].zzb();
                this.f14506e = true;
            } else {
                uo4.m7872f(fw8Var.f10042c[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final long m18757c() {
        if (this.f14505d) {
            long zzb = this.f14506e ? this.f14502a.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.f14507f.f18577e : zzb;
        }
        return this.f14507f.f18574b;
    }

    /* renamed from: d */
    public final long m18756d() {
        if (this.f14505d) {
            return this.f14502a.zzc();
        }
        return 0L;
    }

    /* renamed from: e */
    public final long m18755e() {
        return this.f14516o;
    }

    /* renamed from: f */
    public final long m18754f() {
        return this.f14507f.f18574b + this.f14516o;
    }

    /* renamed from: g */
    public final j78 m18753g() {
        return this.f14513l;
    }

    /* renamed from: h */
    public final au8 m18752h() {
        return this.f14514m;
    }

    /* renamed from: i */
    public final fw8 m18751i() {
        return this.f14515n;
    }

    /* renamed from: j */
    public final fw8 m18750j(float f, l64 l64Var) {
        tv8[] tv8VarArr;
        fw8 mo1832d = this.f14511j.mo1832d(this.f14510i, this.f14514m, this.f14507f.f18573a, l64Var);
        for (tv8 tv8Var : mo1832d.f10042c) {
        }
        return mo1832d;
    }

    /* renamed from: k */
    public final void m18749k(long j) {
        uo4.m7872f(m18739u());
        this.f14502a.mo3303c(j - this.f14516o);
    }

    /* renamed from: l */
    public final void m18748l(float f, l64 l64Var) {
        this.f14505d = true;
        this.f14514m = this.f14502a.zzh();
        fw8 m18750j = m18750j(f, l64Var);
        m78 m78Var = this.f14507f;
        long j = m78Var.f18574b;
        long j2 = m78Var.f18577e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long m18759a = m18759a(m18750j, j, false);
        long j3 = this.f14516o;
        m78 m78Var2 = this.f14507f;
        this.f14516o = j3 + (m78Var2.f18574b - m18759a);
        this.f14507f = m78Var2.m16184b(m18759a);
    }

    /* renamed from: m */
    public final void m18747m(long j) {
        uo4.m7872f(m18739u());
        if (this.f14505d) {
            this.f14502a.mo3296j(j - this.f14516o);
        }
    }

    /* renamed from: n */
    public final void m18746n() {
        m18741s();
        n88 n88Var = this.f14512k;
        nr8 nr8Var = this.f14502a;
        try {
            if (nr8Var instanceof oq8) {
                n88Var.m15405h(((oq8) nr8Var).f21840p);
            } else {
                n88Var.m15405h(nr8Var);
            }
        } catch (RuntimeException e) {
            s95.m10495c("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public final void m18745o(j78 j78Var) {
        if (j78Var == this.f14513l) {
            return;
        }
        m18741s();
        this.f14513l = j78Var;
        m18740t();
    }

    /* renamed from: p */
    public final void m18744p(long j) {
        this.f14516o = 1000000000000L;
    }

    /* renamed from: q */
    public final void m18743q() {
        nr8 nr8Var = this.f14502a;
        if (nr8Var instanceof oq8) {
            long j = this.f14507f.f18576d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((oq8) nr8Var).m14066f(0L, j);
        }
    }

    /* renamed from: r */
    public final boolean m18742r() {
        return this.f14505d && (!this.f14506e || this.f14502a.zzb() == Long.MIN_VALUE);
    }

    /* renamed from: s */
    public final void m18741s() {
        if (!m18739u()) {
            return;
        }
        int i = 0;
        while (true) {
            fw8 fw8Var = this.f14515n;
            if (i >= fw8Var.f10040a) {
                return;
            }
            fw8Var.m22181b(i);
            tv8 tv8Var = this.f14515n.f10042c[i];
            i++;
        }
    }

    /* renamed from: t */
    public final void m18740t() {
        if (!m18739u()) {
            return;
        }
        int i = 0;
        while (true) {
            fw8 fw8Var = this.f14515n;
            if (i >= fw8Var.f10040a) {
                return;
            }
            fw8Var.m22181b(i);
            tv8 tv8Var = this.f14515n.f10042c[i];
            i++;
        }
    }

    /* renamed from: u */
    public final boolean m18739u() {
        return this.f14513l == null;
    }
}
