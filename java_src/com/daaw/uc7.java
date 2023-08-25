package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class uc7 implements to7 {
    public final String a;
    public final int b;
    public mj7 c;
    public li7 d;
    public int e;
    public yj7 f;

    public uc7(vm7 vm7Var) {
        String Q = vm7Var.Q();
        this.a = Q;
        if (Q.equals(z97.b)) {
            try {
                pj7 O = pj7.O(vm7Var.P(), vr7.a());
                this.c = (mj7) w97.d(vm7Var);
                this.b = O.L();
            } catch (xs7 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (Q.equals(z97.a)) {
            try {
                oi7 N = oi7.N(vm7Var.P(), vr7.a());
                this.d = (li7) w97.d(vm7Var);
                this.e = N.O().L();
                this.b = this.e + N.P().L();
            } catch (xs7 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (!Q.equals(cc7.a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(Q)));
        } else {
            try {
                bk7 O2 = bk7.O(vm7Var.P(), vr7.a());
                this.f = (yj7) w97.d(vm7Var);
                this.b = O2.L();
            } catch (xs7 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
    }

    @Override // com.daaw.to7
    public final qd7 b(byte[] bArr) {
        if (bArr.length == this.b) {
            if (this.a.equals(z97.b)) {
                lj7 M = mj7.M();
                M.k(this.c);
                M.s(yq7.G(bArr, 0, this.b));
                return new qd7((a87) w97.h(this.a, (mj7) M.n(), a87.class));
            } else if (!this.a.equals(z97.a)) {
                if (this.a.equals(cc7.a)) {
                    xj7 M2 = yj7.M();
                    M2.k(this.f);
                    M2.s(yq7.G(bArr, 0, this.b));
                    return new qd7((j87) w97.h(this.a, (yj7) M2.n(), j87.class));
                }
                throw new GeneralSecurityException("unknown DEM key type");
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.e, this.b);
                qi7 M3 = ri7.M();
                M3.k(this.d.P());
                M3.s(yq7.F(copyOfRange));
                kl7 M4 = ll7.M();
                M4.k(this.d.Q());
                M4.s(yq7.F(copyOfRange2));
                ki7 M5 = li7.M();
                M5.u(this.d.L());
                M5.s((ri7) M3.n());
                M5.t((ll7) M4.n());
                return new qd7((a87) w97.h(this.a, (li7) M5.n(), a87.class));
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.daaw.to7
    public final int zza() {
        return this.b;
    }
}
