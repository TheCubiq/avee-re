package com.google.android.gms.internal.measurement;

import com.mpatric.mp3agic.AbstractID3v2Tag;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzky {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b) {
        return b < -16;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b, byte b2, char[] cArr, int i) throws zzig {
        if (b < -62 || zzg(b2)) {
            throw zzig.zzh();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws zzig {
        if (zzg(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || zzg(b3)))) {
            throw zzig.zzh();
        }
        cArr[i] = (char) (((b & AbstractID3v2Tag.PICTURETYPE_DURING_PERFORMANCE) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzig {
        if (zzg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw zzig.zzh();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }
}
