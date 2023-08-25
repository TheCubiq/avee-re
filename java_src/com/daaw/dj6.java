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
            z97.m2585a();
        } catch (GeneralSecurityException e) {
            zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            zzt.zzo().m11902u(e, "CryptoUtils.registerAead");
        }
    }

    /* renamed from: a */
    public static final String m24342a() {
        vq7 m3426D = yq7.m3426D();
        try {
            h87.m20944b(d97.m24590b(x87.m5428a("AES128_GCM")), c87.m25510b(m3426D));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to generate key".concat(e.toString()));
            zzt.zzo().m11902u(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(m3426D.m6906n().m3415j(), 11);
        m3426D.m6905q();
        return encodeToString;
    }

    @Nullable
    /* renamed from: b */
    public static final String m24341b(byte[] bArr, byte[] bArr2, String str, fd5 fd5Var) {
        d97 m24340c = m24340c(str);
        if (m24340c == null) {
            return null;
        }
        try {
            byte[] mo1998a = ((a87) m24340c.m24588d(a87.class)).mo1998a(bArr, bArr2);
            fd5Var.m22773a().put("ds", "1");
            return new String(mo1998a, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            zze.zza("Failed to decrypt ".concat(e.toString()));
            zzt.zzo().m11902u(e, "CryptoUtils.decrypt");
            fd5Var.m22773a().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public static final d97 m24340c(String str) {
        try {
            return h87.m20945a(b87.m26326b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to get keysethandle".concat(e.toString()));
            zzt.zzo().m11902u(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
