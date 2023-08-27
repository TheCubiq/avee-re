package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbk {
    private static boolean zzhy = false;
    private static MessageDigest zzhz;
    private static final Object zzia = new Object();
    private static final Object zzib = new Object();
    static CountDownLatch zzic = new CountDownLatch(1);

    public static String zza(zzba zzbaVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zza;
        byte[] zzb = zzbfi.zzb(zzbaVar);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbay)).booleanValue()) {
            Vector<byte[]> zza2 = zza(zzb, 255);
            if (zza2 == null || zza2.size() == 0) {
                zza = zza(zzbfi.zzb(zzc(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)), str, true);
            } else {
                zzbg zzbgVar = new zzbg();
                zzbgVar.zzgv = new byte[zza2.size()];
                Iterator<byte[]> it = zza2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    zzbgVar.zzgv[i] = zza(it.next(), str, false);
                    i++;
                }
                zzbgVar.zzgq = zzb(zzb);
                zza = zzbfi.zzb(zzbgVar);
            }
        } else if (zzde.zzso == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] zzc = zzde.zzso.zzc(zzb, str != null ? str.getBytes() : new byte[0]);
            zzbg zzbgVar2 = new zzbg();
            zzbgVar2.zzgv = new byte[][]{zzc};
            zzbgVar2.zzfe = 2;
            zza = zzbfi.zzb(zzbgVar2);
        }
        return zzbi.zza(zza, true);
    }

    private static Vector<byte[]> zza(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] zza(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer put;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zzbfi.zzb(zzc(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[i - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(zzb(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (zzbp zzbpVar : new zzbn().zzpq) {
            zzbpVar.zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzazx(str.getBytes("UTF-8")).zzn(bArr3);
        }
        return bArr3;
    }

    public static byte[] zzb(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (zzia) {
            MessageDigest zzw = zzw();
            if (zzw == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            zzw.reset();
            zzw.update(bArr);
            digest = zzhz.digest();
        }
        return digest;
    }

    private static zzba zzc(long j) {
        zzba zzbaVar = new zzba();
        zzbaVar.zzdu = Long.valueOf((long) PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return zzbaVar;
    }

    public static void zzv() {
        synchronized (zzib) {
            if (!zzhy) {
                zzhy = true;
                new Thread(new zzbm()).start();
            }
        }
    }

    private static MessageDigest zzw() {
        boolean z;
        MessageDigest messageDigest;
        zzv();
        try {
            z = zzic.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = zzhz) != null) {
            return messageDigest;
        }
        return null;
    }
}
