package com.daaw;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public class w71 {
    public final vl0<hi0, String> a = new vl0<>(1000);

    public String a(hi0 hi0Var) {
        String g;
        synchronized (this.a) {
            g = this.a.g(hi0Var);
        }
        if (g == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME);
                hi0Var.a(messageDigest);
                g = tq1.m(messageDigest.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.a) {
                this.a.k(hi0Var, g);
            }
        }
        return g;
    }
}
