package com.daaw;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class yl2 {

    /* renamed from: a */
    public static Cipher f33771a;

    /* renamed from: b */
    public static final Object f33772b = new Object();

    /* renamed from: c */
    public static final Object f33773c = new Object();

    public yl2(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    public static final Cipher m3581c() {
        Cipher cipher;
        synchronized (f33773c) {
            if (f33771a == null) {
                f33771a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f33771a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String m3583a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f33772b) {
                m3581c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m3581c().doFinal(bArr2);
                iv = m3581c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return uj2.m8102a(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new xl2(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new xl2(this, e2);
        } catch (BadPaddingException e3) {
            throw new xl2(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new xl2(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new xl2(this, e5);
        }
    }

    /* renamed from: b */
    public final byte[] m3582b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] m8101b = uj2.m8101b(str, false);
            int length2 = m8101b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(m8101b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f33772b) {
                    m3581c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m3581c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new xl2(this);
        } catch (IllegalArgumentException e) {
            throw new xl2(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new xl2(this, e2);
        } catch (InvalidKeyException e3) {
            throw new xl2(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new xl2(this, e4);
        } catch (BadPaddingException e5) {
            throw new xl2(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new xl2(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new xl2(this, e7);
        }
    }
}
