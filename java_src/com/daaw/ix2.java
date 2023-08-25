package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ix2 implements kx2 {
    public final byte[] a;
    public Uri b;
    public int c;
    public int d;

    public ix2(byte[] bArr) {
        Objects.requireNonNull(bArr);
        az2.c(bArr.length > 0);
        this.a = bArr;
    }

    @Override // com.daaw.kx2
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.a, this.c, bArr, i, min);
        this.c += min;
        this.d -= min;
        return min;
    }

    @Override // com.daaw.kx2
    public final long b(mx2 mx2Var) {
        this.b = mx2Var.a;
        long j = mx2Var.c;
        int i = (int) j;
        this.c = i;
        long j2 = mx2Var.d;
        long j3 = -1;
        if (j2 == -1) {
            j2 = this.a.length - j;
        } else {
            j3 = j2;
        }
        int i2 = (int) j2;
        this.d = i2;
        if (i2 <= 0 || i + i2 > this.a.length) {
            int length = this.a.length;
            throw new IOException("Unsatisfiable range: [" + i + ", " + j3 + "], length: " + length);
        }
        return i2;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        return this.b;
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        this.b = null;
    }
}
