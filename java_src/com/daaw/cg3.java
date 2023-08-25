package com.daaw;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class cg3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr((WindowManager) a74Var.getContext().getSystemService("window"));
        int i = zzr.widthPixels;
        int i2 = zzr.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) a74Var).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        a74Var.T("locationReady", hashMap);
        k04.zzj("GET LOCATION COMPILED");
    }
}
