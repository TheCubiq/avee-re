package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes2.dex */
final class zzbm implements Runnable {
    private zzbm() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzbk.zza(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            zzbk.zzic.countDown();
            throw th;
        }
        zzbk.zzic.countDown();
    }
}
