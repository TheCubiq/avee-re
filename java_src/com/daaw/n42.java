package com.daaw;
/* loaded from: classes.dex */
public final class n42 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(m42 m42Var, l42 l42Var) {
        if (this.c > 0) {
            m42Var.b(this.d, this.e, this.f, this.g, l42Var);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(m42 m42Var, long j, int i, int i2, int i3, l42 l42Var) {
        if (this.g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(m42Var, l42Var);
            }
        }
    }

    public final void d(k09 k09Var) {
        if (this.b) {
            return;
        }
        k09Var.j(this.a, 0, 10);
        k09Var.zzj();
        byte[] bArr = this.a;
        int i = cz8.g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
