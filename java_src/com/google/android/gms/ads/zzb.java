package com.google.android.gms.ads;
/* loaded from: classes.dex */
public final class zzb {
    public static int zza(AdSize adSize) {
        return adSize.m1464b();
    }

    public static int zzb(AdSize adSize) {
        return adSize.m1465a();
    }

    public static AdSize zzc(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zzd(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.m1461e(true);
        adSize.m1463c(i2);
        return adSize;
    }

    public static AdSize zze(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.m1460f(true);
        adSize.m1462d(i2);
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.m1459g();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.m1458h();
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.m1457i();
    }
}
