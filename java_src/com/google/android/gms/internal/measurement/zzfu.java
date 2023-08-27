package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfu extends zzfx {
    public static int zza(int i, int i2, int i3) {
        if (!(i2 <= 1073741823)) {
            throw new IllegalArgumentException(zzdy.zza("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
        }
        return Math.min(Math.max(i, i2), 1073741823);
    }
}
