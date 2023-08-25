package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public final class yj2 {
    public static boolean a;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static String a(fj2 fj2Var, String str) {
        byte[] g;
        ls7 n;
        byte[] a2 = fj2Var.a();
        if (((Boolean) zzba.zzc().b(g93.N2)).booleanValue()) {
            Vector b2 = b(a2, 255);
            if (b2 == null || b2.size() == 0) {
                g = g(f(4096).a(), str, true);
                return uj2.a(g, true);
            }
            rj2 L = sj2.L();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                L.s(yq7.F(g((byte[]) b2.get(i), str, false)));
            }
            L.t(yq7.F(e(a2)));
            n = L.n();
        } else if (ym2.a == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] a3 = ym2.a.a(a2, str != null ? str.getBytes() : new byte[0]);
            rj2 L2 = sj2.L();
            L2.s(yq7.F(a3));
            L2.u(3);
            n = L2.n();
        }
        g = ((sj2) n).a();
        return uj2.a(g, true);
    }

    public static Vector b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void d() {
        synchronized (d) {
            if (!a) {
                a = true;
                new Thread(new xj2(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.daaw.yj2.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(byte[] r6) {
        /*
            java.lang.Object r0 = com.daaw.yj2.c
            monitor-enter(r0)
            d()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.daaw.yj2.e     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.daaw.yj2.b     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.daaw.yj2.b     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yj2.e(byte[]):byte[]");
    }

    public static fj2 f(int i) {
        hi2 l0 = fj2.l0();
        l0.v(4096L);
        return (fj2) l0.n();
    }

    public static byte[] g(byte[] bArr, String str, boolean z) {
        ByteBuffer put;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = f(4096).a();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zj2[] zj2VarArr = new dl2().G2;
        int length2 = zj2VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zj2VarArr[i2].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new fq7(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
