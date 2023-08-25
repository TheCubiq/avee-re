package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.daaw.b3 */
/* loaded from: classes.dex */
public class C0803b3 {
    @Deprecated
    /* renamed from: a */
    public static byte[] m26515a(Context context, String str) {
        MessageDigest m26514b;
        PackageInfo m19341f = ez1.m22979a(context).m19341f(str, 64);
        Signature[] signatureArr = m19341f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m26514b = m26514b("SHA1")) == null) {
            return null;
        }
        return m26514b.digest(m19341f.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m26514b(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
