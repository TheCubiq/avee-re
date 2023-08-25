package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class m44 implements kx2 {
    public final kx2 a;
    public final long b;
    public final kx2 c;
    public long d;
    public Uri e;

    public m44(kx2 kx2Var, int i, kx2 kx2Var2) {
        this.a = kx2Var;
        this.b = i;
        this.c = kx2Var2;
    }

    @Override // com.daaw.kx2
    public final int a(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int a = this.a.a(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + a;
            this.d = j3;
            i3 = a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.b) {
            int a2 = this.c.a(bArr, i + i3, i2 - i3);
            this.d += a2;
            return i3 + a2;
        }
        return i3;
    }

    @Override // com.daaw.kx2
    public final long b(mx2 mx2Var) {
        mx2 mx2Var2;
        this.e = mx2Var.a;
        long j = mx2Var.c;
        long j2 = this.b;
        mx2 mx2Var3 = null;
        if (j >= j2) {
            mx2Var2 = null;
        } else {
            long j3 = mx2Var.d;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            mx2Var2 = new mx2(mx2Var.a, null, j, j, j4, null, 0);
        }
        long j5 = mx2Var.d;
        if (j5 == -1 || mx2Var.c + j5 > this.b) {
            long max = Math.max(this.b, mx2Var.c);
            long j6 = mx2Var.d;
            mx2Var3 = new mx2(mx2Var.a, null, max, max, j6 != -1 ? Math.min(j6, (mx2Var.c + j6) - this.b) : -1L, null, 0);
        }
        long b = mx2Var2 != null ? this.a.b(mx2Var2) : 0L;
        long b2 = mx2Var3 != null ? this.c.b(mx2Var3) : 0L;
        this.d = mx2Var.c;
        if (b2 == -1) {
            return -1L;
        }
        return b + b2;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }
}
