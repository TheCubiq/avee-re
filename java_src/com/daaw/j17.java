package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class j17 {
    /* renamed from: a */
    public static int m19167a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        m19163e(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        return r2;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m19166b(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int m12803b = q17.m12803b(obj);
        int i2 = m12803b & i;
        int m19165c = m19165c(obj3, i2);
        if (m19165c != 0) {
            int i3 = i ^ (-1);
            int i4 = m12803b & i3;
            int i5 = -1;
            while (true) {
                int i6 = m19165c - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !ky6.m17316a(obj, objArr[i6]) || (objArr2 != null && !ky6.m17316a(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    m19165c = i8;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static int m19165c(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* renamed from: d */
    public static Object m19164d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* renamed from: e */
    public static void m19163e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
