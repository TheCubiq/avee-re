package com.daaw;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class hd7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ id7 f12432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd7(id7 id7Var, Class cls) {
        super(cls);
        this.f12432b = id7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        byte[] m3455b;
        byte[] m3454c;
        zl7 zl7Var = (zl7) xt7Var;
        int m25235Q = zl7Var.m2121O().m25235Q() - 2;
        if (m25235Q == 1) {
            m3455b = yp7.m3455b();
            m3454c = yp7.m3454c(m3455b);
        } else if (m25235Q != 2 && m25235Q != 3 && m25235Q != 4) {
            throw new GeneralSecurityException("Invalid KEM");
        } else {
            int m17033g = ld7.m17033g(zl7Var.m2121O().m25235Q());
            KeyPair m25140c = cp7.m25140c(cp7.m25132k(m17033g));
            m3454c = cp7.m25131l(m17033g, 1, ((ECPublicKey) m25140c.getPublic()).getW());
            m3455b = ((ECPrivateKey) m25140c.getPrivate()).getS().toByteArray();
        }
        hm7 m19637N = im7.m19637N();
        m19637N.m20620u(0);
        m19637N.m20622s(zl7Var.m2121O());
        m19637N.m20621t(yq7.m3424F(m3454c));
        em7 m22492M = fm7.m22492M();
        m22492M.m23370u(0);
        m22492M.m23371t((im7) m19637N.m22315n());
        m22492M.m23372s(yq7.m3424F(m3455b));
        return (fm7) m22492M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return zl7.m2122N(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", id7.m19912k(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", id7.m19912k(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", id7.m19912k(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", id7.m19912k(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", id7.m19912k(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", id7.m19912k(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", id7.m19912k(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", id7.m19912k(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", id7.m19912k(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", id7.m19912k(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", id7.m19912k(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", id7.m19912k(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", id7.m19912k(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", id7.m19912k(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", id7.m19912k(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", id7.m19912k(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", id7.m19912k(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", id7.m19912k(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* synthetic */ void mo2559d(xt7 xt7Var) {
        ld7.m17039a(((zl7) xt7Var).m2121O());
    }
}
