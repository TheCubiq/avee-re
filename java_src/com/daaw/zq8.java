package com.daaw;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zq8 implements p46 {
    public final p46 a;
    public final int b;
    public final yq8 c;
    public final byte[] d;
    public int e;

    public zq8(p46 p46Var, int i, yq8 yq8Var) {
        uo4.d(i > 0);
        this.a = p46Var;
        this.b = i;
        this.c = yq8Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.a(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.a.a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.c.a(new ik5(bArr2, i5));
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int a2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    @Override // com.daaw.p46
    public final void d(qz6 qz6Var) {
        Objects.requireNonNull(qz6Var);
        this.a.d(qz6Var);
    }

    @Override // com.daaw.p46
    public final long g(pa6 pa6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.daaw.p46
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.p46
    public final Map zze() {
        return this.a.zze();
    }
}
