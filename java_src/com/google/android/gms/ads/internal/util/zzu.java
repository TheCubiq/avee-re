package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.daaw.d04;
import com.daaw.g93;
@TargetApi(24)
/* loaded from: classes.dex */
public class zzu extends zzt {
    /* renamed from: a */
    public static final boolean m1323a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10780o4)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10802q4)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int m24833D = d04.m24833D(activity, configuration.screenHeightDp);
            int m24833D2 = d04.m24833D(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzr.heightPixels;
            int i2 = zzr.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d = activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d);
            int round = ((int) Math.round(d + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10758m4)).intValue();
            return (m1323a(i, m24833D + dimensionPixelSize, round) && m1323a(i2, m24833D2, round)) ? false : true;
        }
        return false;
    }
}
