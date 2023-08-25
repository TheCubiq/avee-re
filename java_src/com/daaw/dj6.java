package com.daaw;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class dj6 {
    public dj6() {
        try {
            z97.a();
        } catch (GeneralSecurityException e) {
            zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        vq7 D = yq7.D();
        try {
            h87.b(d97.b(x87.a("AES128_GCM")), c87.b(D));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to generate key".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(D.n().j(), 11);
        D.q();
        return encodeToString;
    }

    @Nullable
    public static final String b(byte[] bArr, byte[] bArr2, String str, fd5 fd5Var) {
        d97 c = c(str);
        if (c == null) {
            return null;
        }
        try {
            byte[] a = ((a87) c.d(a87.class)).a(bArr, bArr2);
            fd5Var.a().put("ds", "1");
            return new String(a, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            zze.zza("Failed to decrypt ".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.decrypt");
            fd5Var.a().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    public static final d97 c(String str) {
        try {
            return h87.a(b87.b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to get keysethandle".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
