package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.as3;
import com.daaw.c14;
import com.daaw.f77;
import com.daaw.j04;
import com.daaw.k04;
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        if (j04.k(context) && !j04.m()) {
            f77 zzb = new as3(context).zzb();
            k04.zzi("Updating ad debug logging enablement.");
            c14.a(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
