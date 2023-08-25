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
    public final /* synthetic */ hc7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc7(hc7 hc7Var, Class cls) {
        super(cls);
        this.b = hc7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        sk7 sk7Var = (sk7) xt7Var;
        KeyPair c = cp7.c(cp7.k(tc7.c(sk7Var.O().P().Q())));
        ECPoint w = ((ECPublicKey) c.getPublic()).getW();
        al7 N = bl7.N();
        N.t(0);
        N.s(sk7Var.O());
        N.u(yq7.F(w.getAffineX().toByteArray()));
        N.v(yq7.F(w.getAffineY().toByteArray()));
        xk7 M = yk7.M();
        M.u(0);
        M.t((bl7) N.n());
        M.s(yq7.F(((ECPrivateKey) c.getPrivate()).getS().toByteArray()));
        return (yk7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return sk7.N(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
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
        w87 a = x87.a("AES128_GCM");
        bArr = hc7.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", hc7.l(4, 5, 3, a, bArr, 1));
        w87 a2 = x87.a("AES128_GCM");
        bArr2 = hc7.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", hc7.l(4, 5, 3, a2, bArr2, 3));
        w87 a3 = x87.a("AES128_GCM");
        bArr3 = hc7.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", hc7.l(4, 5, 4, a3, bArr3, 1));
        w87 a4 = x87.a("AES128_GCM");
        bArr4 = hc7.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", hc7.l(4, 5, 4, a4, bArr4, 3));
        w87 a5 = x87.a("AES128_GCM");
        bArr5 = hc7.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", hc7.l(4, 5, 4, a5, bArr5, 3));
        w87 a6 = x87.a("AES128_CTR_HMAC_SHA256");
        bArr6 = hc7.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", hc7.l(4, 5, 3, a6, bArr6, 1));
        w87 a7 = x87.a("AES128_CTR_HMAC_SHA256");
        bArr7 = hc7.e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", hc7.l(4, 5, 3, a7, bArr7, 3));
        w87 a8 = x87.a("AES128_CTR_HMAC_SHA256");
        bArr8 = hc7.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", hc7.l(4, 5, 4, a8, bArr8, 1));
        w87 a9 = x87.a("AES128_CTR_HMAC_SHA256");
        bArr9 = hc7.e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", hc7.l(4, 5, 4, a9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* synthetic */ void d(xt7 xt7Var) {
        tc7.a(((sk7) xt7Var).O());
    }
}
