package com.daaw;
/* loaded from: classes.dex */
public final class n42 {

    /* renamed from: a */
    public final byte[] f19467a = new byte[10];

    /* renamed from: b */
    public boolean f19468b;

    /* renamed from: c */
    public int f19469c;

    /* renamed from: d */
    public long f19470d;

    /* renamed from: e */
    public int f19471e;

    /* renamed from: f */
    public int f19472f;

    /* renamed from: g */
    public int f19473g;

    /* renamed from: a */
    public final void m15532a(m42 m42Var, l42 l42Var) {
        if (this.f19469c > 0) {
            m42Var.mo16222b(this.f19470d, this.f19471e, this.f19472f, this.f19473g, l42Var);
            this.f19469c = 0;
        }
    }

    /* renamed from: b */
    public final void m15531b() {
        this.f19468b = false;
        this.f19469c = 0;
    }

    /* renamed from: c */
    public final void m15530c(m42 m42Var, long j, int i, int i2, int i3, l42 l42Var) {
        if (this.f19473g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f19468b) {
            int i4 = this.f19469c;
            int i5 = i4 + 1;
            this.f19469c = i5;
            if (i4 == 0) {
                this.f19470d = j;
                this.f19471e = i;
                this.f19472f = 0;
            }
            this.f19472f += i2;
            this.f19473g = i3;
            if (i5 >= 16) {
                m15532a(m42Var, l42Var);
            }
        }
    }

    /* renamed from: d */
    public final void m15529d(k09 k09Var) {
        if (this.f19468b) {
            return;
        }
        k09Var.mo5659j(this.f19467a, 0, 10);
        k09Var.zzj();
        byte[] bArr = this.f19467a;
        int i = cz8.f6322g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f19468b = true;
        }
    }
}
