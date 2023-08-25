package com.google.android.gms.ads.internal.util;

import com.daaw.ib3;
import com.daaw.k04;
/* loaded from: classes.dex */
public final class zze extends k04 {
    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : k04.a.d(str)) {
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        return k04.zzm(2) && ((Boolean) ib3.a.e()).booleanValue();
    }
}
