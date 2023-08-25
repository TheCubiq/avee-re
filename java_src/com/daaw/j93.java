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

    /* renamed from: a */
    public final String f14547a = (String) ua3.f28851b.m16137e();

    /* renamed from: b */
    public final Map f14548b;

    /* renamed from: c */
    public final Context f14549c;

    /* renamed from: d */
    public final String f14550d;

    public j93(Context context, String str) {
        this.f14549c = context;
        this.f14550d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14548b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put("device", zzs.zzq());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != zzs.zzA(context) ? "0" : "1");
        Future m7702b = zzt.zzm().m7702b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((ru3) m7702b.get()).f25621k));
            linkedHashMap.put("network_fine", Integer.toString(((ru3) m7702b.get()).f25622l));
        } catch (Exception e) {
            zzt.zzo().m11902u(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10818r9)).booleanValue()) {
            this.f14548b.put("is_bstar", true == C2365nt.m14839b(context) ? "1" : "0");
        }
    }

    /* renamed from: a */
    public final Context m18713a() {
        return this.f14549c;
    }

    /* renamed from: b */
    public final String m18712b() {
        return this.f14550d;
    }

    /* renamed from: c */
    public final String m18711c() {
        return this.f14547a;
    }

    /* renamed from: d */
    public final Map m18710d() {
        return this.f14548b;
    }
}
