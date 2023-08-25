package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class yn6 {
    public final Context a;
    public final String b;
    public final String c;

    public yn6(Context context, zzchu zzchuVar) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = zzchuVar.p;
    }

    public final void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", zzs.zzq());
        map.put("app", this.b);
        zzt.zzp();
        map.put("is_lite_sdk", true != zzs.zzA(this.a) ? "0" : "1");
        List b = g93.b();
        if (((Boolean) zzba.zzc().b(g93.p6)).booleanValue()) {
            b.addAll(zzt.zzo().h().zzh().d());
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", this.c);
        if (((Boolean) zzba.zzc().b(g93.r9)).booleanValue()) {
            map.put("is_bstar", true == nt.b(this.a) ? "1" : "0");
        }
    }
}
