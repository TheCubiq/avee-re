package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class uc7 implements to7 {

    /* renamed from: a */
    public final String f28886a;

    /* renamed from: b */
    public final int f28887b;

    /* renamed from: c */
    public mj7 f28888c;

    /* renamed from: d */
    public li7 f28889d;

    /* renamed from: e */
    public int f28890e;

    /* renamed from: f */
    public yj7 f28891f;

    public uc7(vm7 vm7Var) {
        String m7023Q = vm7Var.m7023Q();
        this.f28886a = m7023Q;
        if (m7023Q.equals(z97.f34629b)) {
            try {
                pj7 m13323O = pj7.m13323O(vm7Var.m7024P(), vr7.m6834a());
                this.f28888c = (mj7) w97.m6295d(vm7Var);
                this.f28887b = m13323O.m13326L();
            } catch (xs7 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (m7023Q.equals(z97.f34628a)) {
            try {
                oi7 m14263N = oi7.m14263N(vm7Var.m7024P(), vr7.m6834a());
                this.f28889d = (li7) w97.m6295d(vm7Var);
                this.f28890e = m14263N.m14262O().m8110L();
                this.f28887b = this.f28890e + m14263N.m14261P().m11192L();
            } catch (xs7 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (!m7023Q.equals(cc7.f5719a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(m7023Q)));
        } else {
            try {
                bk7 m26082O = bk7.m26082O(vm7Var.m7024P(), vr7.m6834a());
                this.f28891f = (yj7) w97.m6295d(vm7Var);
                this.f28887b = m26082O.m26085L();
            } catch (xs7 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
    }

    @Override // com.daaw.to7
    /* renamed from: b */
    public final qd7 mo8319b(byte[] bArr) {
        if (bArr.length == this.f28887b) {
            if (this.f28886a.equals(z97.f34629b)) {
                lj7 m16010M = mj7.m16010M();
                m16010M.m22317k(this.f28888c);
                m16010M.m16900s(yq7.m3423G(bArr, 0, this.f28887b));
                return new qd7((a87) w97.m6291h(this.f28886a, (mj7) m16010M.m22315n(), a87.class));
            } else if (!this.f28886a.equals(z97.f34628a)) {
                if (this.f28886a.equals(cc7.f5719a)) {
                    xj7 m3641M = yj7.m3641M();
                    m3641M.m22317k(this.f28891f);
                    m3641M.m5042s(yq7.m3423G(bArr, 0, this.f28887b));
                    return new qd7((j87) w97.m6291h(this.f28886a, (yj7) m3641M.m22315n(), j87.class));
                }
                throw new GeneralSecurityException("unknown DEM key type");
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f28890e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f28890e, this.f28887b);
                qi7 m11283M = ri7.m11283M();
                m11283M.m22317k(this.f28889d.m16936P());
                m11283M.m12472s(yq7.m3424F(copyOfRange));
                kl7 m16857M = ll7.m16857M();
                m16857M.m22317k(this.f28889d.m16935Q());
                m16857M.m17670s(yq7.m3424F(copyOfRange2));
                ki7 m16939M = li7.m16939M();
                m16939M.m17710u(this.f28889d.m16940L());
                m16939M.m17712s((ri7) m11283M.m22315n());
                m16939M.m17711t((ll7) m16857M.m22315n());
                return new qd7((a87) w97.m6291h(this.f28886a, (li7) m16939M.m22315n(), a87.class));
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.daaw.to7
    public final int zza() {
        return this.f28887b;
    }
}
