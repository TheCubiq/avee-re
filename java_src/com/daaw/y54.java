package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class y54 implements p46 {

    /* renamed from: a */
    public final p46 f33372a;

    /* renamed from: b */
    public final long f33373b;

    /* renamed from: c */
    public final p46 f33374c;

    /* renamed from: d */
    public long f33375d;

    /* renamed from: e */
    public Uri f33376e;

    public y54(p46 p46Var, int i, p46 p46Var2) {
        this.f33372a = p46Var;
        this.f33373b = i;
        this.f33374c = p46Var2;
    }

    @Override // com.daaw.xp8
    /* renamed from: a */
    public final int mo1980a(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f33375d;
        long j2 = this.f33373b;
        if (j < j2) {
            int mo1980a = this.f33372a.mo1980a(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.f33375d + mo1980a;
            this.f33375d = j3;
            i3 = mo1980a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.f33373b) {
            int mo1980a2 = this.f33374c.mo1980a(bArr, i + i3, i2 - i3);
            this.f33375d += mo1980a2;
            return i3 + mo1980a2;
        }
        return i3;
    }

    @Override // com.daaw.p46
    /* renamed from: d */
    public final void mo1979d(qz6 qz6Var) {
    }

    @Override // com.daaw.p46
    /* renamed from: g */
    public final long mo1978g(pa6 pa6Var) {
        pa6 pa6Var2;
        this.f33376e = pa6Var.f22769a;
        long j = pa6Var.f22774f;
        long j2 = this.f33373b;
        pa6 pa6Var3 = null;
        if (j >= j2) {
            pa6Var2 = null;
        } else {
            long j3 = pa6Var.f22775g;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            pa6Var2 = new pa6(pa6Var.f22769a, null, j, j, j4, null, 0);
        }
        long j5 = pa6Var.f22775g;
        if (j5 == -1 || pa6Var.f22774f + j5 > this.f33373b) {
            long max = Math.max(this.f33373b, pa6Var.f22774f);
            long j6 = pa6Var.f22775g;
            pa6Var3 = new pa6(pa6Var.f22769a, null, max, max, j6 != -1 ? Math.min(j6, (pa6Var.f22774f + j6) - this.f33373b) : -1L, null, 0);
        }
        long mo1978g = pa6Var2 != null ? this.f33372a.mo1978g(pa6Var2) : 0L;
        long mo1978g2 = pa6Var3 != null ? this.f33374c.mo1978g(pa6Var3) : 0L;
        this.f33375d = pa6Var.f22774f;
        if (mo1978g == -1 || mo1978g2 == -1) {
            return -1L;
        }
        return mo1978g + mo1978g2;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f33376e;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        this.f33372a.zzd();
        this.f33374c.zzd();
    }

    @Override // com.daaw.p46
    public final Map zze() {
        return b27.m26518d();
    }
}
