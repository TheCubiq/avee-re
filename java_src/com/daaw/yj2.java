package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class yj2 {

    /* renamed from: a */
    public static boolean f33729a;

    /* renamed from: b */
    public static MessageDigest f33730b;

    /* renamed from: c */
    public static final Object f33731c = new Object();

    /* renamed from: d */
    public static final Object f33732d = new Object();

    /* renamed from: e */
    public static final CountDownLatch f33733e = new CountDownLatch(1);

    /* renamed from: a */
    public static String m3656a(fj2 fj2Var, String str) {
        byte[] m3650g;
        ls7 m22315n;
        byte[] mo4516a = fj2Var.mo4516a();
        if (((Boolean) zzba.zzc().m23658b(g93.f10494N2)).booleanValue()) {
            Vector m3655b = m3655b(mo4516a, 255);
            if (m3655b == null || m3655b.size() == 0) {
                m3650g = m3650g(m3651f(4096).mo4516a(), str, true);
                return uj2.m8102a(m3650g, true);
            }
            rj2 m10293L = sj2.m10293L();
            int size = m3655b.size();
            for (int i = 0; i < size; i++) {
                m10293L.m11233s(yq7.m3424F(m3650g((byte[]) m3655b.get(i), str, false)));
            }
            m10293L.m11232t(yq7.m3424F(m3652e(mo4516a)));
            m22315n = m10293L.m22315n();
        } else if (ym2.f33817a == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] mo6966a = ym2.f33817a.mo6966a(mo4516a, str != null ? str.getBytes() : new byte[0]);
            rj2 m10293L2 = sj2.m10293L();
            m10293L2.m11233s(yq7.m3424F(mo6966a));
            m10293L2.m11231u(3);
            m22315n = m10293L2.m22315n();
        }
        m3650g = ((sj2) m22315n).mo4516a();
        return uj2.m8102a(m3650g, true);
    }

    /* renamed from: b */
    public static Vector m3655b(byte[] bArr, int i) {
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

    /* renamed from: d */
    public static void m3653d() {
        synchronized (f33732d) {
            if (!f33729a) {
                f33729a = true;
                new Thread(new xj2(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.daaw.yj2.f33730b.digest();
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m3652e(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f33731c) {
            m3653d();
            MessageDigest messageDigest2 = null;
            try {
                if (f33733e.await(2L, TimeUnit.SECONDS) && (messageDigest = f33730b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            throw new NoSuchAlgorithmException("Cannot compute hash");
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    /* renamed from: f */
    public static fj2 m3651f(int i) {
        hi2 m22548l0 = fj2.m22548l0();
        m22548l0.m20741v(4096L);
        return (fj2) m22548l0.m22315n();
    }

    /* renamed from: g */
    public static byte[] m3650g(byte[] bArr, String str, boolean z) {
        ByteBuffer put;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m3651f(4096).mo4516a();
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
            array = ByteBuffer.allocate(256).put(m3652e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zj2[] zj2VarArr = new dl2().f7264G2;
        int length2 = zj2VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zj2VarArr[i2].mo2203a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new fq7(str.getBytes("UTF-8")).m22399a(bArr3);
        }
        return bArr3;
    }
}
