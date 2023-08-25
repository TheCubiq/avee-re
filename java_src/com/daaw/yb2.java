package com.daaw;
/* loaded from: classes.dex */
public final class yb2 implements ac2 {

    /* renamed from: b */
    public final String f33470b;

    /* renamed from: c */
    public String f33471c;

    /* renamed from: d */
    public m42 f33472d;

    /* renamed from: f */
    public int f33474f;

    /* renamed from: g */
    public int f33475g;

    /* renamed from: h */
    public long f33476h;

    /* renamed from: i */
    public f92 f33477i;

    /* renamed from: j */
    public int f33478j;

    /* renamed from: a */
    public final ik5 f33469a = new ik5(new byte[18]);

    /* renamed from: e */
    public int f33473e = 0;

    /* renamed from: k */
    public long f33479k = -9223372036854775807L;

    public yb2(String str) {
        this.f33470b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    @Override // com.daaw.ac2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2553a(ik5 ik5Var) {
        int i;
        byte b;
        boolean z;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        int i5;
        uo4.m7876b(this.f33472d);
        while (ik5Var.m19713i() > 0) {
            int i6 = this.f33473e;
            if (i6 == 0) {
                while (ik5Var.m19713i() > 0) {
                    int i7 = this.f33475g << 8;
                    this.f33475g = i7;
                    int m19703s = i7 | ik5Var.m19703s();
                    this.f33475g = m19703s;
                    int i8 = g09.f10137d;
                    if (m19703s == 2147385345 || m19703s == -25230976 || m19703s == 536864768 || m19703s == -14745368) {
                        byte[] m19714h = this.f33469a.m19714h();
                        int i9 = this.f33475g;
                        m19714h[0] = (byte) ((i9 >> 24) & 255);
                        m19714h[1] = (byte) ((i9 >> 16) & 255);
                        m19714h[2] = (byte) ((i9 >> 8) & 255);
                        m19714h[3] = (byte) (i9 & 255);
                        this.f33474f = 4;
                        this.f33475g = 0;
                        this.f33473e = 1;
                        break;
                    }
                    while (ik5Var.m19713i() > 0) {
                    }
                }
            } else if (i6 != 1) {
                int min = Math.min(ik5Var.m19713i(), this.f33478j - this.f33474f);
                this.f33472d.mo16221c(ik5Var, min);
                int i10 = this.f33474f + min;
                this.f33474f = i10;
                int i11 = this.f33478j;
                if (i10 == i11) {
                    long j = this.f33479k;
                    if (j != -9223372036854775807L) {
                        this.f33472d.mo16222b(j, 1, i11, 0, null);
                        this.f33479k += this.f33476h;
                    }
                    this.f33473e = 0;
                }
            } else {
                byte[] m19714h2 = this.f33469a.m19714h();
                int min2 = Math.min(ik5Var.m19713i(), 18 - this.f33474f);
                ik5Var.m19720b(m19714h2, this.f33474f, min2);
                int i12 = this.f33474f + min2;
                this.f33474f = i12;
                if (i12 == 18) {
                    byte[] m19714h3 = this.f33469a.m19714h();
                    if (this.f33477i == null) {
                        f92 m22102a = g09.m22102a(m19714h3, this.f33471c, this.f33470b, null);
                        this.f33477i = m22102a;
                        this.f33472d.mo16218f(m22102a);
                    }
                    int i13 = g09.f10137d;
                    byte b5 = m19714h3[0];
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i5 = ((m19714h3[7] & 3) << 12) | ((m19714h3[6] & 255) << 4) | ((m19714h3[9] & 60) >> 2);
                        } else if (b5 != 31) {
                            i = ((m19714h3[5] & 3) << 12) | ((m19714h3[6] & 255) << 4);
                            b = m19714h3[7];
                        } else {
                            i5 = ((m19714h3[8] & 60) >> 2) | ((3 & m19714h3[6]) << 12) | ((m19714h3[7] & 255) << 4);
                        }
                        i2 = i5 + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.f33478j = i2;
                        b2 = m19714h3[0];
                        if (b2 == -2) {
                            if (b2 == -1) {
                                i3 = (m19714h3[4] & 7) << 4;
                                b4 = m19714h3[7];
                            } else if (b2 != 31) {
                                i3 = (m19714h3[4] & 1) << 6;
                                b3 = m19714h3[5];
                            } else {
                                i3 = (m19714h3[5] & 7) << 4;
                                b4 = m19714h3[6];
                            }
                            i4 = b4 & 60;
                            this.f33476h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.f33477i.f9289z);
                            this.f33469a.m19716f(0);
                            this.f33472d.mo16221c(this.f33469a, 18);
                            this.f33473e = 2;
                        } else {
                            i3 = (m19714h3[5] & 1) << 6;
                            b3 = m19714h3[4];
                        }
                        i4 = b3 & 252;
                        this.f33476h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.f33477i.f9289z);
                        this.f33469a.m19716f(0);
                        this.f33472d.mo16221c(this.f33469a, 18);
                        this.f33473e = 2;
                    } else {
                        i = ((m19714h3[4] & 3) << 12) | ((m19714h3[7] & 255) << 4);
                        b = m19714h3[6];
                    }
                    i2 = (i | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                    }
                    this.f33478j = i2;
                    b2 = m19714h3[0];
                    if (b2 == -2) {
                    }
                    i4 = b3 & 252;
                    this.f33476h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.f33477i.f9289z);
                    this.f33469a.m19716f(0);
                    this.f33472d.mo16221c(this.f33469a, 18);
                    this.f33473e = 2;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f33471c = td2Var.m9283b();
        this.f33472d = m09Var.mo3292n(td2Var.m9284a(), 1);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f33479k = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f33473e = 0;
        this.f33474f = 0;
        this.f33475g = 0;
        this.f33479k = -9223372036854775807L;
    }
}
