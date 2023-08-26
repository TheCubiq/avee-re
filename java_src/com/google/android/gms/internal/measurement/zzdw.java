package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzdw {
    public static void zza(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void zzb(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzdy.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                zza = zzdy.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
        return i;
    }

    public static int zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zza(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    private static String zza(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return zzdy.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzdy.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zza(int i, int i2, int i3) {
        String zza;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zza = zza(i, i3, "start index");
            } else {
                zza = (i2 < 0 || i2 > i3) ? zza(i2, i3, "end index") : zzdy.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }
}
