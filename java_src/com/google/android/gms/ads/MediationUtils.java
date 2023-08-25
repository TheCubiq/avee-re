package com.google.android.gms.ads;

import android.content.Context;
import com.daaw.g93;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.List;
/* loaded from: classes.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.m1458h() && !adSize.m1457i()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f), Math.round(adSize.getHeightInPixels(context) / f));
            }
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    int height2 = adSize3.getHeight();
                    double d = width;
                    Double.isNaN(d);
                    if (d * 0.5d <= width2 && width >= width2) {
                        if (adSize.m1457i()) {
                            int m1465a = adSize.m1465a();
                            if (((Integer) zzba.zzc().m23658b(g93.f10640b7)).intValue() <= width2) {
                                if (((Integer) zzba.zzc().m23658b(g93.f10651c7)).intValue() <= height2 && m1465a >= height2) {
                                    if (adSize2 == null || adSize2.getWidth() * adSize2.getHeight() <= adSize3.getWidth() * adSize3.getHeight()) {
                                        adSize2 = adSize3;
                                    }
                                }
                            }
                        } else if (!adSize.m1458h()) {
                            double d2 = height;
                            Double.isNaN(d2);
                            if (d2 * 0.7d <= height2 && height >= height2) {
                                if (adSize2 == null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if (adSize.m1464b() >= height2) {
                            if (adSize2 == null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
