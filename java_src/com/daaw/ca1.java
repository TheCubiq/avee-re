package com.daaw;

import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes.dex */
public class ca1 {
    /* renamed from: a */
    public static PublicKey m25473a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            String str2 = "Invalid key specification: " + e2;
            m25472b(str2);
            throw new IOException(str2);
        }
    }

    /* renamed from: b */
    public static void m25472b(String str) {
    }

    /* renamed from: c */
    public static boolean m25471c(PublicKey publicKey, String str, String str2) {
        String str3;
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (signature.verify(decode)) {
                    return true;
                }
                m25472b("Signature verification failed.");
                return false;
            } catch (InvalidKeyException unused) {
                str3 = "Invalid key specification.";
                m25472b(str3);
                return false;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (SignatureException unused2) {
                str3 = "Signature exception.";
                m25472b(str3);
                return false;
            }
        } catch (IllegalArgumentException unused3) {
            m25472b("Base64 decoding failed.");
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m25470d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            m25472b("Purchase verification failed: missing data.");
            return false;
        }
        return m25471c(m25473a(str), str2, str3);
    }
}
