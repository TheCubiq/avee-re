package com.daaw;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public class w71 {

    /* renamed from: a */
    public final vl0<hi0, String> f30970a = new vl0<>(1000);

    /* renamed from: a */
    public String m6466a(hi0 hi0Var) {
        String m7063g;
        synchronized (this.f30970a) {
            m7063g = this.f30970a.m7063g(hi0Var);
        }
        if (m7063g == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME);
                hi0Var.mo3222a(messageDigest);
                m7063g = tq1.m8858m(messageDigest.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.f30970a) {
                this.f30970a.m7061k(hi0Var, m7063g);
            }
        }
        return m7063g;
    }
}
