package com.daaw;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public final class xj2 implements Runnable {
    public /* synthetic */ xj2(wj2 wj2Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yj2.c(MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME));
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            yj2.e.countDown();
            throw th;
        }
        yj2.e.countDown();
    }
}
