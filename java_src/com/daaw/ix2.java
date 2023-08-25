package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ix2 implements kx2 {

    /* renamed from: a */
    public final byte[] f14101a;

    /* renamed from: b */
    public Uri f14102b;

    /* renamed from: c */
    public int f14103c;

    /* renamed from: d */
    public int f14104d;

    public ix2(byte[] bArr) {
        Objects.requireNonNull(bArr);
        az2.m26585c(bArr.length > 0);
        this.f14101a = bArr;
    }

    @Override // com.daaw.kx2
    /* renamed from: a */
    public final int mo5585a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f14104d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f14101a, this.f14103c, bArr, i, min);
        this.f14103c += min;
        this.f14104d -= min;
        return min;
    }

    @Override // com.daaw.kx2
    /* renamed from: b */
    public final long mo5584b(mx2 mx2Var) {
        this.f14102b = mx2Var.f19263a;
        long j = mx2Var.f19265c;
        int i = (int) j;
        this.f14103c = i;
        long j2 = mx2Var.f19266d;
        long j3 = -1;
        if (j2 == -1) {
            j2 = this.f14101a.length - j;
        } else {
            j3 = j2;
        }
        int i2 = (int) j2;
        this.f14104d = i2;
        if (i2 <= 0 || i + i2 > this.f14101a.length) {
            int length = this.f14101a.length;
            throw new IOException("Unsatisfiable range: [" + i + ", " + j3 + "], length: " + length);
        }
        return i2;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        return this.f14102b;
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        this.f14102b = null;
    }
}
