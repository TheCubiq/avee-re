package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class w32 {
    public final ik5 a = new ik5(10);

    public final zzbq a(k09 k09Var, i72 i72Var) {
        zzbq zzbqVar = null;
        int i = 0;
        while (true) {
            try {
                ((rz8) k09Var).h(this.a.h(), 0, 10, false);
                this.a.f(0);
                if (this.a.u() != 4801587) {
                    break;
                }
                this.a.g(3);
                int r = this.a.r();
                int i2 = r + 10;
                if (zzbqVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.h(), 0, bArr, 0, 10);
                    ((rz8) k09Var).h(bArr, 10, r, false);
                    zzbqVar = k72.a(bArr, i2, i72Var, new o62());
                } else {
                    ((rz8) k09Var).k(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        k09Var.zzj();
        ((rz8) k09Var).k(i, false);
        return zzbqVar;
    }
}
