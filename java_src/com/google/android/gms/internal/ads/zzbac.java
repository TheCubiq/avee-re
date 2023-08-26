package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbac {
    private static final Class<?> zzdpj = zzel("libcore.io.Memory");
    private static final boolean zzdpk;

    static {
        zzdpk = zzel("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzabb() {
        return (zzdpj == null || zzdpk) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzabc() {
        return zzdpj;
    }

    private static <T> Class<T> zzel(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
