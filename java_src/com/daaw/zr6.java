package com.daaw;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public final class zr6 {

    /* renamed from: c */
    public static final byte[] f35443c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d */
    public static final byte[] f35444d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: a */
    public final byte[] f35445a = f35444d;

    /* renamed from: b */
    public final byte[] f35446b = f35443c;

    /* renamed from: a */
    public final boolean m1962a(File file) {
        try {
            X509Certificate[][] m10443a = se2.m10443a(file.getAbsolutePath());
            if (m10443a.length == 1) {
                byte[] digest = MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME).digest(m10443a[0][0].getEncoded());
                if (Arrays.equals(this.f35446b, digest)) {
                    return true;
                }
                return !"user".equals(Build.TYPE) && Arrays.equals(this.f35445a, digest);
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (pe2 e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
