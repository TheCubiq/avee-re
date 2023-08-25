package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class nj6 {
    public static void a(Context context, boolean z) {
        String str;
        if (z) {
            str = "This request is sent from a test device.";
        } else {
            zzay.zzb();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + d04.E(context) + "\")) to get test ads on this device.";
        }
        k04.zzi(str);
    }

    public static void b(int i, Throwable th, String str) {
        k04.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        zzt.zzo().t(th, str);
    }
}
