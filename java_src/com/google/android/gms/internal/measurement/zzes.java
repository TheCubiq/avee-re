package com.google.android.gms.internal.measurement;

import kotlin.UByte;
import kotlin.UShort;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
final class zzes {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & UShort.MAX_VALUE;
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r5 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        zza(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r13[r5] = zza(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(@NullableDecl Object obj, @NullableDecl Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int zza = zzeu.zza(obj);
        int i2 = zza & i;
        int zza2 = zza(obj3, i2);
        if (zza2 == 0) {
            return -1;
        }
        int i3 = i ^ (-1);
        int i4 = zza & i3;
        int i5 = -1;
        while (true) {
            int i6 = zza2 - 1;
            int i7 = iArr[i6];
            if ((i7 & i3) != i4 || !zzdu.zza(obj, objArr[i6]) || (objArr2 != null && !zzdu.zza(obj2, objArr2[i6]))) {
                int i8 = i7 & i;
                if (i8 == 0) {
                    return -1;
                }
                i5 = i6;
                zza2 = i8;
            }
        }
    }
}
