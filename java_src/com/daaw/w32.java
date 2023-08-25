package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class w32 {

    /* renamed from: a */
    public final ik5 f30864a = new ik5(10);

    /* renamed from: a */
    public final zzbq m6546a(k09 k09Var, i72 i72Var) {
        zzbq zzbqVar = null;
        int i = 0;
        while (true) {
            try {
                ((rz8) k09Var).mo5661h(this.f30864a.m19714h(), 0, 10, false);
                this.f30864a.m19716f(0);
                if (this.f30864a.m19701u() != 4801587) {
                    break;
                }
                this.f30864a.m19715g(3);
                int m19704r = this.f30864a.m19704r();
                int i2 = m19704r + 10;
                if (zzbqVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f30864a.m19714h(), 0, bArr, 0, 10);
                    ((rz8) k09Var).mo5661h(bArr, 10, m19704r, false);
                    zzbqVar = k72.m18008a(bArr, i2, i72Var, new o62());
                } else {
                    ((rz8) k09Var).m10812k(m19704r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        k09Var.zzj();
        ((rz8) k09Var).m10812k(i, false);
        return zzbqVar;
    }
}
