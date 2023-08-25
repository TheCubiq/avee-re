package com.daaw;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;
import org.conscrypt.EvpMdRef;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class u13 {
    public static MessageDigest b;
    public final Object a = new Object();

    public final MessageDigest a() {
        synchronized (this.a) {
            MessageDigest messageDigest = b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    b = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return b;
        }
    }

    public abstract byte[] b(String str);
}
