package com.daaw;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;
import org.conscrypt.EvpMdRef;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class u13 {

    /* renamed from: b */
    public static MessageDigest f28319b;

    /* renamed from: a */
    public final Object f28320a = new Object();

    /* renamed from: a */
    public final MessageDigest m8636a() {
        synchronized (this.f28320a) {
            MessageDigest messageDigest = f28319b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f28319b = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f28319b;
        }
    }

    /* renamed from: b */
    public abstract byte[] mo8635b(String str);
}
