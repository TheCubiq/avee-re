package com.daaw;

import android.net.Uri;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yy5 extends sx5 {
    public final byte[] e;
    public Uri f;
    public int g;
    public int h;
    public boolean i;

    public yy5(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        uo4.d(bArr.length > 0);
        this.e = bArr;
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.e, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        this.f = pa6Var.a;
        l(pa6Var);
        long j = pa6Var.f;
        int length = this.e.length;
        if (j <= length) {
            int i = (int) j;
            this.g = i;
            int i2 = length - i;
            this.h = i2;
            long j2 = pa6Var.g;
            if (j2 != -1) {
                this.h = (int) Math.min(i2, j2);
            }
            this.i = true;
            m(pa6Var);
            long j3 = pa6Var.g;
            return j3 != -1 ? j3 : this.h;
        }
        throw new s56(2008);
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        if (this.i) {
            this.i = false;
            k();
        }
        this.f = null;
    }
}
