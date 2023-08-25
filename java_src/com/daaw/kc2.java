package com.daaw;
/* loaded from: classes.dex */
public final class kc2 {

    /* renamed from: a */
    public final m42 f16159a;

    /* renamed from: b */
    public long f16160b;

    /* renamed from: c */
    public boolean f16161c;

    /* renamed from: d */
    public int f16162d;

    /* renamed from: e */
    public long f16163e;

    /* renamed from: f */
    public boolean f16164f;

    /* renamed from: g */
    public boolean f16165g;

    /* renamed from: h */
    public boolean f16166h;

    /* renamed from: i */
    public boolean f16167i;

    /* renamed from: j */
    public boolean f16168j;

    /* renamed from: k */
    public long f16169k;

    /* renamed from: l */
    public long f16170l;

    /* renamed from: m */
    public boolean f16171m;

    public kc2(m42 m42Var) {
        this.f16159a = m42Var;
    }

    /* renamed from: a */
    public final void m17808a(long j, int i, boolean z) {
        if (this.f16168j && this.f16165g) {
            this.f16171m = this.f16161c;
            this.f16168j = false;
        } else if (this.f16166h || this.f16165g) {
            if (z && this.f16167i) {
                m17804e(i + ((int) (j - this.f16160b)));
            }
            this.f16169k = this.f16160b;
            this.f16170l = this.f16163e;
            this.f16171m = this.f16161c;
            this.f16167i = true;
        }
    }

    /* renamed from: b */
    public final void m17807b(byte[] bArr, int i, int i2) {
        if (this.f16164f) {
            int i3 = this.f16162d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.f16162d = i3 + (i2 - i);
                return;
            }
            this.f16165g = (bArr[i4] & 128) != 0;
            this.f16164f = false;
        }
    }

    /* renamed from: c */
    public final void m17806c() {
        this.f16164f = false;
        this.f16165g = false;
        this.f16166h = false;
        this.f16167i = false;
        this.f16168j = false;
    }

    /* renamed from: d */
    public final void m17805d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f16165g = false;
        this.f16166h = false;
        this.f16163e = j2;
        this.f16162d = 0;
        this.f16160b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f16167i && !this.f16168j) {
                if (z) {
                    m17804e(i);
                }
                this.f16167i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f16166h = !this.f16168j;
                this.f16168j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f16161c = z3;
        this.f16164f = (z3 || i2 <= 9) ? true : true;
    }

    /* renamed from: e */
    public final void m17804e(int i) {
        long j = this.f16170l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.f16171m;
        long j2 = this.f16160b;
        long j3 = this.f16169k;
        this.f16159a.mo16222b(j, z ? 1 : 0, (int) (j2 - j3), i, null);
    }
}
