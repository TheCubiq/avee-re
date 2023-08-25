package com.daaw;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class j93 {
    public final String a = (String) ua3.b.e();
    public final Map b;
    public final Context c;
    public final String d;

    public j93(Context context, String str) {
        this.c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put("device", zzs.zzq());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != zzs.zzA(context) ? "0" : "1");
        Future b = zzt.zzm().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((ru3) b.get()).k));
            linkedHashMap.put("network_fine", Integer.toString(((ru3) b.get()).l));
        } catch (Exception e) {
            zzt.zzo().u(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzba.zzc().b(g93.r9)).booleanValue()) {
            this.b.put("is_bstar", true == nt.b(context) ? "1" : "0");
        }
    }

    public final Context a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final Map d() {
        return this.b;
    }
}
