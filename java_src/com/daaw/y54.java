package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class y54 implements p46 {
    public final p46 a;
    public final long b;
    public final p46 c;
    public long d;
    public Uri e;

    public y54(p46 p46Var, int i, p46 p46Var2) {
        this.a = p46Var;
        this.b = i;
        this.c = p46Var2;
    }

    @Override // com.daaw.xp8
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

    @Override // com.daaw.p46
    public final void d(qz6 qz6Var) {
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        pa6 pa6Var2;
        this.e = pa6Var.a;
        long j = pa6Var.f;
        long j2 = this.b;
        pa6 pa6Var3 = null;
        if (j >= j2) {
            pa6Var2 = null;
        } else {
            long j3 = pa6Var.g;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            pa6Var2 = new pa6(pa6Var.a, null, j, j, j4, null, 0);
        }
        long j5 = pa6Var.g;
        if (j5 == -1 || pa6Var.f + j5 > this.b) {
            long max = Math.max(this.b, pa6Var.f);
            long j6 = pa6Var.g;
            pa6Var3 = new pa6(pa6Var.a, null, max, max, j6 != -1 ? Math.min(j6, (pa6Var.f + j6) - this.b) : -1L, null, 0);
        }
        long g = pa6Var2 != null ? this.a.g(pa6Var2) : 0L;
        long g2 = pa6Var3 != null ? this.c.g(pa6Var3) : 0L;
        this.d = pa6Var.f;
        if (g == -1 || g2 == -1) {
            return -1L;
        }
        return g + g2;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // com.daaw.p46
    public final Map zze() {
        return b27.d();
    }
}
