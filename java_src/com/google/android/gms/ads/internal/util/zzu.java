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
    public static final boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.o4)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.q4)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int D = d04.D(activity, configuration.screenHeightDp);
            int D2 = d04.D(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zzr.heightPixels;
            int i2 = zzr.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d = activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d);
            int round = ((int) Math.round(d + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m4)).intValue();
            return (a(i, D + dimensionPixelSize, round) && a(i2, D2, round)) ? false : true;
        }
        return false;
    }
}
