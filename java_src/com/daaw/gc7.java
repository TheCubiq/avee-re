package com.daaw;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class gc7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ hc7 f11074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc7(hc7 hc7Var, Class cls) {
        super(cls);
        this.f11074b = hc7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        sk7 sk7Var = (sk7) xt7Var;
        KeyPair m25140c = cp7.m25140c(cp7.m25132k(tc7.m9303c(sk7Var.m10222O().m7071P().m23385Q())));
        ECPoint w = ((ECPublicKey) m25140c.getPublic()).getW();
        al7 m26063N = bl7.m26063N();
        m26063N.m27346t(0);
        m26063N.m27347s(sk7Var.m10222O());
        m26063N.m27345u(yq7.m3424F(w.getAffineX().toByteArray()));
        m26063N.m27344v(yq7.m3424F(w.getAffineY().toByteArray()));
        xk7 m3609M = yk7.m3609M();
        m3609M.m5021u(0);
        m3609M.m5022t((bl7) m26063N.m22315n());
        m3609M.m5023s(yq7.m3424F(((ECPrivateKey) m25140c.getPrivate()).getS().toByteArray()));
        return (yk7) m3609M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return sk7.m10223N(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        w87 m5428a = x87.m5428a("AES128_GCM");
        bArr = hc7.f12420e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", hc7.m20842l(4, 5, 3, m5428a, bArr, 1));
        w87 m5428a2 = x87.m5428a("AES128_GCM");
        bArr2 = hc7.f12420e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", hc7.m20842l(4, 5, 3, m5428a2, bArr2, 3));
        w87 m5428a3 = x87.m5428a("AES128_GCM");
        bArr3 = hc7.f12420e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", hc7.m20842l(4, 5, 4, m5428a3, bArr3, 1));
        w87 m5428a4 = x87.m5428a("AES128_GCM");
        bArr4 = hc7.f12420e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", hc7.m20842l(4, 5, 4, m5428a4, bArr4, 3));
        w87 m5428a5 = x87.m5428a("AES128_GCM");
        bArr5 = hc7.f12420e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", hc7.m20842l(4, 5, 4, m5428a5, bArr5, 3));
        w87 m5428a6 = x87.m5428a("AES128_CTR_HMAC_SHA256");
        bArr6 = hc7.f12420e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", hc7.m20842l(4, 5, 3, m5428a6, bArr6, 1));
        w87 m5428a7 = x87.m5428a("AES128_CTR_HMAC_SHA256");
        bArr7 = hc7.f12420e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", hc7.m20842l(4, 5, 3, m5428a7, bArr7, 3));
        w87 m5428a8 = x87.m5428a("AES128_CTR_HMAC_SHA256");
        bArr8 = hc7.f12420e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", hc7.m20842l(4, 5, 4, m5428a8, bArr8, 1));
        w87 m5428a9 = x87.m5428a("AES128_CTR_HMAC_SHA256");
        bArr9 = hc7.f12420e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", hc7.m20842l(4, 5, 4, m5428a9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* synthetic */ void mo2559d(xt7 xt7Var) {
        tc7.m9305a(((sk7) xt7Var).m10222O());
    }
}
