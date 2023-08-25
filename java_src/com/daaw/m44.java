package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class m44 implements kx2 {

    /* renamed from: a */
    public final kx2 f18433a;

    /* renamed from: b */
    public final long f18434b;

    /* renamed from: c */
    public final kx2 f18435c;

    /* renamed from: d */
    public long f18436d;

    /* renamed from: e */
    public Uri f18437e;

    public m44(kx2 kx2Var, int i, kx2 kx2Var2) {
        this.f18433a = kx2Var;
        this.f18434b = i;
        this.f18435c = kx2Var2;
    }

    @Override // com.daaw.kx2
    /* renamed from: a */
    public final int mo5585a(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f18436d;
        long j2 = this.f18434b;
        if (j < j2) {
            int mo5585a = this.f18433a.mo5585a(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.f18436d + mo5585a;
            this.f18436d = j3;
            i3 = mo5585a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.f18434b) {
            int mo5585a2 = this.f18435c.mo5585a(bArr, i + i3, i2 - i3);
            this.f18436d += mo5585a2;
            return i3 + mo5585a2;
        }
        return i3;
    }

    @Override // com.daaw.kx2
    /* renamed from: b */
    public final long mo5584b(mx2 mx2Var) {
        mx2 mx2Var2;
        this.f18437e = mx2Var.f19263a;
        long j = mx2Var.f19265c;
        long j2 = this.f18434b;
        mx2 mx2Var3 = null;
        if (j >= j2) {
            mx2Var2 = null;
        } else {
            long j3 = mx2Var.f19266d;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            mx2Var2 = new mx2(mx2Var.f19263a, null, j, j, j4, null, 0);
        }
        long j5 = mx2Var.f19266d;
        if (j5 == -1 || mx2Var.f19265c + j5 > this.f18434b) {
            long max = Math.max(this.f18434b, mx2Var.f19265c);
            long j6 = mx2Var.f19266d;
            mx2Var3 = new mx2(mx2Var.f19263a, null, max, max, j6 != -1 ? Math.min(j6, (mx2Var.f19265c + j6) - this.f18434b) : -1L, null, 0);
        }
        long mo5584b = mx2Var2 != null ? this.f18433a.mo5584b(mx2Var2) : 0L;
        long mo5584b2 = mx2Var3 != null ? this.f18435c.mo5584b(mx2Var3) : 0L;
        this.f18436d = mx2Var.f19265c;
        if (mo5584b2 == -1) {
            return -1L;
        }
        return mo5584b + mo5584b2;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        return this.f18437e;
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        this.f18433a.zzd();
        this.f18435c.zzd();
    }
}
